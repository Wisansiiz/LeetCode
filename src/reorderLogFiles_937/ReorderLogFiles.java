package reorderLogFiles_937;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReorderLogFiles {
    public static void main(String[] args) {
        //String[] logs = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        String [] logs = {"j 7 0", "i 23", "w 346", "g q w", "o krb"};
        System.out.println(Arrays.toString(new Solution3().reorderLogFiles(logs)));
    }
}

//没实现
class Solution {
    public String[] reorderLogFiles(String[] logs) {
        int len = logs.length;
        String[] ans = new String[len];
        //建立字母字符串数组
        List<String> words = new ArrayList<>();
        //建立数字字符串数组
        List<String> nums = new ArrayList<>();
        for (String log : logs) {
            String[] strings = log.split(" ");
            //判断是否为字母表的标志
            boolean flag = strings[1].charAt(0) < '0' || strings[1].charAt(0) > '9';
            if (flag) {
                words.add(log);
            } else nums.add(log);
        }
        //归并
        int i = 0;
        for (; i < words.size(); i++) {
            ans[i] = words.get(i);
        }
        for (int j = 0; j < nums.size(); j++, i++) {
            ans[i] = nums.get(j);
        }
        return ans;
    }
    void exchange(String[] strings, int i, int j){
        String tem = strings[i];
        strings[i] = strings[j];
        strings[j] = tem;
    }
}
//class Solution2 {
//    public String[] reorderLogFiles(String[] logs) {
//        Arrays.sort(logs, new Comparator<String>() {
//            @Override
//            public int compare(String log1, String log2) {
//                String id1, id2, c1, c2;
//                boolean isNum1 = false, isNum2 = false;
//                int n1 = log1.length(), n2 = log2.length(), t = 0;
//                while(t < n1 && log1.charAt(t) != ' ') {
//                    t ++;
//                }
//                id1 = log1.substring(0, t);
//                c1 = log1.substring(t, n1);
//                isNum1 = log1.charAt(t + 1) >= '0' && log1.charAt(t + 1) <= '9';
//                t = 0;
//                while(t < n2 && log2.charAt(t) != ' ') {
//                    t ++;
//                }
//                id2 = log2.substring(0, t);
//                c2 = log2.substring(t, n2);
//                isNum2 = log2.charAt(t + 1) >= '0' && log2.charAt(t + 1) <= '9';
//                if(isNum1 != isNum2) {
//                    if(isNum1) {
//                        return 1;
//                    } else {
//                        return -1;
//                    }
//                } else if(isNum1) {
//                    return 0;
//                } else {
//                    if(c1.equals(c2)) {
//                        return id1.compareTo(id2);
//                    } else {
//                        return c1.compareTo(c2);
//                    }
//                }
//            }
//        });
//        return logs;
//    }
//}
class Solution3{
    public String[] reorderLogFiles(String[] logs) {
        //自定义排序
        Arrays.sort(logs, (o1, o2) -> {
            String name1, name2, log1, log2;
            int i = 0, len1 = o1.length(), len2 = o2.length();

            //这种方法更快
            while (o1.charAt(i) != ' '){
                i++;
            }
            i++;

            name1 = o1.substring(0, i);
            log1 = o1.substring(i, len1);
            boolean isnumber1 = log1.charAt(0) >= '0' && log1.charAt(0) <= '9';

            //这种方法慢一点
            i = 0;
            for (char c : o2.toCharArray()){
                i++;
                if (c == ' ')
                    break;
            }

            name2 = o2.substring(0, i);
            log2 = o2.substring(i, len2);
            boolean isnumber2 = log2.charAt(0) >= '0' && log2.charAt(0) <= '9';
            //如果1为数字,倒序排序,反之升序
            if (isnumber1 != isnumber2){
                if (isnumber1)
                    return 1;
                else return -1;
            }
            else if (isnumber1)
                return 0;
            else {
                if (log1.equals(log2)){
                    return name1.compareTo(name2);
                }
                else {
                    return log1.compareTo(log2);
                }
            }
        });
        return logs;
    }
}
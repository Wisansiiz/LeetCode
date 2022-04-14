package reachingPoints_780;

public class ReachingPoints {
    public static void main(String[] args) {
        int sx = 1, sy = 8, tx = 4, ty = 15;
        System.out.println(new Solution().reachingPoints(sx,sy,tx,ty));
    }
}
class Solution {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (tx > sx && ty > sy){
            if (ty > tx)
                ty %= tx;
            else
                tx %= ty;
        }
        if (ty < sy || tx < sx)
            return false;
        return sx == tx ? (ty - sy) % tx == 0 : (tx - sx) % ty == 0;
    }
}
//			解答成功:
//                    执行耗时:0 ms,击败了100.00% 的Java用户
//                    内存消耗:38.3 MB,击败了47.92% 的Java用户
package addDigits_258;

public class Answer {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int num = 38;
		System.out.print(new Solution1().addDigits(num));
	}
}
class Solution1 {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}
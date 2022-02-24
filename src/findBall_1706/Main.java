package findBall_1706;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] grid = 
//						{{1,1,1,-1,-1},
//		                {1,1,1,-1,-1},
//		                {-1,-1,-1,1,1},
//		                {1,1,1,1,-1},
//		                {-1,-1,-1,-1,-1}};
				{{1,1,1,1,1,1},
				 {-1,-1,-1,-1,-1,-1},
				 {1,1,1,1,1,1},
				 {-1,-1,-1,-1,-1,-1}};
		System.out.print(new Solution2().findBall(grid));
	}
}

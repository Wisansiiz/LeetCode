package imageSmoother_661;

public class ImageSmoother {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [][] img = {{1,1,1},{1,0,1},{1,1,1}};
		int [][] arr = new Solution().imageSmoother(img);
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
class Solution {
    public int[][] imageSmoother(int[][] img) {
    	int n = img.length, m = img[0].length;
    	int [][] ans = new int [n][m];
    	int [][] res = {{-1,-1},{0,-1},{1,-1},
    			{-1,0},{0,0},{1,0},
    			{-1,1},{0,1},{1,1}}; 
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < m; j++) {
    			int sum = 0, num = 0;
    			for(int k = 0; k < 9; k++) {
    				int i2 = i + res[k][0], j2 = j + res[k][1];
    				if(i2 < 0 || j2 < 0 || i2 >= n || j2 >= m) continue;
    				sum += img[i2][j2];
    				num++;
    			}
    			ans[i][j] = sum / num; 
    		}
    	}
    	return ans;
    }
}
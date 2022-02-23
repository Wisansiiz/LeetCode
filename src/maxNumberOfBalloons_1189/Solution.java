package maxNumberOfBalloons_1189;

import java.util.Arrays;

class Solution {
	public int maxNumberOfBalloons(String text) {
		int[] arr = new int [5];
		int n = text.length();
		for(int i = 0; i < n; i++)
		{
			if(text.charAt(i) == 'b')
				arr[0] ++;
			else if(text.charAt(i) == 'a')
				arr[1] ++;
			else if(text.charAt(i) == 'l')
				arr[2] ++;
			else if(text.charAt(i) == 'o')
				arr[3] ++;
			else if(text.charAt(i) == 'n')
				arr[4] ++;
		}
		arr[2] /= 2;
        arr[3] /= 2;
        return Arrays.stream(arr).min().getAsInt();
	}
}

package baekJoon.grid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class grid_2217 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n= Integer.parseInt(br.readLine());

		int[] k = new int[n];
		
		for(int i=0; i<n; i++) {
			k[i]=Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(k);
		
		int max=0;
		for(int i = n-1; i >= 0; i--) {
            max = Math.max(max, k[i] * (n-i));
        }
		
		System.out.println(max);
		br.close();
	}
}
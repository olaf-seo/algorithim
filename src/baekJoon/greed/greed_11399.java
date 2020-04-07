package baekJoon.greed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class greed_11399 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] p = new int[n];
		
		for(int i=0; i<n; i++) {
			p[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(p);
		
		int result=0;
		
		for(int i=0; i<n; i++) {
			result+=p[i]*(n-i);
		}
		
		System.out.println(result);
		br.close();
	}
}
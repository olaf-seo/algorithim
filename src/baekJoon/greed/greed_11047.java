package baekJoon.greed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class greed_11047 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken()), k=Integer.parseInt(st.nextToken()), i, result=0;
		
		int p[]=new int[n];
		
		for(i=0; i<n; i++) {
			p[i]=Integer.parseInt(br.readLine());
		}
		
		while(i-->0) {
			result+=k/p[i];
			k=k%p[i];
		}
		
		System.out.println(result);
		br.close();
	}
}
/*
 		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] coins= new int[n];
		
		for(int i=0; i<n; i++) {
			coins[i] = Integer.parseInt(br.readLine());
		}

		int count=0;
		for(int i=n-1; i>=0; i--) {
			count+=k/coins[i];
			k%=coins[i];
		}
		
		System.out.println(count);
		br.close();
*/
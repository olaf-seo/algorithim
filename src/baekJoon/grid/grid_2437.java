package baekJoon.grid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class grid_2437 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		long[] chu= new long[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int min=1;
		
		for(int i=0; i<n; i++) {
			chu[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(chu);
		
		for(int i=0; i<n; i++) {
			if(min<chu[i]) break;
			min+=chu[i];
		}
		
		System.out.println(min);
		
		
		br.close();
		
	}
}

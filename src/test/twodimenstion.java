package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class twodimenstion {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n=Integer.parseInt(br.readLine()), i, result=0, a, b;
		int p[][]=new int[n][2];
		
		for(i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			p[i][0]=Integer.parseInt(st.nextToken());
			p[i][1]=Integer.parseInt(st.nextToken());
		}
		
		
		for(i=0; i<n; i++) {
			System.out.println("p["+i+"][0] = " +p[i][0]);
			System.out.println("p["+i+"][1] = " +p[i][1]);
		}
		
		
		
		
	}
}
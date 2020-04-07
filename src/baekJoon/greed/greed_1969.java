package baekJoon.greed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//	https://www.acmicpc.net/problem/1969

public class greed_1969 {
	private static String calc(int a, int t, int g, int c, int max) {
		if(max==a) {
			return "A";
		}else if(max==c) {
			return "C";
		}else if(max==g) {
			return "G";
		}else  {
			return "T";
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken()), hamD=0, max;
		String[] DNA=new String[n];
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0; i<n; i++) {
			DNA[i]=br.readLine();
		}

		for(int j=0; j<m; j++) {
			int a=0,t=0,g=0,c=0;
			for(int i=0; i<n; i++) {
				
				switch (DNA[i].substring(j,j+1)) {
					case "A": a++; break;
					case "T": t++; break;
					case "G": g++; break;
					case "C": c++; break;
				}
				
			}
			max=Math.max(a>c?a:c, t>g?t:g);
			hamD+=(n-max);
			sb.append(calc(a, t, g, c, max));
		}
		System.out.println(sb);
		System.out.println(hamD);

		br.close();
	}
	
}
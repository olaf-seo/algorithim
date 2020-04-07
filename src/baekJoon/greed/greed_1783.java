package baekJoon.greed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class greed_1783 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		int visit=1;
		
		if(n==1) {
			visit=1;
		}else if(n==2) { 
			visit=Math.min(4, (m+1)/2);
		}else if(m<7) {
			visit=Math.min(4, m);
		}else {
			visit=m-2;
		}
		
		System.out.println(visit);
		br.close();
	}
}

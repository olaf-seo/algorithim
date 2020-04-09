package baekJoon.greed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class greed_17509 {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int p[][] =new int[11][2];
		int i=0, penalty=0;
		while(i++<11) {
			int j=i-1;
			st= new StringTokenizer(br.readLine());
			p[j][0]=Integer.parseInt(st.nextToken());
			p[j][1]=Integer.parseInt(st.nextToken());
			
			if(p[j][1]!=0) {
				penalty+=(p[j][0]+20)*p[j][1];
			}
		}
		System.out.println(penalty);
	}
}

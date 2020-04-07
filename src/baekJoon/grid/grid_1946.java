package baekJoon.grid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class grid_1946 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0) {
			int n= Integer.parseInt(br.readLine());
			int []a=new int[n+1];
			int count=1;
			
			for(int i=0; i<n;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int x=Integer.parseInt(st.nextToken());
				int y=Integer.parseInt(st.nextToken());
				a[x]=y;
			}
			
			int temp=a[1];
			
			for(int i=2; i<=n; i++) {
				if(temp>a[i]) {
					count++;
					temp=a[i];
				}
			}
			
			System.out.println(count);
		}
	}
}

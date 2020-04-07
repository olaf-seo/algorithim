package baekJoon.grid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class grid_1138 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] p = new int[n];
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			p[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=n-1; i>=0; i--) {
			list.add(p[i],i);
		}
		
		for(int k:list) {
			System.out.print(k+1+" ");
		}
		
		br.close();
	}

}

package baekJoon.greed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class greed_1449 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n,l,result=1;
		
		n=Integer.parseInt(st.nextToken());
		l=Integer.parseInt(st.nextToken());
	
		List<Integer> hole = new ArrayList<Integer>();
		
		st = new StringTokenizer(br.readLine());
		while(n-->0) {
			hole.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(hole);
		
		int A = hole.remove(0);
		
		while(!hole.isEmpty()) {
			int B= hole.remove(0);
			
			if(B-A<=l-1)continue;
			A=B;
			result++;
		}
		System.out.println(result);
		
		br.close();
	}
}



/*
for(i=0; i<n;) {
	for(j=n-1; j>=0; j--) {
		int s=p[j]-p[i];
		if(s+1<=l) {
			i=j;
			j=n-1;
			result++;
			break;
		}
	}
	if(i==j) {
		break;
	}
}
*/
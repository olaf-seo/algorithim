package baekJoon.greed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class greed_1120 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String[] a=(st.nextToken()).split("");
		String[] b=(st.nextToken()).split("");
		
		int end=b.length-a.length+1;
		int max=0, result = 0;
		
		int p[] = new int[end];
		
		for(int j=0; j<end; j++) {
			for(int i=0; i<a.length; i++) {
				if(b[i+j].equals(a[i])) {
					p[j]++;
				}
			}
			max=Math.max(max, p[j]);
			result=a.length-max;
		}
		
		System.out.println(result);
		
		
	}
}

/*
 for(int k=0;k<=B.length()-A.length();k++) {
			int temp=0;
			for(int i=0;i<A.length();i++) {
				if(A.charAt(i)==B.charAt(i+k)) temp++;
			}
			if(temp>max) 
				max=temp;	
		}
		
		
		
		
		
*/

package baekJoon.greed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class greed_4796_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		
		int l,p,v,result=0,i=1;
		
		while(true) {
			st= new StringTokenizer(br.readLine());
			l=Integer.parseInt(st.nextToken());
			p=Integer.parseInt(st.nextToken());
			v=Integer.parseInt(st.nextToken());
			if(l==0)break;
			for(int j=0;j<v;) {
				result+=1;
				j+=1;
				if(j>=v) result-=j-v;
				j+=p-l;
			}
			
			System.out.println("case "+i+": "+result);
			i++;
			
		}
		
		
		
	}
}

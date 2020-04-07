package baekJoon.greed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class greed_4796 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		
		int l,p,v,result,i=1;
		
		while(true) {
			st= new StringTokenizer(br.readLine());
			l=Integer.parseInt(st.nextToken());
			p=Integer.parseInt(st.nextToken());
			v=Integer.parseInt(st.nextToken());
			if(l==0)break;
			result= (v/p)*l+Math.min(l, v%p);
			System.out.println("Case "+i+": "+result);
			i++;
		}
	}
}


/*		[l<p<v]
 * l p v =0 으로 가면 나감 
 l p v	(p<v)(l<v)
 5 8 20
 1. v/p =2  =>> v/p*l =10
 2. v- v/p*p= 20 - 16 = 4
 3. (v- v/p*p)<l	v- v/p*p
 1+3 =>14


 l p v
 2 6 15
 답 : 6
 1. v/p = 2 = >> v/p*l=2
 2. v-v/p*p=15 -12 =3
 3. (v-v/p*p = v%p)> l   l  
*/
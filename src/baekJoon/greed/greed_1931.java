package baekJoon.greed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class greed_1931 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		int [][] p = new int[n][2];
		
		int min =-1;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			p[i][0] =Integer.parseInt(st.nextToken());
			p[i][1] =Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(p, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]) {
					return o1[0]-o2[0];
//					return Integer.compare(o2[0], o1[0]);
				}else {
					return o1[1]-o2[1];
//					return Integer.compare(o2[1], o1[1]);
				}
			}
		});
		
//		for(int j=0; j<n;	j++) {
//			System.out.print("p[j][0] = " +p[j][0] + "//");
//			System.out.println("p[j][1] = " +p[j][1]);
//		}
		
		int end = -1;
		int count = 0;
		
		for(int i=0; i<n; i++) {
			if(p[i][0]>=end) {
				end=p[i][1];
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}

/*
@Override
public int compare(int[] o1, int[] o2) {
	if(o1[1]==o2[1]) {
		return o2[0]-o1[0];
=		return Integer.compare(o2[0], o1[0]);
	}else {
		return o2[1]-o1[1];
=		return Integer.compare(o2[1], o1[1]);					
	}
}

p[j][0] = 12//p[j][1] = 14
p[j][0] = 2//p[j][1] = 13
p[j][0] = 8//p[j][1] = 12
p[j][0] = 8//p[j][1] = 11
p[j][0] = 6//p[j][1] = 10
p[j][0] = 5//p[j][1] = 9
p[j][0] = 3//p[j][1] = 8
p[j][0] = 5//p[j][1] = 7
p[j][0] = 0//p[j][1] = 6
p[j][0] = 3//p[j][1] = 5
p[j][0] = 1//p[j][1] = 4


@Override
public int compare(int[] o1, int[] o2) {
	if(o1[0]==o2[0]) {
		return o2[1]-o1[1];
	}else {
		return o2[0]-o1[0];
	}
}

p[j][0] = 12//p[j][1] = 14
p[j][0] = 8//p[j][1] = 12
p[j][0] = 8//p[j][1] = 11
p[j][0] = 6//p[j][1] = 10
p[j][0] = 5//p[j][1] = 9
p[j][0] = 5//p[j][1] = 7
p[j][0] = 3//p[j][1] = 8
p[j][0] = 3//p[j][1] = 5
p[j][0] = 2//p[j][1] = 13
p[j][0] = 1//p[j][1] = 4
p[j][0] = 0//p[j][1] = 6





*/
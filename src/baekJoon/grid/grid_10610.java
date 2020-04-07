package baekJoon.grid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class grid_10610 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int[] numCountArr=new int[10];
		int total=0;
		
		for(int i=0; i<input.length(); i++) {
			int num=Integer.parseInt(input.substring(i,i+1));
			numCountArr[num] +=1;
			total+=num;
		}
		
		if(!input.contains("0") || total%3!=0) {
			System.out.println("-1");
			return;
		}
		
		StringBuilder sb= new StringBuilder();
		for(int i=9; i>=0; i--) {
			while(numCountArr[i]> 0) {
				sb.append(i);
				numCountArr[i]--;
			}
		}
		System.out.println(sb);
		
		br.close();
	}
}
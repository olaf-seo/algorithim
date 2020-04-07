package baekJoon.grid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class grid_1541 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input=br.readLine().split("\\-");
		
		int result=0;
		
		for(int i=0; i<input.length; i++) {
			int calcNum = calc(input[i]);
			
			if(i==0) calcNum*=-1;
			result -= calcNum;
		}
		System.out.println(result);
		
		br.close();
	}
	
	private static int calc(String input) {
		int result=0;
		String[] subInput=input.split("\\+");
		
		for(String num: subInput) {
			result+=Integer.parseInt(num);
		}
		
		return result;
	}
	
}

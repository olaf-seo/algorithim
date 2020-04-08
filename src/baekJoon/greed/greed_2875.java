package baekJoon.greed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//	https://www.acmicpc.net/problem/2875

public class greed_2875 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		
		int count=0;
		
		while(m-->0) {
			if(n<2) { 		//	�ڡڡڡڡڡڡ�
				break;
			}
			n-=2;
			count++;
		}
		m++;	//	�ڡڡڡڡڡڡڡڡڡڡڡڡ�
		
		System.out.println("n = "+n);
		System.out.println("m = "+m);
		
		while(n+m<k) {
			count--;
			n+=2;
			m++;
		}
		
		System.out.println(count);
		
	}
}


/*
 ���ش��б������� ��ȸ�� ���� �� 2���� ���л��� 1���� ���л��� ���� �Ἲ�ؼ� ������ ���� ��Ģ�̴�. (�������� ����Բ� ���޾�� ���� ���ڴ�.)
 
���ش��б��� �پ ������� ���� ���ؿ��� N���� ���л��� M���� ���л��� ������ ã�� �ִ�. ��ȸ�� �����Ϸ��� �л��� �� K���� �ݵ�� ���Ͻ� ���α׷��� �����ؾ� �Ѵ�. ���Ͻ��� �����ϴ� �л��� ��ȸ�� �������� ���Ѵ�.

���ش��б������� �پ ������� ���� ������, ���� ���� ����� ���� �ּ��̴�.

�������� ���л��� �� N, ���л��� �� M, ���Ͻ��� �����ؾ��ϴ� �ο� K�� �־��� �� ���� �� �ִ� �ִ��� �� ���� ���ϸ� �ȴ�.

�Է�
ù° �ٿ� N, M, K�� ������� �־�����. (0 �� M �� 100, 0 �� N �� 100, 0 �� K �� M+N),

���
���� �� �ִ� ���� �ִ� ������ ����ϸ� �ȴ�.

���� �Է� 1 
6 3 2
���� ��� 1 
2
*/
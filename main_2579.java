package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class main_2579 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] stairs;
	static int[] answer;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		stairs = new int[n];
		answer = new int[n];
		for (int i = 0; i < n; i++) {
			stairs[i] = Integer.parseInt(br.readLine());
		}
		answer[0] = stairs[0];
		answer[1] = stairs[0] + stairs[1];
		answer[2] = Math.max(stairs[0]+stairs[2],stairs[1]+stairs[2]);
		//한칸 뛰고 온건지, 안뛰고 온건지 체크 
		/**
		 * s 10 20 15 25 10 20 
		 * 
		 * a 10 30 35 비교(a0 + 15+ 25, a1 + 25) ... so on
		 */
		for(int i = 3; i<stairs.length;i++)
		{
			answer[i] = Math.max(answer[i-3] + stairs[i-1] + stairs[i],answer[i-2]+stairs[i]);
		}
		
		System.out.println(answer[n-1]);
	}

}

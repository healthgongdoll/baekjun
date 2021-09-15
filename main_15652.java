package eecs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class main_15652 {

	public static int n, m;
	public static int[] answer;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		answer = new int[m];
		backtracking(0,1);
		
		bw.flush();
		bw.close();
	}

	public static void backtracking(int curr, int prev)throws IOException {
		if (curr == m) {
			for (int i = 0; i < m; i++) {
				bw.write(answer[i] + " ");
			}
			bw.write("\n");
			return;
		}

		for (int i = prev; i <= n; i++) {
			answer[curr] = i;
			backtracking(curr + 1, i);
		}
	}
}

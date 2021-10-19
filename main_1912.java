package eecs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class main_1912 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int[] board;
	static int[] answer;

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		board = new int[n];
		for (int i = 0; i < n; i++) {
			board[i] = Integer.parseInt(st.nextToken());
		}

		answer = new int[n];
		answer[0] = board[0];
		for (int i = 1; i < n; i++) {
			answer[i] = Math.max(board[i], answer[i - 1] + board[i]);

		}

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (answer[i] > max) {
				max = answer[i];
			}
		}

		wr.write(String.valueOf(max));
		wr.flush();
		wr.close();

	}
}

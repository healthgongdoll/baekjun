package eecs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class main_11053 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int[] board;

	public static void main(String[] args) throws IOException {

		int n = Integer.parseInt(br.readLine());
		board = new int[n];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {

			board[i] = Integer.parseInt(st.nextToken());
		}

		int[] answer = new int[n];

		for (int i = 0; i < n; i++) {
			answer[i] = 1;
			for (int j = 0; j < i; j++) {
				if (board[i] > board[j]) {
					answer[i] = Math.max(answer[i], answer[j] + 1);
				}
			}
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (max < answer[i]) {
				max = answer[i];
			}
		}

		wr.write(String.valueOf(max));
		wr.flush();
		wr.close();
	}
}

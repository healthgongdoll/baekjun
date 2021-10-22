package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class main_11055 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int[] board;
	static int[] answer;

	public static void main(String[] args) throws NumberFormatException, IOException {
		//ÀÔ·Â°ª
		int m = Integer.parseInt(br.readLine());
		board = new int[m];
		answer = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			board[i] = Integer.parseInt(st.nextToken());
		}
		
		answer[0] = board[0];
		for (int i = 1; i < m; i++) {
				answer[i] = board[i];
				for (int j = 0; j < i; j++) {
					if (board[j] < board[i]) {
						answer[i] = Math.max(answer[i],answer[j]+board[i]);
					}
				}
		}

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] > max) {
				max = answer[i];
			}
		}
		wr.write(String.valueOf(max));
		wr.flush();
		wr.close();
	}
}

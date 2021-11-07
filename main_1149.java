package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class main_1149 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int[][] board;
	static int[][] min;

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		board = new int[n][3];
		min = new int[n][3];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		min[0][0] = board[0][0];
		min[0][1] = board[0][1];
		min[0][2] = board[0][2];
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				min[i][j] = Integer.MAX_VALUE;
				for (int k = 0; k < 3; k++) {
					if (j != k) {
						min[i][j] = Math.min(min[i][j], min[i-1][k]+board[i][j]);
					}
				}
			}
		}
		int answer = Integer.MAX_VALUE;
		for(int i = 0; i<3; i++)
		{
			if(min[n-1][i] < answer)
			{
				answer = min[n-1][i];
			}
		}
		wr.write(String.valueOf(answer));
		wr.flush();
		wr.close();
	}

}

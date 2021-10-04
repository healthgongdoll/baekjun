package eecs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class main_11724 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int[][] board;
	static boolean[] visited;
	static int startpoint;
	static int count = 0;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int u = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		board = new int[u + 1][u + 1];
		visited = new boolean[u + 1];
		for (int i = 0; i < v; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			board[n][m] = 1;
			board[m][n] = 1;
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}

		for (int i = 1; i <= u; i++) {
			if(visited[i] == false)
			{
				dfs(i, u);
				count++;
			}
		}
		System.out.println(count);
	}

	public static void dfs(int point, int node) {
	
		visited[point] = true;
		
		for (int i = 1; i <= node; i++) {
			if (visited[i])
				continue;
			if (board[point][i] != 1)
				continue;
			dfs(i, node);

		}
	}

}

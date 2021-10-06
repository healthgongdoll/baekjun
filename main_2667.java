package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class main_2667 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int count = 0;
	static boolean[][] visited;
	static int[][] board;
	static int totalCount = 0;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		board = new int[m][m];
		visited = new boolean[m][m];
		for (int i = 0; i < m; i++) {
			String[] input = br.readLine().split("");
			for (int j = 0; j < m; j++) {
				board[i][j] = Integer.parseInt(input[j]);
			}
		}
		ArrayList<Integer> answer = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				if (board[i][j] == 1 && visited[i][j] == false) {
					count++;
					dfs(i, j, m);
					answer.add(totalCount);
					totalCount = 0;
				}

			}

		}
		System.out.println(count);
		answer.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2)
			{
				return Integer.compare(o1, o2);
			}
		});
		for(int i : answer)
		{
			System.out.println(i);
		}

	}

	public static void dfs(int currentX, int currentY, int m) {
		if (currentX < 0 || currentY < 0 || currentX >= m || currentY >= m || board[currentX][currentY] != 1
				|| visited[currentX][currentY] != false) {
			
			return;
		}
		visited[currentX][currentY] = true;
		totalCount++;
 		dfs(currentX + 1, currentY, m);
		
		dfs(currentX - 1, currentY, m);
		
		dfs(currentX, currentY + 1, m);

		dfs(currentX, currentY - 1, m);
		
	}

}

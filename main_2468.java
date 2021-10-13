package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class main_2468 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int[][] board;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		board = new int[n][n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int limit = 1;
		int count = 0;
		int max = 0;
		for (int i = limit; i <= 100; i++) {
			visited = new boolean[n][n];
			for (int x = 0; x < n; x++) {
				for (int y = 0; y < n; y++) {
					if(board[x][y] > i && visited[x][y] == false)
					{
						count = count +1;
						dfs(x,y,n,i);
					}
				}
			}
			if(max < count)
			{
				max = count;
			}
			count = 0; 
		}
		
		System.out.println(max);

	}
	
	public static void dfs(int currentX,int currentY,int n, int limit)
	{
		if(currentX < 0 || currentY <0 || currentX >=n || currentY >= n || board[currentX][currentY] <= limit || visited[currentX][currentY] == true) {
			return;
		}
		
		visited[currentX][currentY] = true;
		
		dfs(currentX+1,currentY,n,limit);
		dfs(currentX-1,currentY,n,limit);
		dfs(currentX,currentY+1,n,limit);
		dfs(currentX,currentY-1,n,limit);
	}
}

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
				board[i][j] = Integer.parseInt(st.nextToken());		//입력값 집어넣음
			}
		}

		int limit = 0;		// 1 ~ 100 
		int count = 0;
		int max = 0;
		for (int i = limit; i <= 100; i++) {
			visited = new boolean[n][n];		// 매 높이마다 초기화를 해줘야됨 
			for (int x = 0; x < n; x++) {
				for (int y = 0; y < n; y++) {
					if(board[x][y] > i && visited[x][y] == false)		// board[x][y] > i 높이 && 처음방문일경우 : 들어갑니다
					{
						count = count +1;		// 섬의 갯수
						dfs(x,y,n,i);			//dfs 돌기
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

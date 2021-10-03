package eecs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class main_4963 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int count = 0; 
	static boolean [][]visited;
	static int[][] board;

	public static void main(String[] args) throws IOException {
		while (true) {
			st = new StringTokenizer(br.readLine());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			board = new int[h][w];

			if (w == 0 && h == 0) {
				break;
			}
			for (int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < w; j++) {
					board[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			visited = new boolean[h][w];
			for(int i = 0; i<h; i++)
			{
				for(int j = 0; j<w; j++)
				{
					if(board[i][j] == 1 && visited[i][j] == false)
					{
						count++;
						dfs(i,j,h,w);
					}
				}
			}
			
			wr.write(String.valueOf(count));
			wr.newLine();
			wr.flush();
			count = 0;

		}
		wr.close();
	}
	
	public static void dfs(int currentX, int currentY, int height, int width)
	{
		if(currentX <0 || currentY<0 || currentX >= height || currentY>=width || board[currentX][currentY] != 1 || visited[currentX][currentY] == true )
		{
			return;
		}
//		if(visited[currentX][currentY] != true)
//		{
//			count++;
//		}
		dfs(currentX,currentY+1,height,width);
		visited[currentX][currentY] = true;
		dfs(currentX,currentY-1,height,width);
		visited[currentX][currentY] = true;
		dfs(currentX-1,currentY,height,width);
		visited[currentX][currentY] = true;
		dfs(currentX+1,currentY,height,width);
		visited[currentX][currentY] = true;
		dfs(currentX+1,currentY+1,height,width);
		visited[currentX][currentY] = true;
		dfs(currentX+1,currentY-1,height,width);
		visited[currentX][currentY] = true;
		dfs(currentX-1,currentY+1,height,width);
		visited[currentX][currentY] = true;
		dfs(currentX-1,currentY-1,height,width);
		visited[currentX][currentY] = true;
	}

}

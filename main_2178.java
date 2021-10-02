package eecs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class main_2178 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int[][] movement = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } }; 

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] miro = new int[n + 1][m + 1];
		int count = 1;

		for (int i = 1; i <= n; i++) {
			String[] input = br.readLine().split("");
			for (int j = 1; j <= m; j++) {
				miro[i][j] = Integer.parseInt(input[j - 1]);
				miro[i][j] = miro[i][j] == 1 ? Integer.MAX_VALUE : miro[i][j];
			}
		}
		miro[1][1] = 1;
		int startX = 1;
		int startY = 1;
//		// printout

		Queue<int[]> queue = new LinkedList<>(); // bfs
		queue.add(new int[] { startX, startY });

		while (!queue.isEmpty()) {
			int[] currentLocation = queue.poll(); //StartXStartY
			if (currentLocation[0] == n && currentLocation[1] == m) {  //n,m
				break;
			}
			for (int j = 0; j < 4; j++) { //4방향체크
				int nextX = currentLocation[0] + movement[j][0]; // 
				int nextY = currentLocation[1] + movement[j][1];

				if (nextX > 0 && nextY > 0 && nextX <= n && nextY <= m && miro[nextX][nextY] != 0) {
					if (miro[nextX][nextY] > miro[currentLocation[0]][currentLocation[1]]+1) {
						queue.add(new int[] { nextX, nextY });
						miro[nextX][nextY] = miro[currentLocation[0]][currentLocation[1]]+1;
					}
				}
			}
		}
			
		wr.write(String.valueOf(miro[n][m]));
		wr.flush();
		wr.close();
		
	}

}

package eecs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class main_1260 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int edge;
	static int node;
	static int startpoint;
	static int [][]array;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		node = Integer.parseInt(st.nextToken());
		edge = Integer.parseInt(st.nextToken());
		startpoint = Integer.parseInt(st.nextToken());
		visited = new boolean[node + 1];
		array = new int[node + 1][node + 1];
		// 배열 초기화
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = 0;
			}
		}

		for (int i = 0; i < edge; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			array[n][m] = 1;
			array[m][n] = 1;
		}
		
		dfs(startpoint);
		Arrays.fill(visited, false);
		wr.newLine();
		bfs(startpoint);
		wr.flush();
		wr.close();
	}

	public static void dfs(int point) throws IOException {
		visited[point] = true;
		wr.write(point + " ");
		for(int i = 1; i<=node;i++)
		{
			if(visited[i])continue;
			if(array[point][i] != 1)continue;
			dfs(i);
		}
	}
	public static void bfs(int point) throws IOException{
		Queue<Integer> queue = new LinkedList<>();
		queue.add(point);
		visited[point] = true;
		while(!queue.isEmpty())
		{
			int now = queue.poll();
			wr.write(now + " ");
			for(int i = 1; i <=node;i++)
			{
				if(visited[i]) continue;
				if(array[now][i] != 1)continue;
				visited[i] = true;
				queue.add(i);
			}
		}
		
	}
}

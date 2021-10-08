package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class main_1325 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static ArrayList<Integer>[] board;
	static boolean[] visited;
	static int count = 0;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		board = new ArrayList[n+1];
		for(int i = 1; i<=n ; i++)
		{
			board[i] = new ArrayList<>();
		}
		
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int firstNode = Integer.parseInt(st.nextToken());
			int secondNode = Integer.parseInt(st.nextToken());
			board[secondNode].add(firstNode);
		}

		ArrayList<Integer> answer = new ArrayList<>();
		int max = 0;
		
		for (int i = 1; i <= n; i++) {
			
				visited = new boolean[n + 1];
				visited[i] = true;
				dfs(i,n);
				answer.add(count);
				count = 0;
				
		}
		
		for(int i = 0; i<answer.size(); i++)
		{
			max = answer.get(i) > max ? answer.get(i) : max;
		}
		
		for(int i = 0; i<answer.size();i++)
		{
			if(answer.get(i) == max)
			{
				wr.write(String.valueOf(i+1)+ " ");
			}
		}
		wr.flush();
		wr.close();
	}

	public static void dfs(int point, int n) {
		
		count++;
		for(int i : board[point])
		{
			if(visited[i] == true) continue;
			visited[i] = true;
			dfs(i,n);
		}
	}
}
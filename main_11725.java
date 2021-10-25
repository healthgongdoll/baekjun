package eecs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class main_11725 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	static int[] parent;
	static boolean[] visited;
	static ArrayList<Integer>[] tree;

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		tree = new ArrayList[n + 1];
		for (int j = 1; j < n + 1; j++) {
			tree[j] = new ArrayList<>();
		}
		for (int i = 0; i < n - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());

			tree[l].add(r);
			tree[r].add(l);

		}

		Queue<Integer> queue = new LinkedList<>();
		visited = new boolean[n + 1];
		parent = new int[n + 1];
		queue.add(1);
		visited[1] = true;
		while (!queue.isEmpty()) {
			int now = queue.poll();
			
			for(int i = 0; i<tree[now].size();i++)
			{
				int next = tree[now].get(i);
				if(visited[next] == false)
				{
					parent[next] = now;
					visited[next] = true;
					queue.add(next);
				}
			}
		}

		for (int i = 2; i <= n; i++) {
			wr.write(String.valueOf(parent[i]));
			wr.newLine();
		}
		wr.flush();
		wr.close();
	}

}

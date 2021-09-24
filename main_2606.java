package baekjun;
//Jay Chung
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class main_2606 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	static int n,m,node1, node2;
	static int[][] cg;
	static StringTokenizer st;
	static int startingpoint = 1;
	static boolean []visited;
	static int count = 0;
	public static void main(String[]args) throws IOException
	{
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		cg = new int[n+1][n+1];
		visited = new boolean[n+1];
		
		for(int i = 0; i<m; i++)
		{
			st = new StringTokenizer(br.readLine());
			node1 = Integer.parseInt(st.nextToken());
			node2 = Integer.parseInt(st.nextToken());
			cg[node1][node2] = 1;
			cg[node2][node1] = 1;
			
		}
	/*	
		for(int i = 0; i<cg.length;i++)
		{
			for(int j = 0; j<cg[0].length;j++)
			{
				wr.write(String.valueOf(cg[i][j]));
			}
			wr.newLine();
		}
		*/
		dfs(startingpoint);
		
		wr.write(String.valueOf(count));
		
		wr.flush();
		wr.close();
	}
	
	public static void dfs(int currNode) throws IOException
	{
		visited[currNode] = true;
		for(int i = 1; i<=n; i++)
		{
			if(visited[i]) continue;
			if(cg[currNode][i] != 1)continue;
			count +=1;
			dfs(i);
			
		}
	}
}

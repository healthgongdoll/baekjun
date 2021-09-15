package eecs;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class main_15649 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static int n,m;
	public static StringTokenizer st;
	public static int[] answer;
	public static boolean [] visited;
	public static void main(String []args) throws IOException
	{
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		visited = new boolean[n+1];
		answer = new int[m];
		
		backtracking(0);
		
		bw.flush();
		bw.close();
	}
	public static void backtracking(int curr) throws IOException
	{
		if(curr == m)
		{
			for(int i = 0; i<m; i++)
			{
				bw.write(answer[i] + " ");
			
			}
			bw.write("\n");
			return;
		}
		
		for(int i = 1; i<=n; i++)
		{
			
			if(visited[i] != false)
			{
				continue;
			}
			visited[i] = true;
			answer[curr] = i;
			backtracking(curr+1); // ¿Ö ++ ÀÌ¸é index out of bound?? 
			visited[i] = false;
		}
		
	}
	
	
}
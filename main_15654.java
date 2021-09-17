package eecs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class main_15654 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int n, m;
	static int[] answer;
	static int[] numbers;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		m = input.nextInt();
		numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextInt();
		}
		
		
		Arrays.sort(numbers);
		
		
		visited = new boolean[n + 1];
		answer = new int[m];
		
		backtracking(0);
		

	}
	
	public static void backtracking(int curr)
	{
		if(curr == m)
		{
			for(int i = 0; i<m; i++)
			{
				System.out.print(answer[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i<n; i++)
		{
			if(visited[i] != false)
			{
				continue;
			}
			visited[i] = true;
			answer[curr] = numbers[i];
			backtracking(curr+1);
			visited[i] = false;
		}
		
	}

}

/*
 * package eecs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class main_15654 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int n, m;
	static int[] answer;
	static int[] numbers;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i<n; i++)
		{
			bw.write(numbers[i]);
		}
		
		
		visited = new boolean[n + 1];
		answer = new int[m];

		bw.flush();
		bw.close();
	}

	public void backtracking(int curr) {

	}
}

 */

package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class main_1965 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int[] boxes;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		boxes = new int[n];
		visited = new boolean[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			boxes[i] = Integer.parseInt(st.nextToken());
		}
		
		int [] count = new int[n];
		Arrays.fill(count, 1);
		for(int i = 0; i<n;i++)
		{
			for(int j = 0; j<i; j++)
			{
				if(boxes[j] < boxes[i])
				{
				
					count[i] = 	Math.max(count[j]+1,count[i]);
				}
			}
		}
		
		int max = 0; 
		for(int i: count)
		{
			if(i > max)
			{
				max = i;
			}
		}
		
		wr.write(String.valueOf(max));
		wr.flush();
		wr.close();

	}

}

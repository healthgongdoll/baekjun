package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class main_1929 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException
	{
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int [] arr = new int[m+1];
		arr[0] = -1;
		arr[1] = -1;
		
		for(int i = 2; i<=m; i++)
		{
			arr[i] = i;
		}
		
		for(int i = 2; i <= m; i++)
		{
			if(arr[i] == -1)
			{
				continue;
			}
			for(int j = i * 2; j<= m; j+=i)
			{
				arr[j] = -1;
			}
		}
		
		for(int i = n; i<= m; i++)
		{
			if(arr[i] != -1)
			{
			wr.write(String.valueOf(arr[i]));
			wr.newLine();
			}
		}
		wr.flush();
		wr.close();
		
		
	}

}

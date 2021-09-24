package eecs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class main_1158 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException
	{
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> answer = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		
		for(int i = 0; i<n;i++)
		{
			list.add(i+1);
		}
		int index = 0;
		
		for(int i = 0; i<n;i++)
		{
			index += k-1;
			if (index >= list.size())
			{
				index = index % list.size();
			}
			
			answer.add(list.remove(index));
			
		}

		
		System.out.print("<");
		for(int i = 0; i<answer.size()-1;i++)
		{
			System.out.print(answer.get(i));
			System.out.print(",");
			System.out.print(" ");
		}
		System.out.print(answer.get(answer.size()-1));
		System.out.print(">");
		
		
		
	}

}

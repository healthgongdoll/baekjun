package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class main_2675 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	public static void main(String[]args) throws NumberFormatException, IOException
	{
		int a = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<a; i++)
		{
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			String letter = st.nextToken();
			for(int j = 0; j<letter.length(); j++)
			{
				for(int k = 0; k<num;k++)
				{
					System.out.print(letter.charAt(j));
				}
			}
			System.out.println();
		}
	}

}

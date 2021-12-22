package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class main_10809 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[]args) throws IOException
	{
		int[] alpha = new int[26];
		boolean[] dup = new boolean[26];
		Arrays.fill(alpha, -1);
		Arrays.fill(dup, false);
		String letter = br.readLine();
		letter = letter.toUpperCase();
		for(int i = 0; i<letter.length();i++)
		{
			if(dup[(letter.charAt(i) - 'A')] == false)
			{
			alpha[(letter.charAt(i) - 'A')] = i;
			dup[(letter.charAt(i) - 'A')] = true;
			}
		}
		for(int i = 0; i<alpha.length;i++)
		{
			System.out.print(alpha[i]+" ");
		}
	}
}

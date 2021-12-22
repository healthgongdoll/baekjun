package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class main_1152 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[]args) throws IOException
	{
		String line = br.readLine();
		
		int count = 1; 
		for(int i = 1; i<line.length()-1;i++)
		{
			if(line.charAt(i) == ' ')
			{
				count++;
			}
		}
		if(line.isBlank())
		{
			count = 0;
		}
		wr.write(String.valueOf(count));
		wr.flush();
		wr.close();
	}

}

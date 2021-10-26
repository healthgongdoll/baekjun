package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class main_11654 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[]args) throws IOException
	{
		char a = br.readLine().charAt(0);
		wr.write(String.valueOf((int) a));
		wr.flush();
		wr.close();
	}
	
}

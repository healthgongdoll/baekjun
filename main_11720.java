import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class main_11720 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		String input = br.readLine();
		String number = br.readLine();
		
		int answer = 0;
		for(int i = 0; i<number.length();i++)
		{
			answer += Character.getNumericValue((number.charAt(i)));
		}
		
		wr.write(String.valueOf(answer));
		wr.flush();
		wr.close();

	}
}

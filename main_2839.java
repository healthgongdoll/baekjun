package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class main_2839 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {

		int a = Integer.parseInt(br.readLine());

		int[] answer = new int[a + 1];
		Arrays.fill(answer, -1);
		if (a > 4) {
			answer[5] = 1;
		}
		if (a > 2) {
			answer[3] = 1;
		}

		for (int i = 6; i <= a; i++) {
			if (answer[i - 3] != -1 && answer[i - 5] != -1) {
				answer[i] = Math.min(answer[i - 3] + answer[3], answer[i - 5] + answer[5]);
			} else if (answer[i - 3] == -1 && answer[i - 5] != -1) {
				answer[i] = answer[i - 5] + answer[5];
			} else if (answer[i - 3] != -1 && answer[i - 5] == -1) {
				answer[i] = answer[i - 3] + answer[3];
			}
		}

		wr.write(String.valueOf(answer[a]));
		wr.flush();
		wr.close();

	}

}

package eecs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class main_10845 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException
	{
		ArrayList<Integer> queue = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		for(int i = 0; i<m; i++)
		{
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			if(command.equals("push"))
			{
				int element = Integer.parseInt(st.nextToken());
				wr.write(String.valueOf(element) + "\n");
				queue.add(element);
				wr.flush();
			}
			if(command.equals("pop"))
			{
				if(queue.isEmpty() == true)
				{
					wr.write("-1" +"\n");
					wr.flush();
					continue;
				}
				
				wr.write(String.valueOf(queue.remove(0))+"\n");
				wr.flush();
			}
			if(command.equals("size"))
			{
				wr.write(String.valueOf(queue.size()) +"\n");
				wr.flush();
			}
			if(command.equals("empty"))
			{
				if(queue.isEmpty() == true)
				{
					wr.write("1"+"\n");
					wr.flush();
				}else
				{
					wr.write("0"+"\n");
					wr.flush();
				}
			}
			if(command.equals("front"))
			
			{
				if(queue.isEmpty() == true)
				{
					wr.write("-1"+"\n");
					wr.flush();
				}else
				{
					wr.write(String.valueOf(queue.get(0))+"\n");
					wr.flush();
				}
			}
			if(command.equals("back"))
			{
				if(queue.isEmpty() == true)
				{
					wr.write("-1" +"\n");
					wr.flush();
				}else
				{
					wr.write(String.valueOf(queue.get(queue.size()-1))+"\n");
					wr.flush();
				}
			}
			
			
		}
		
		wr.flush();
		wr.close();
		
		
	}
}

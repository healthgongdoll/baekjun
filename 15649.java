package eecs;

import java.util.Scanner;

public class hyello {
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); //4
		int m = input.nextInt(); //2
		int current = 0;
		boolean [] visited = new boolean[n+1];
		int [] answer = new int[m+1];
		backtracking(n,m,current,visited,answer);
		
	}
	
	public static void backtracking(int numbers, int boundary, int current, boolean [] visited, int []answer)
	{
	
		if(current == boundary)
		{
			for(int i = 0; i<boundary; i++)
			{
				System.out.print(answer[i]);
				System.out.print(" ");
			}
			System.out.println("");
			return;
		}
		
		for(int i = 1; i <= numbers; i++)
		{
			if(visited[i] != false)
			{
				continue;
			}
			visited[i] = true;
			
			answer[current] = i;
			
			backtracking(numbers, boundary,current+1,visited,answer);
			visited[i] = false;
		}
	}
}
	
	
	


import java.util.Scanner;
import java.util.Stack;
public class Main {

	public static void main(String[] args) {
			
		 Scanner input = new Scanner(System.in);
		 int num = input.nextInt();
		 
		 
		 
		 for(int i = 0; i<num; i++)
		 {
			 String userInput = input.next();
			 String anw = "YES";
			 Stack<Integer>st = new Stack<>();
		 	for(int j = 0; j<userInput.length();j++)
		 	{
		 		if(userInput.charAt(j) == '(') {
		 			st.push(1);
		 		}else if(userInput.charAt(j) == ')')
		 		{
		 			if(st.isEmpty())
		 			{
		 				anw = "NO";
		 				break;
		 			}else{
		 				st.pop();
		 			}
		 		}
		 	}
		 	if(!st.isEmpty()) {
		 		anw = "NO";
		 	}
		 	System.out.println(anw);
		 }
		
		 
		
		 
		 
		 
		
	}
}

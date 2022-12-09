package Java;

import java.util.Scanner;

public class Question2 {
	public static void main(String args[]){
		 try{

		 System.out.println("Enter the number");
		 Scanner sc = new Scanner(System.in);
		 int number = sc.nextInt();
		 int First =0,Second =1,result;
		 System.out.println(First + "\n" + Second);
		 for(int i=2;i<number;i++){
			 result = First + Second;
			 if(result<=number){
			 System.out.println(result);
			 First = Second ; 
			 Second = result;
			 }
			 else{
				 break;
			 }
		 }
	}catch(Exception ex){
		System.out.println("Print valid");
	}
		 
}
}

import java.util.Scanner;

public class AgeLimit{
 	public static void main(String[] args){
 	
 	Scanner sc = new Scanner(System.in);
	int age=0;\

 	System.out.print("Enter age ");
 	age = sc.nextInt();
 	//age=Math.max(age,0);
 	age=Math.min(40, age);
 	System.out.print("Age is "+age);

 	}
}
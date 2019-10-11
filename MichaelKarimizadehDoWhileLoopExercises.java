import java.util.Scanner;

public class MichaelKarimizadehDoWhileLoopExercises{
	public static void main(String[] args){
		//Exercise 2
		/*
		int num=100;
		do{
			System.out.println(num);
			num-=2;
		}
		while(num>=1);
		*/

		//Exercise 3
		/*
		int num=0;
		int total=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num (- to stop)");
		do{
			total+=num;
			num=sc.nextInt();
		}
		while(num>-1);
		System.out.println(total);
		*/

		//Exercise 4
		/*
		String answer;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Continue?");
			answer=sc.nextLine();
		}
		while(!answer.equals("y")&&!answer.equals("n"));
		*/

		//Exercise 5
		/*
		int num=0;
		int charac=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number (- to stop)");
		do{
			charac+=String.valueOf(num).length();
			num=sc.nextInt();
		}
		while(num!=-1);
		System.out.println(charac-1);
		*/

		//Exercise 6
		/*
		int num=0;
		int charac=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number (- to stop)");
		do{
			charac+=String.valueOf(num).length();
			num=sc.nextInt();
		}
		while(num>-1);
		System.out.println(charac-1);
		*/

		//Exercise 7
		/*
		int num=1;
		String charac;
		System.out.println("Unicode\tCharacter");
		do{
			charac=Character.toString((char)num);
			System.out.println(num+"\t\u2202"+charac);
			num++;
		}
		while(num>=1&&num<=212);
		*/
	}
}
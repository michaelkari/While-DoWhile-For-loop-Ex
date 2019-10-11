import java.util.Scanner;

public class MichaelKarimizadehWhileLoopExercises{
	public static void main(String[] args){
		//Exercise 4
		/*
		int num=50;
		while (num<=100){
			System.out.println(num);
			num++;
		}
		*/

		//Exercise 5
		/*
		int num=0;
		while(num<+50){
			System.out.println(num);
			num+=5;
		}
		*/

		//Exercise 6
		/*
		int num=1000;
		while (num>=200){
			System.out.println(num);
			num-=100;
		}
		*/

		//Exercise 7
		/*
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("Enter the second number");
		b=sc.nextInt();
		if(a<b){
			while(a<=b){
				System.out.print("\n"+a);
				a++;
			}
		}
		else if (a>b){
			while (a>=b){
				System.out.print("\n"+a);
				a--;
			}
		}
		else
			System.out.print("\n"+a);
			*/

		//Exercise 8
		/*
		int num=14;
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess a number from 1 to 20");
		int a=sc.nextInt();
		while(a!=num){
			System.out.println("Incorrect!");
			System.out.println("Guess again");
		    a=sc.nextInt();
		}
		System.out.println("Correct!");
		*/

		//Exercise 9
		/*
		int age=16;
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess my age");
		int a=sc.nextInt();
		while(a!=age){
			System.out.println("Incorrect!");
			System.out.println("Guess again");
		    a=sc.nextInt();
		}
		System.out.println("Correct!");
		*/

		//Exercise 10
		/*
		int num;
		int exponent=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		num=sc.nextInt();
		while(Math.pow(2,exponent)<num){
			exponent++;
		}
		System.out.println(Math.pow(2,exponent)+"="+2+"^"+exponent);
		*/
	}
}
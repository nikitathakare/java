package Demo;

import java.util.Scanner;

public class Calculator {
	int n1;
	int n2;
	char op;
	final int a =10;
	
	public Calculator(int n1,int n2,char op) {
		this.n1 = n1;
		this.n2 =n2;
		this.op = op;
	}
	
	public void Calculation(int n1,int n2,char op) {
		switch (op) {
		case '+':
			int sum = n1+n2;
			System.out.println(sum);
			 
			break;
		case '-':
			int sub ;
			if(n2> n1) {
				sub= n2-n1;
				System.out.println(sub);
			}
			else {
			sub = n1-n2;
			System.out.println(sub);
			}
			
			break;
		case '*':
			int mul = n1*n2;
			break;
			
		case '/':
			int div ;
			if(n1 == 0) {
				System.out.println('0');
			}
			else if( n2 == 0) {
				throw new ArithmeticException(" Undefine");
			}
			else {
			div = n1/n2;
			div = Math.abs(div);
			
				 System.out.println(div);}
			break;

		default:
			System.out.println("Operation Has been performed");
			break;
		}
	}
		
		public void All_operation () {
			int operation =0;
			operation =n1+n2;
			char a1= (char)n1; //explicting type casting
			int a2 = a1;//implicite type castine
			char str1 = (char)operation;
			String str2 = String.valueOf(operation);
			System.out.println("Addition is"+operation);
			
			operation =n1-n2;
			System.out.println("Subration is"+operation);
			
			operation =n1*n2;
			System.out.println("Multiplication is"+operation);
			
			operation =n1/n2;
			System.out.println("Division is"+operation);
			
			System.out.println("Final "+a);
			System.out.println(" Explicite type casting "+ a1 +" "+ str1 );
			System.out.println("Implicite type Casting "+ a2);
			System.out.println("Integer to string "+ str2);
			//System.out.println();
			
			
			
			
			
		
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		char op = sc.next().charAt(0);
		
		Calculator c1 =new Calculator(n1,n2,op);
		c1.Calculation( n1, n2, op);
		c1.All_operation();
	}

}



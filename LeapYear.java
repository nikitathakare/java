package Arrays;
import java.util.*;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int count = 0;
		int con =0;
		int year = sc.nextInt();
		int year2 = sc.nextInt();
		
		for (int i =year ;i<=year2;i++)
		
		if(i%4 ==0) {
			if(i%100==0) {
				//System.out.println("year is Leap Year");
				
			}
			if (i%400 == 0) {
				//System.out.println("Year is Leap Year");
			}
			count++;
			System.out.println("Year is Leap Year"+ i +" "+count);
			
		}
		else {
			con++;
			System.out.println("Year is not Leap year" + i+" "+con);
		}
		
		
	}
		
	}



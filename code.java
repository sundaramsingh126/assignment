package exam;

import java.util.Arrays;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int avg=0,classAvg=0, avgEng=0,avgMa=0,avgS=0;
		
		// Enter  the semester..
		System.out.println("*PLease you can fill Students details om;y 2 Semester .***");
		for(int i=1;i<=2;i++) {
			System.out.println("Enter the Semester ");
			int n1=sc.nextInt();
		
		while(true) {
			System.out.println("Enter the How many Student data you want to fill.");
			int n=sc.nextInt();
			int no=n;
			int j=0;
			int arr[]=new int[n];
			while(n>0) {
				
			System.out.print("Enter the Student Name :");
			String name=sc.nextLine();
			sc.nextLine();
			
			System.out.println("Enter the subject marks like English, Math and Science");
			int m1=sc.nextInt();
			int m2=sc.nextInt();
			int m3=sc.nextInt();
			
			int newAvg=(m1+m2+m3)/3;
			avgEng=avgEng+m1;
			avgMa=avgMa+m2;
			avgS=avgS+m3;
			
			classAvg=(classAvg+newAvg);
			arr[j]=newAvg;
			j++;
		
			n--;
			}
			System.out.println("****Result of Semesters : "+n1);
			System.out.println("Percentage of Whole class "+classAvg/no+" of "+"n1"+" semester");
			System.out.println("Students avg marks in Subject English : "+avgEng/no);
			System.out.println("Students avg marks in Subject Math : "+avgMa/no);
			System.out.println("Students avg marks in Subject Science : "+avgS/no);
			Arrays.sort(arr);
			System.out.println("Top 2 Students Percetabge :");
			System.out.println("1:"+arr[no-1]);
			System.out.println("2:"+arr[no-2]);

            break;
		}
		}
	}

}
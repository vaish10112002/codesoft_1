package codesoft2;
import java.util.Scanner;
public class std_grd_cal {
	public static void main(String[] args)
	{
		int marathi, physics, chemistry,mathematics, biology;
		float total,percentage;
	        
                @SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the marks of all subject : ");
		System.out.println("Enter marks of marathi : ");
		marathi=scan.nextInt();
		System.out.println("Enter the marks of physics : ");
		physics=scan.nextInt();
		System.out.println("Enter the marks of chemistry : ");
		chemistry=scan.nextInt();
		System.out.println("Enter the marks of mathematics : ");
		mathematics=scan.nextInt();
		System.out.println("Enter the marks of biology : ");
		biology=scan.nextInt();
		
		total= marathi+physics+chemistry+mathematics + biology;
		percentage=total/5;
		
		System.out.println("Total Marks are : "+total);
		System.out.println("Percentage is : "+percentage + "%" );
                
		
		if(percentage>=90){
			System.out.println("The Grade is : A+");
		}
		else if(percentage>=80){
			System.out.println("The Grade is : A");
		}
		else if(percentage>=70){
			System.out.println("The Grade is : B+");
		}
		else if(percentage>=50){
			System.out.println("The Grade is : B");
		}
		else if(percentage>=35){
			System.out.println("The Grade is : C");
		}
		else{
			System.out.println("Result is : Fail...");
		}
			
	}

}


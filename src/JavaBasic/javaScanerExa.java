package JavaBasic;

import java.util.Scanner;

public class javaScanerExa {
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner (System.in);
		// read 3 dcore
		
		double score1=s.nextInt();
		double score2=s.nextInt();
		double score3=s.nextInt();
	//	System.out.println("Score1" + " " +"Score2"+" "+"Score3"); //3
		
		double avgScore =(score1+score2+score3)/3;
		System.out.println("avgScore"+avgScore);
		
		if (avgScore>=80) {
			System.out.println("AvgScore is Greater than or Equal To 80");
		}else {
				System.out.println("AvgScore is not Greater than or Equal To 80");
				
			}
		
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

		
		
	
	



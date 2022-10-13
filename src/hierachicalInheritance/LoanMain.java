package hierachicalInheritance;

public class LoanMain {
	public static void main(String[] args) {
		Loan l=new Loan();
		l.m1();
		Vloan v=new Vloan();
		    v.m1();
			v.m2();
			System.out.println("_____________________________");
			Hloan h=new Hloan();
			h.m1();
			h.m3();
			System.out.println("_______________________________");
			Ploan O= new Ploan();
			O.m1();
			O.m4();
		
	}

}

package JavaBasic;

public class thisKeyword {
int a;
int b;


public void getvalues(int a,int b) {
	this.a=a;
	this.b=b;

}
public void print() {
	System.out.println(a);
	System.out.println(b);
}
public static void main(String[] args) {
	thisKeyword h=new thisKeyword();
	h.getvalues(98,56);
	h.print();
	
}	
}
			


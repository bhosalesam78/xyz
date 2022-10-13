package JavaBasic;

public class reverseString {
public static void main(String[] args) {
	

	String rev=" ";
	String Str="mom";
	
	for(int i=Str.length()-1;i>=0;i--) {
		rev=rev+Str.charAt(i);
	}
	System.out.println(rev);
	
}
}

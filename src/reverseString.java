
public class reverseString {
public static void main(String[] args) {
	String rev="";
	String Str="Sam";
	System.out.println(Str.length());
	for (int i=3-1;i>=0;i--) {
		rev=rev+ Str.charAt(i);
		
	}
	System.out.println(rev);
}
}

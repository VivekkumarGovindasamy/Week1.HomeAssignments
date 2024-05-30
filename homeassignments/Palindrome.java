package week1.homeassignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 45654;
		int b = a;
		int y = 0;
		for(int i=0;a>0; i++) {
			
			int z= a%10;
			y= (y*10)+z;
			a=a/10;
		
		}
System.out.println(y);
if(b==y) {
	System.out.println("Palindrome");
}else {
	System.out.println("Not Palindrome");
}
	}

}

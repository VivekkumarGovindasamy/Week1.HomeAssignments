package week1.homeassignments;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x =7;
int y=x/2;
int z =0;
if (x==0||x==1) {
	System.out.println("Not Prime");

for (int i=2;i<y;i++) {
	if(x % i== 0) {
		System.out.println("Not Prime");
		z=1;
		break;
	}

}
}
if (z==0) {
	System.out.println("Is Prime");
}
		 
	}

}

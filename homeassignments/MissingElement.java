package week1.homeassignments;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a ={1,4,3,2,8, 6,7};      

Arrays.sort(a);

for (int i=1;i<a.length;i++) {
	int j= i-1;
	if(a[j]!=i) {
		System.out.println("Missing Element : "+i);
		break;
	}
	
}
	}

}

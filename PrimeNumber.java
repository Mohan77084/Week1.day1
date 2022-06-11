package week1.day1.assignments;

public class PrimeNumber {
public static void main(String[] args) {
	int e =7;
	int f = 0;
	int h = e/2;
	if (e==0||e==1) {
		System.out.println("It is not a prime number");
	} else {
		for (int i = 2; i <= h ; i++) {
			if (e%i == 0) {
				f = 1;
				break;
			}
		}
		if (f==0) {
			System.out.println("It is a prime number");
		} 
	}
	
	
	
}
}

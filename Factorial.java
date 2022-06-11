package week1.day1.assignments;

public class Factorial {
public static void main(String[] args) {
	int d = 5;
	int fact = 1;
	for (; d >= 1; d--) {
		fact = fact*d;
	}
	System.out.println(fact);
}
}

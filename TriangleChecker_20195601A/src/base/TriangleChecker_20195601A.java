package base;
import java.util.*;

public class TriangleChecker_20195601A {
	
	// Validates the input
	public static boolean correctRange(double [] input) {
		return (input[0] > 0) && (input[1] > 0) && (input[2] > 0);
	}
	
	
	// checking if the triangle is an equilateral triangle 
	public static boolean check_equ_tri(double [] side) {
		return ((side[0] == side[1]) && (side[1] == side[2])) ;
	}
	
	// checking if the triangle is an isosceles triangle
	public static boolean check_isosceles_tri(double [] side) {
		return (side[0] == side[1])^(side[0] == side[2])^(side[1] == side[2]) && !(check_equ_tri(side));
	}
	
	// checking if the triangle is an scalene triangle
	public static boolean check_scalene_triangle(double [] side) {
		return !check_isosceles_tri(side) && !check_equ_tri(side);
	}
	
	// checking if the triangle is an right angled triangle
	public static boolean check_right_angled_tri(double [] side) {
		double a_sqr = side[0]*side[0];
		double b_sqr = side[1]*side[1];
		double c_sqr = side[2]*side[2];
		
		// boolean isIsosceles = check_isosceles_tri(a_side, b_side, c_side);
		return (a_sqr == b_sqr + c_sqr) || (b_sqr == a_sqr + c_sqr) || (c_sqr == a_sqr+b_sqr);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Please enter those 3 sides one by one.");
		
		Scanner sc = new Scanner(System.in);
		
		double[] inputSet = new double[3];
		
		System.out.println("Enter A side: ");
		inputSet[0] = sc.nextDouble();
		
		System.out.println("Enter B side: ");
		inputSet[1] = sc.nextDouble();
		
		System.out.println("Enter C side: ");
		inputSet[2] = sc.nextDouble();
		
		if(correctRange(inputSet)) {
			boolean flag1 = check_isosceles_tri(inputSet); 
			boolean flag2 = check_scalene_triangle(inputSet);
			boolean flag3 = check_equ_tri(inputSet);
			boolean flag4 = check_right_angled_tri(inputSet);

			if(flag4) {
				System.out.println("This is a Right angled triangle.");
			}
			if(flag3) {
				System.out.println("This is an Equilateral triangle.");
			}	
			if(flag2) {
				System.out.println("This is a Scalene triangle.");
			}
			if(flag1) {
				System.out.println("This is a Isosceles triangle.");
			}
		}
		else {
			System.out.println("At least one of the input is equal or less than 0.");
		}
	}
}

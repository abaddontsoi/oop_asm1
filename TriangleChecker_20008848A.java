import java.util.Scanner;

public class TriangleChecker_20008848A
{   
    public static void main( String[] args)
    {
        Scanner input = new Scanner ( System.in );
        
        // Input
        int side1 = 0 ;
        int side2 = 0 ;
        int side3 = 0 ;
        
        System.out.println("Please input length of the first sides of the triangle.");
        
        try {
            System.out.println("Enter A side: ");
			side1 = input.nextInt();
			
			System.out.println("Enter B side: ");
			side2 = input.nextInt();
			
			System.out.println("Enter C side: ");
			side3 = input.nextInt();
			
			input.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Invalid input detected. ");
			input.close();
        }
        
    
    
        // idenify
        if ( (side1 > side2) && (side1 > side3) ){
            if (side2 + side3 < side1){
                System.out.print("Triangle is invalid");
            }
        }
        else if ( (side2 > side1) && (side2 > side3) ){
            if (side1 + side3 < side2){
                System.out.print("Triangle is invalid");
            }
        }
        else if ( (side3 > side1) && (side3 > side2) ){
            if (side1 + side2 < side3){
                System.out.print("Triangle is invalid");
            }
        }
        
        //output
        if (side1 == side2 & side2 == side3){
            System.out.print("Euilateral Triangle");
        }
        if ( (side1 == side2) || (side2 == side3) || (side1 == side3)){
            System.out.print("Isosceles Triangle");
        }
        if ( (side1 != side2) && (side1 != side3) && (side2 != side3) ){
            System.out.print("Scalene Triangle");
        }
        if ( (side1 > side2) && (side1 > side3) ){
            if (side2*side2 + side3*side3 == side1*side1){
                System.out.print("Right angled Triangle");
            }
        }
        if ( (side2 > side1) && (side2 > side3) ){
            if (side3*side3 + side1*side1 == side2*side2){
                System.out.print("Right angled Triangle");
            }
        }
        if ( (side3 > side2) && (side3 > side1) ){
            if (side1*side1 + side2*side2 == side3*side3){
                System.out.print("Right angled Triangle");
            }
        }
    }
    }
public class MathPractice {
    public static void main(String[] args) {
        int x = 25;
        int y = -16;

       
        double squareRoot = Math.sqrt(x); 
        
        double power = Math.pow(x, 3); 

       
        int absolute = Math.abs(y);

       
        int max = Math.max(x, y);

      
        int min = Math.min(x, y); 

        // Print results
        System.out.println("Square Root of x: " + squareRoot);
        System.out.println("x raised to power 3: " + power);
        System.out.println("Absolute value of y: " + absolute);
        System.out.println("Maximum of x and y: " + max);
        System.out.println("Minimum of x and y: " + min);
    }
}

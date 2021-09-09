import java.util.Scanner;

public class MyMain {

    // Calculates the factorial of a number
    public static double factorial(int x) {
        // REPLACE WITH YOUR CODE HERE
        int e = 0;
        if (x == 0) {
            return 1;
        }
        for (int i = 0; i < x; i++) {
            e = e + x-i;
        }
        return e;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double e = 0;
        int i = 0;
        while (Math.abs(Math.E - e) > .00000000001) {
            e = e + 1/factorial(i);
            i++;
            if (i > 200) {
                break;
            }
        }
        return e;
    }

    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        // REPLACE WITH YOUR CODE HERE
        double previousvalue = 10;
        for (int i = 0;i < 20; i++) {
            previousvalue = (previousvalue + 20/previousvalue)/2;
        }
        return previousvalue;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // YOUR CODE HERE
        System.out.println("Enter Number for sqrt");
        double d = scan.nextDouble();
        System.out.println("The squareroot of "+d+" is "+babylonian(d));
        System.out.println("The value of e is roughly : "+calculateE());


        

        scan.close();
    }
}


@FunctionalInterface
interface AverageCalculator {
    

    double calculateAverage(double a, double b, double c);
}


public class AverageFunctionalInterface {

    public static void main(String[] args) {

     
        AverageCalculator avgCalc = (a, b, c) -> (a + b + c) / 3.0;

   
        System.out.println("Average of 10, 20, 30 = " + avgCalc.calculateAverage(10, 20, 30));
        System.out.println("Average of 5, 15, 25  = " + avgCalc.calculateAverage(5, 15, 25));
        System.out.println("Average of 7.5, 8.5, 9.5 = " + avgCalc.calculateAverage(7.5, 8.5, 9.5));


        AverageCalculator avgWithMessage = (a, b, c) -> {
            double avg = (a + b + c) / 3.0;
            System.out.println("Calculating average...");
            return avg;
        };

        System.out.println("\nWith message: " + avgWithMessage.calculateAverage(40, 50, 60));
    }
}
import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        float numberMeasure;
        float convertedNumber;
        String metricIdentity;
        int nextResponse;

        System.out.println("Hello! Welcome to the Metric/Imperial System Converter!");
        System.out.println("You can select from: 'C' for Celsius to Fahrenheit, 'cm' for cm to in, 'kg' for kg to oz, 'km' for km to yd, or 'kl' for kl to L");
        System.out.println("Press '1' to start the program, and type '-1' in order to quit the program");
        
        nextResponse = scanner.nextInt();

        while(nextResponse != -1) {
            System.out.println("Please enter a number, or -1 to quit");
            numberMeasure = scanner.nextFloat();
            if(numberMeasure == -1) {
                System.exit(0);
            }

            else if(numberMeasure < 0) {
                System.out.println("Please input a positive number");
                continue;
            }
            System.out.println("Please enter the metric measurement");
            metricIdentity = scanner.next();

            if(nextResponse == -1) {
                System.exit(0);
            }

            switch (metricIdentity) {
                case "C":
                convertedNumber = (float)(numberMeasure*1.8)+32;
                System.out.println(convertedNumber + " Degrees Fahrenheit");
                break;

                case "cm":
                convertedNumber = (float)(numberMeasure / 2.54);
                System.out.println(convertedNumber + " inches");
                break;

                case "kg":
                convertedNumber = (float)(numberMeasure * 35.274);
                System.out.println(convertedNumber + " ounces");
                break;

                case "km":
                convertedNumber = (float)(numberMeasure * 1093.61);
                System.out.println(convertedNumber + " yards");
                break;

                case "kl":
                convertedNumber = (float)(numberMeasure * 1000);
                System.out.println(convertedNumber + " liters");
                break;

                default:
                System.out.println("Please choose from these: 'C', 'cm', 'kg', 'km', kl'");
                break;
            }
        
        }
        scanner.close(); 
        

        

    

    
    }
}
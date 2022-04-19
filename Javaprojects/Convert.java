import java.util.Scanner;//import statement allowing user to enter inputs from the keyboard and the program reads from the keyboard

public class Convert {
    public static void main(String[] args) 
        throws Exception {
            try{
                Scanner scanner = new Scanner(System.in);//create a new scanner object
        //declaring variables
                double fahrenheit;
                double celsius;
                scanner.close();
                System.out.print("Enter d1egrees Fahrenheit:");
                fahrenheit = scanner.nextDouble();
                celsius =(fahrenheit -32.0)*5.0/9.0;
                System.out.print("The equivalent in celsius is ");
                System.out.println( celsius);
                }
                catch (Exception exception){
                    System.out.println("Exception thrown:\n" );
                }
            }
        }
    



        
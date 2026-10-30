import java.util.List;
import java.util.Scanner ;

public class Main {

    static Scanner sc = new Scanner(System.in) ;

    public static void main(String[] args){


        List<Integer> numbers = List.of(2, 3, 4);

        int result = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println(result);

        // Java banking programm

        // Declare variable

        double balance = 0 ;
        boolean isRunning = true ;
        int choice ;

        while (isRunning){
            // Display Menu
            System.out.println("================");
            System.out.println("BANKING PROGRAM");
            System.out.println("================");
            System.out.println("1. show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. WithDraw");
            System.out.println("4. Exit");
            System.out.println("----------------");


            // Get and process users choice
            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt() ;

            switch (choice){
                case 1 :
                    System.out.println("SHOW BALANCE");
                    ShowBalance(balance);
                    break;
                    // case 1 -> System.out.println("SHOW MENU") this is correct also
                case 2 :
                    System.out.println("Deposit");
                    balance += deposit() ;
                    break;
                case 3 :
                    System.out.println("WithDraw");
                    balance += withdraw(balance) ;
                    break;
                case 4 :
                    isRunning = false ;
                    System.out.println("PROCESS WAS ENDED");
                    break ;
                default:
                    System.out.println("This numebr not exist!!!");
            }

        }

        // Exit message

        sc.close();
    }

    static void ShowBalance(double balance){
        System.out.printf("Your balance is $%.2f \n" ,balance );
    }
    static double deposit(){
        double amount;
        System.out.println("Enter an amount to be deposit ");
        amount = sc.nextDouble() ;

        if(amount < 0){
            System.out.println("Amount can't be negative!!!");
            return 0 ;
        }
        else{
            return amount ;
        }

    }
    static double withdraw(double balance){

        double amount ;
        System.out.println("Enter amount to be withdrawn :");
        amount = sc.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient Funds");
            return 0 ;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0 ;
        }
        else{
            return amount ;
        }


    }

}

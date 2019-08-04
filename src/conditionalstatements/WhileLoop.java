package conditionalstatements;

public class WhileLoop
{
    //while (expression)
    // {
    // sout ("hello");
    // }

    public static void main(String[] args)
    {
        int number = 5;

        while (number > 0)
        {
            System.out.println(number);
            number -= 2; //number = number -2
        }

        System.out.println("some line here");

        /* create a while loop that checks to see if user's account balance is
        over 50.00
        within the while loop, it will print out the user's current account balance
        and then will deduct $100.00 for every time the account balance is checked
        notify the user that their balance is low as soon as their balance is under 50.00
         */

        double accountBalance = 550.75;
        double threshold = 50.00;
        double fee = 100.00;
        String message = "your account balance is low";

        while (accountBalance > threshold)
        {
            System.out.println("User's current account balance = "+'$'+accountBalance);
            accountBalance = accountBalance -fee;
        }

        System.out.println(message);
    }
}

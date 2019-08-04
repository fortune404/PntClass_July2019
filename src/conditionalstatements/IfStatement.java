package conditionalstatements;

public class IfStatement {
    public static void main(String[] args) {
        boolean isEnabled = false;

        if (isEnabled == false) {
            System.out.println("the button is enabled");
        } else {
            System.out.println("The button is disabled");
        }

        boolean pigsCanFly = true;
        boolean aliensExist = true;
        boolean earthIsRound = false;
        boolean isHuman = false;

        if (pigsCanFly == true && aliensExist == true) {
            System.out.println("we are doomed");
        }

        if (pigsCanFly == true || earthIsRound == false) {
            System.out.println("we are doomed");
        }
        System.out.println("Here");

        //AND TABLE
        //   T   F
      //T  T   F
    //F  F   F

        boolean paidBillOnTime = false;
        String customerName = "Fahim";
        double currentAccountBalance = 900.84;
        double penaltyFee = 55.85;
        String thankYouMessage = "Thanks for paying the bill on time "+ customerName;


        if (customerName.equalsIgnoreCase("Fahim") && paidBillOnTime == false)
        {
            currentAccountBalance = currentAccountBalance -penaltyFee;
            System.out.println("The new current account balance is "+currentAccountBalance);
        }else
            {
                System.out.println(thankYouMessage);
                System.out.println("your current account balance is "+ currentAccountBalance);
            }


    }
}

package conditionalstatements;

public class SwitchExpression
{
    public static void main(String[] args)
    {
        //switch (expression) {
        //      case 1:
        //          define case 1 here
        //          break;
        //      case 2:
        //          define case 2 here
        //          break;
        //      case 3:
        //          define case 3 here
        //          break;
        //       default case:
        //          define default}



        int monthNumber = 12;                           //example 1
        String month;

        switch (monthNumber)
        {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Invalid";
        }

        System.out.println("The month is "+month);



        String name1 = "raihan";                                //example 2
        double salary1;

        switch (name1)
        {
            case "imran":
                salary1 = 25000.00;
                break;
            case "ehsan":
                salary1 = 50000.00;
                break;
            case "adnan":
                salary1 = 75000.00;
                break;
            case "raihan":
                salary1 = 100000.00;
                break;
            default:
                salary1 = 0.0;
        }

        System.out.println("The salary is "+ salary1);


        String name2 = "Imran";                                //example 3
        double salary2;

        switch (name2.toLowerCase())
        {
            case "imran":
                salary2 = 25000.00;
                break;
            case "ehsan":
                salary2 = 50000.00;
                break;
            case "adnan":
                salary2 = 75000.00;
                break;
            case "raihan":
                salary2 = 100000.00;
                break;
            default:
                salary2 = 0.0;
        }

        System.out.println("The salary is "+ salary2);





        String name3 = "   EHsan    ";                                //example 4
        double salary3;

        switch (name3.toLowerCase().trim())
        {
            case "imran":
                salary3 = 25000.00;
                break;
            case "ehsan":
                salary3 = 50000.00;
                break;
            case "adnan":
                salary3 = 75000.00;
                break;
            case "raihan":
                salary3 = 100000.00;
                break;
            default:
                salary3 = 0.0;
        }

        System.out.println("The salary is "+ salary3);
    }
}

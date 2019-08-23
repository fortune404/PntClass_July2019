package enumDemo;

public class Week
{
    Day day;
    public Week(Day day)
    {
        this.day = day;
    }

    public void whatToDo()
    {
        switch (day)
        {
            case MONDAY:
                System.out.println("Start Reading Java Book");
                break;
            case TUESDAY:
                System.out.println("Start doing CodeLab ");
                break;
            case WEDNESDAY:
                System.out.println("Start joining mentoring session");
                break;
            case THURSDAY:
                System.out.println("Continue CodeLab");
                break;
            case FRIDAY:
                System.out.println("Submit Homework");
                break;
            case SATURDAY:
                System.out.println("Do Saturday class");
                break;
            case SUNDAY:
                System.out.println("Do Sunday Class");
                break;
            default:
                System.out.println("Not a valid class");
        }
    }
}

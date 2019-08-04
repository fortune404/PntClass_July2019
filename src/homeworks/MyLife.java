package homeworks;

public class MyLife
{
    String name = null;
    int studentId = 0;
    String location = null;
    String field = null;
    String email = null;


    protected void speak(String name, int studentId, String location, String field, String email)
    {
        this.name = name;
        this.studentId = studentId;
        this.location = location;
        this.field = field;
        this.email = email;

        System.out.println("Hi, my name is "+name);
        System.out.println("My student id is "+studentId+"NY");
        System.out.println("I live in "+ location);
        System.out.println("I'm trying to major on "+field);
        System.out.println("My email is "+email);
    }


    protected void eat(String food)
    {
        this.location = "SHAKE SHACK";

        if (food.equalsIgnoreCase("Cheese burger")|| food.equalsIgnoreCase("burger"))
        {
            System.out.println("I'm about to get a burger from "+location);
        }else if (food.equalsIgnoreCase("Coke"))
        {
            System.out.println("I'm about to get a drink from "+location+'.'+" I will take a Coke for today.");
        }else
            {
                System.out.println("pshhhh! THIS IS NOT SOMETHING THAT I WOULD EAT RIGHT NOW!");
            }
    }


    protected String activity(String name)
    {
        this.name = name;
        this.location = "Olympics";

        return "I'm "+name+" and I'm about to show you how fast i ran on "+location+'.';
    }


    protected int math(int num1, int num2, String type)
    {
       location = "high school";
        System.out.print("I was pretty bad in math when I was in "+location);
        System.out.println("But i won't let u down now.");

        if (type.equalsIgnoreCase("addition"))
        {
            System.out.print("Addition result: ");
          return  num2 + num1;
        }else if (type.equalsIgnoreCase("subtraction"))
        {
            System.out.print("Subtraction result: ");
            return num2 - num1;
        }else if (type.equalsIgnoreCase("multiplication"))
        {
            System.out.print("Multiplication result: ");
            return num2 * num1;
        }else if (type.equalsIgnoreCase("division"))
        {
            System.out.println("Division result: ");
            return num2 / num1;
        }
        return 0;
    }


    protected void sleep()
    {
        location = "bed.";
        System.out.println("I'm about to go to sleep in my "+location+" GOOD NIGHT!!");
    }
}

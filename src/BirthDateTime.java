import java.util.Scanner;

public class BirthDateTime
{
    public static  void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int year = SafeInput.getRangedInt(in, "Enter birth year", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter birth month", 1, 12);

        int day = 0;

        switch(month)
        {
            case 2:
                day = SafeInput.getRangedInt(in, "Enter birth day", 1, 29);
                break;
            case 4: case 6: case 9: case 11:
                day = SafeInput.getRangedInt(in, "Enter birth day", 1, 30);
                break;
            default:
                day = SafeInput.getRangedInt(in, "Enter birth day", 1, 31);
        }

        int hour = SafeInput.getRangedInt(in, "Enter hour", 1, 24);
        int minute = SafeInput.getRangedInt(in, "Enter minute", 1, 59);

        System.out.println("You were born " + month + "/" + day + "/" + year + " at " + hour + ":" + minute);
    }
}

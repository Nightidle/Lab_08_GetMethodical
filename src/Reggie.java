import java.util.Scanner;

public class Reggie
{
    public static void  main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN accepted: " + ssn);

        String mNum = SafeInput.getRegExString(in, "Enter UC M number", "^(M|m)\\d{5}$");
        System.out.println("M number accepted: " + mNum);

        String menu = SafeInput.getRegExString(in, "Enter menu choice", "^[OoSsVvQq]$");
        System.out.println("Menu choice accepted: " + menu);
    }
}

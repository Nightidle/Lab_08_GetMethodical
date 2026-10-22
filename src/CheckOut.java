import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double total = 0;
        boolean moreItems = true;

        do
        {
            double price = SafeInput.getRangedDouble(in, "Enter the price of the item", 0.50, 10);
            total += price;

            moreItems = SafeInput.getYNConfirm(in, "Do you have another item?");
        }while(moreItems);

        System.out.printf("Your total is $%.2f", total);
    }
}

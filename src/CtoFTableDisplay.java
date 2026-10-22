public class CtoFTableDisplay
{
    public static void  main(String[] args)
    {
        for (int c = -100; c <= 100; c++)
        {
            double f = CtoF(c);
            System.out.printf("%6d °C  ->  %8.2f °F\n", c, f);
        }
    }

    public static double CtoF(double celsius)
    {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

}

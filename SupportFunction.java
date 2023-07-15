public class SupportFunction
{
    public static Double parseValue(String s)
    {
        try {
            return Double.parseDouble(s);
        }
        catch(NumberFormatException e)
        {
            System.err.println(e.getMessage());
        }
        return -1.0;
    }
}

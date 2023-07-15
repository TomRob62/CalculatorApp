import java.util.ArrayList;

public class Calculator
{
    ArrayList<Double> history;
    public Calculator()
    {
        history = new ArrayList<>();
    }

    /**
     * Calculate the multiplication of a value and the most recent value in history
     * @param val1 - to be multiplied by most recent entry
     * @return result from multiplication
     */
    public double multiply(double val1)
    {
        int lastIndex = history.size();
        double result = val1* history.get(lastIndex-1);
        history.add(result);
        return result;
    }

    /**
     * Calculate the addition of a value and the most recent value in history
     * @param val1 - to be added to most recent entry
     * @return result of addition
     */
    public double add(double val1)
    {
        int lastIndex = history.size();
        double result = val1+history.get(lastIndex);
        history.add(result);
        return result;
    }

    /**
     * retrieves the value from history based on an index
     * @param index the index of the value in history list where 1 = most recent
     * @return a String value
     */
    public String getValueHistory(int index)
    {
        int calculatedIndex = history.size()-index;
        if (calculatedIndex > history.size() - 1 || calculatedIndex < 0)
        {
            return "";
        }
        Double result = history.get(calculatedIndex);
        return String.valueOf(result);
    }

    private Double getLast
}

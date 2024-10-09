public class PositiveInteger {

    private int num;

    public PositiveInteger(int number){
        num = number;
    }

    public boolean isPerfect()
    {
        if (num <= 1)
        {
            return false;
        }
        int sum = 0;

        int i = 1;

        while (i<= num/2)
        {
            if (num % i == 0)
            {
                sum += i;
            }
            i++;
        }
        return sum == num;
    }

    public boolean isAbundant() {
        if (num <= 1)
        {
            return false;
        }
        int sum = 0;
        int i = 1;

        while (i<= num/2)
        {
            if (num % i == 0)
            {
                sum += i;
            }
            i++;
        }
        return sum > num;
    }

    public boolean isNarcissistic()
    {
        if (num <= 0)
        {
            return false;
        }
        int digitsCount = 0;

        int temp = num;
        while (temp > 0)
        {
            temp /= 10;
            digitsCount++;
        }

        int sum = 0;
        temp = num;
        while (temp> 0)
        {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digitsCount);
            temp /= 10;

        }
        return sum == num;
    }

}

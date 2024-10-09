public class CoatExperimentSimulator {

    private int numberOfPeople;

    public CoatExperimentSimulator(int numPpl) {
        numberOfPeople = numPpl;
    }

    public int numPplWhoGotTheirCoat(int[] permutation)
    {
        int total = 0;
        for (int i = 0; i < numberOfPeople; i++)
        {
            if (permutation[i] == i + 1)
            {
                total ++;
            }
        }
        return total;
    }

    public int[] simulateCoatExperiment(int iterations) {
        int[] results = new int[iterations];
        for (int i = 0; i < iterations; i++)
        {
            int[] randomPerm = RandomOrderGenerator.getRandomOrder(numberOfPeople);
            results[i] = numPplWhoGotTheirCoat(randomPerm);


        }
        return results;
    }

    public double answerToQuestionOne(int[] results)
    {
        double count = 0;
        for (int i = 0; i < results.length; i++)
        {
            if (results[i] == 0)
            {
                count++;
            }
        }

        return count / results.length;
    }

    public double answerToQuestionTwo(int[] results)
    {
        double sum = 0;
        for (int i = 0; i < results.length; i++)
        {
                sum+= results[i];
        }

        return sum / results.length;
    }
}



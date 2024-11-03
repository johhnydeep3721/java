public class BadShuffle
{
    public static void main(String[] args)
    {
        String[] letters = {"A", "B", "C"};
        String[] permutations = {"ABC", "ACB", "BAC", "BCA", "CAB", "CBA"};

        int[] badCount = {0, 0, 0, 0, 0, 0};
        int[] goodCount = {0, 0, 0, 0, 0, 0};

        int trials = Integer.parseInt(args[0]);

        for(int t = 0; t < trials; t++)
        {
            //Test bad shuffle
            String[] badArr = letters.clone();
            for(int i = 0; i < 3; i++)
            {
                int r = (int)(Math.random() * 3);
                String temp = badArr[r];
                badArr[r] = badArr[i];
                badArr[i] = temp;
            }

            //Test goood shuffle
            String[] goodArr = letters.clone();
            for(int i = 0; i < 3; i++)
            {
                int r = i + (int)(Math.random() * (3 - i));
                String temp = goodArr[r];
                goodArr[r] = goodArr[i];
                goodArr[i] = temp;
            }

            String badResult = badArr[0] + badArr[1] + badArr[2];
            String goodResult = goodArr[0] + goodArr[1] + goodArr[2]; 

            for(int i = 0; i < 6; i++)
            {
                if(badResult.equals(permutations[i]))
                {
                    badCount[i]++;
                }
                if(goodResult.equals(permutations[i]))
                {
                    goodCount[i]++;
                }
            }
        }

        System.out.println("Arrangement  BadProb    GoodProb");
        System.out.println("--------------------------------");
        for(int i = 0; i < 6; i++)
        {
            double badProb = (double) badCount[i] / trials;
            double goodProb = (double) goodCount[i] / trials; 

            System.out.printf("%s          %.9f       %.9f %n", permutations[i], badProb, goodProb);
        }

        System.out.println("Expected probability of each permutations: 1/6 = 1.666666667");
    }
}
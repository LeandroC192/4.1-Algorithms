import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int twoDigits = twoDigits();
        int greater500 = greater500();
        int greatest = greatest();
        int sum = sum();
        int mean = meanAverage();
        int mode = mode();
        System.out.println(odds);
        System.out.println(evens);
        System.out.println(twoDigits);
        System.out.println(greater500);
        System.out.println(greatest);
        System.out.println(sum);
        System.out.println(mean);
        System.out.println(mode);
        s.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }
    public static int evens() throws FileNotFoundException{
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 == 0)
                evens++;
        }
        return evens;
    }
    public static int twoDigits() throws FileNotFoundException{
        s = new Scanner(f);
        int twoDigits = 0;
        while (s.hasNext()) {
            int current = s.nextInt();
            if (current >= 10 && current <= 99)
                twoDigits++;
        }
        return twoDigits;
    }
    public static int greater500() throws FileNotFoundException
    {
        s = new Scanner(f);
        int greater500 = 0;
        while (s.hasNext()) 
        {
            if (s.nextInt() > 500)
            {
                greater500++;
            }
        }
        return greater500;
    }
    public static int sum() throws FileNotFoundException
    {
        s = new Scanner(f);
        int sum = 0;
        while (s.hasNext()) 
        {
              sum += s.nextInt();
        }
        return sum;
    }
    public static int greatest() throws FileNotFoundException
    {
        s = new Scanner(f);
        int greatest = 0;
        while (s.hasNext()) 
        {
            if(s.nextInt()>greatest)
            {
                greatest = s.nextInt();
            }
        }
        return greatest;
    }
    public static int meanAverage() throws FileNotFoundException
    {
        s = new Scanner(f);
        int sum = 0;
        int amount = 0;
        while (s.hasNext()) 
        {
              sum += s.nextInt();
              amount ++;
        }
        return (sum/amount);
    }
    public static int mode() throws FileNotFoundException
    {
        s = new Scanner(f);
        ArrayList<Integer> values = new ArrayList<>();
        while (s.hasNext())
        {
            values.add(s.nextInt());
        }
        int length = values.size();
        int maxFrequency = 0;
        int maxNumber = 0;
        for (int i = 0; i < length; i++)
        {
            int count = 0;
            for (int j = 0; j < length; j++)
            {
                if (values.get(i).equals(values.get(j)))
                {
                    count++;
                }
                if (count > maxFrequency)
                {
                    maxFrequency = count;
                    maxNumber = values.get(i);
                }
            } 
        }
        return maxNumber; 
    } 
}
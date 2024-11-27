import java.util.Scanner;
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
       // int greatest = greatest();
        int sum = sum();
        System.out.println(odds);
        System.out.println(evens);
        System.out.println(twoDigits);
        System.out.println(greater500);
        //System.out.println(greatest);
        System.out.println(sum);
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
    public static int greater500() throws FileNotFoundException{
        s = new Scanner(f);
        int greater500 = 0;
        while (s.hasNext()) {
            if (s.nextInt() > 500)
                greater500++;
        }
        return greater500;
    }
    public static int sum() throws FileNotFoundException{
        s = new Scanner(f);
        int sum = 0;
        while (s.hasNext()) {
              sum += s.nextInt();
        }
        return sum;
    }
}
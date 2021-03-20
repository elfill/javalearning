import java.util.Scanner;

public class HiLowGame {

    public static void main(String[] argd)
    {
        Scanner scan = new Scanner(System.in);
        String name = new String();
        System.out.println("Введите имя");
        name = scan.next();
        System.out.println("Вы ввели имя: " + name + ".");
        String playAgain = new String();
        int attempt = 0;
        do {
            int theNumber = theNumber();
            int guess = 0;
            while (guess != theNumber)
            {
                System.out.println(name + " введите число от -100 до 100");
                guess = scan.nextInt();
                System.out.println(name + ", вы ввели число " + guess + ".");
                if (guess > theNumber) {
                    System.out.println(name + ", вы ввели число больше загаданного. Попробуйте еще раз");
                } else if (guess < theNumber) {
                    System.out.println(name + ", вы ввели число меньше загаданного. Попробуйте еще раз");
                } else {
                    System.out.println("Вы угадали!");
                }
                attempt++;
            }
            System.out.println("Вы угадали число с " + attempt + " попытки");
            System.out.println("Сыграем еще раз (y/n)");
            playAgain = scan.next();
        } while ((playAgain.equalsIgnoreCase("y")));
        }

    public static int theNumber(){
        int min = -100;
        int max = 100;
        int diapason = max + Math.abs(min) + 1;
        int theNumber = (int) (Math.random() * diapason) - max;
        return theNumber;

    }
}

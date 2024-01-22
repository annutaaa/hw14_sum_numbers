import java.util.Random;

public class homework {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10000);
        int sum = 0;

        System.out.println("Випадкове число: " + randomNumber);

        while (randomNumber > 0) {
            int temp = randomNumber % 10;
            sum += temp;
            randomNumber /= 10;
        }

        System.out.println("Сума розрядів числа: " + sum);
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        String text1 = new Scanner(System.in).nextLine();
        int firstNumber = Integer.parseInt(text1);
        System.out.println("Введите второе число: ");
        String text2 = new Scanner(System.in).nextLine();
        int secondNumber = Integer.parseInt(text2);

        //вычисляем
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double quotient = (double) firstNumber / secondNumber;

        //выводим на экран
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);


    }
}

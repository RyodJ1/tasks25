public class loops {
    public static void main(String[] args) {
        int month = 3; 
        String monthName;

        switch (month) {
            case 1:
                monthName = "Январь";
                break;
            case 2:
                monthName = "Февраль";
                break;
            case 3:
                monthName = "Март";
                break;
            case 4:
                monthName = "Апрель";
                break;
            case 5:
                monthName = "Май";
                break;
            case 6:
                monthName = "Июнь";
                break;
            case 7:
                monthName = "Июль";
                break;
            case 8:
                monthName = "Август";
                break;
            case 9:
                monthName = "Сентябрь";
                break;
            case 10:
                monthName = "Октябрь";
                break;
            case 11:
                monthName = "Ноябрь";
                break;
            case 12:
                monthName = "Декабрь";
                break;
            default:
                monthName = "Некорректный номер месяца";
                break;
        }

        System.out.println(monthName);
    }
}

public class loops {
    public static void main(String[] args) {
        int number = 7;
        while (number <= 98) {
            System.out.print(number + " ");
            number += 7;
        }
    }
}

public class test {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}

public class AverageCalculator {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30;
        int sum = num1 + num2 + num3;
        double average = sum / 3.0;

        System.out.println("Сумма: " + sum);
        System.out.println("Среднее значение: " + average);
    }
}

import java.util.Scanner;
public class NumberRangeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 20) {
            System.out.println("Число находится в диапазоне от 10 до 20");
        } else {
            System.out.println("Число не находится в диапазоне от 10 до 20");
        }
    }
}

public class RectanglePerimeter {
    public static void main(String[] args) {
        int length = 4;
        int width = 5;
        int perimeter = 2 * (length + width);

        System.out.println("Периметр прямоугольника: " + perimeter);
    }
}

public class NumberChecker {
    public static void main(String[] args) {
        int number = -5;

        if (number <= 0) {
            System.out.println("More");
        } else {
            System.out.println("Less");
        }
    }
}

import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.println("Привет, " + name + "! Как дела?");
    }
}

import java.util.Scanner;
public class FeetToInchesConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину в футах: ");
        double feet = scanner.nextDouble();
        
        double inches = feet * 12;
        System.out.println("Длина в дюймах: " + inches);
    }
}

public class HelloPrinter {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
    }
}

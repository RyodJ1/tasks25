public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 50; i += 2) {
            sum += i;
        }
        System.out.println("Sum of even numbers from 1 to 50: " + sum);
    }
}

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 4, 2};
        int count = countOccurrences(array, 2);
        System.out.println("Number of occurrences of 2: " + count);
    }
    
    public static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int num : array) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double average = calculateAverage(array);
        System.out.println("Average of array elements: " + average);
    }
    
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = countOddNumbers(array);
        System.out.println("Number of odd numbers: " + count);
    }
    
    public static int countOddNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". Your Name");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int square = i * i;
            System.out.println("Square of " + i + " is " + square);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println("Sum of natural numbers from 1 to 1000: " + sum);
    }
}

public class Main {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 7; i <= 15; i++) {
            System.out.println(i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

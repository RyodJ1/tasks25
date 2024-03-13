public class Car {
    String model;
    String color;
    int yearOfProduction;

    public Car(String model, String color, int yearOfProduction) {
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    public void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year of Production: " + yearOfProduction);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota Camry", "Silver", 2019);
        Car car2 = new Car("Honda Civic", "Blue", 2020);

        System.out.println("Information about Car 1:");
        car1.displayInfo();

        System.out.println("\nInformation about Car 2:");
        car2.displayInfo();
    }
}

public class Enu {
    String faculty;
    int id;

    public Enu(String faculty, int id) {
        this.faculty = faculty;
        this.id = id;
    }

    public static void main(String[] args) {
        Enu faculty = new Enu("FIT", 04);
        System.out.println("Faculty Name: " + faculty.faculty);
        System.out.println("ID: " + faculty.id);
    }
}

public class Weather {
    double temperature;
    String condition;

    public Weather(double temperature, String condition) {
        this.temperature = temperature;
        this.condition = condition;
    }

    public static void main(String[] args) {
        Weather report = new Weather(25.5, "Sunny");
        System.out.println("Temperature: " + report.temperature + "°C");
        System.out.println("Condition: " + report.condition);
    }
}

public class Post {
    String textContent;
    int numberOfLikes;

    public Post(String textContent, int numberOfLikes) {
        this.textContent = textContent;
        this.numberOfLikes = numberOfLikes;
    }

    public static void main(String[] args) {
        Post post = new Post("Hello, world!", 100);
        System.out.println("Post Content: " + post.textContent);
        System.out.println("Number of Likes: " + post.numberOfLikes);
    }
}

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(7.5);

        System.out.println("Circle 1 - Area: " + circle1.calculateArea() + ", Circumference: " + circle1.calculateCircumference());
        System.out.println("Circle 2 - Area: " + circle2.calculateArea() + ", Circumference: " + circle2.calculateCircumference());
    }
}

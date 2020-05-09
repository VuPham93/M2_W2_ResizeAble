import java.util.Random;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        circle = new Circle(9, "indigo", false);
        System.out.println("Pre-resize: \n" + circle);
        circle.resize(randomNumber);
        System.out.println("After-resize to " + (100 + randomNumber) + " percent: \n" + circle);
    }
}

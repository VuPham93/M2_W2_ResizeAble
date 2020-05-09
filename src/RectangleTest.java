import java.util.Random;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println("Pre-resize: \n" + rectangle);
        rectangle.resize(randomNumber);
        System.out.println("After-resize to " + (100 + randomNumber) + " percent: \n" + rectangle);
    }
}

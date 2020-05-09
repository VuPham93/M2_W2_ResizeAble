import java.util.Random;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        square = new Square(5.8, "yellow", true);
        System.out.println("Pre-resize: \n" + square);
        square.resize(randomNumber);
        System.out.println("After-resize to " + (100 + randomNumber) + " percent: \n" + square);
    }
}

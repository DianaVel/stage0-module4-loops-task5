package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int j = 0; j < height; j += 2) {
            System.out.print(" ".repeat((j) / 2));
            System.out.print("8".repeat(height-j));
            System.out.println(" ".repeat((j) / 2));
        }

        for (int j = height%2+2; j <= height; j += 2) {
            System.out.print(" ".repeat((height-j) / 2));
            System.out.print("8".repeat(j));
            System.out.println(" ".repeat((height-j) / 2));
        }
    }
}

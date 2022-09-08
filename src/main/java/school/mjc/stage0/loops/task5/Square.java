package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength) {
        if (sideLength > 0) {
            drawLine(sideLength);
            for (int i = 2; i < sideLength; i++) {
                System.out.print("8");
                for (int j = 2; j < sideLength; j++) {
                    System.out.print(" ");
                }
                System.out.print("8\n");
            }
            drawLine(sideLength);
        }
    }

    private void drawLine(int length){
        for(int i=0; i<length; i++){
            System.out.print("8");
        }
        System.out.println("");
    }
}

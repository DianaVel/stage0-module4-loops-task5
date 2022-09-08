package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        if(sideLength>0) {
            drawVertLine(sideLength / 2);
            System.out.println("8".repeat(sideLength));
            drawVertLine(sideLength / 2);
        }
    }

    private void drawVertLine (int length){
        for(int i=0; i<length; i++){
            System.out.print(" ".repeat(length));
            System.out.print("8");
            System.out.println(" ".repeat(length));
        }
    }
}

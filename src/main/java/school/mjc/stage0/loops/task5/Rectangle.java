package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        if(length > 0 && height>0) {
            drawLine(length);
            for (int i = 2; i < height; i++) {
                System.out.print("8");
                for (int j = 2; j < length; j++) {
                    System.out.print(" ");
                }
                System.out.print("8\n");
            }
            drawLine(length);
        }
    }

    private void drawLine(int length){
        for(int i=0; i<length; i++){
            System.out.print("8");
        }
        System.out.println("");
    }
}

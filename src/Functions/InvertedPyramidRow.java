package Functions;

public class InvertedPyramidRow {
    public static void main(String[] args) {

        printHalfPyramid(4,3);
    }
    static void printHalfPyramid(int row,int column){

        /*
            *
           **
          ***
         ****
        */

        for (int i=1;i<=4;i++){

            for (int j=i;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

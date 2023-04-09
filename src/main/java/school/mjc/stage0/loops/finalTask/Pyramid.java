package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i=1;i<=cathetusLength;i++){
            int j;
            for ( j=cathetusLength;j>=1;j--){
               if (j<=i) System.out.print(j);else System.out.print(" ");
            }
            for (int z=j+2;z<=i;z++){
                System.out.print(z);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}

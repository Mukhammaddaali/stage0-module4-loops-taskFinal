package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i=1;i<=cathetusLength;i++){
            int j;
            for ( j=i;j>=1;j--){
                System.out.print(j);
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

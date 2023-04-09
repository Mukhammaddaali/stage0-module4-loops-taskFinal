package school.mjc.stage0.loops.finalTask;

import java.util.Scanner;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        for (int i=1;i<=10;i++){
            System.out.println(numberTableToPrint+" x "+i+" = "+numberTableToPrint*i);
        }
    }
    public void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        printTable(x);
    }
}

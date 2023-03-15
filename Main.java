import java.util.Scanner;
import java.io.Console;
import java.io.*;
class Main {
  public static void main(String[] args) {
    int suma=0;
   Scanner scan = new Scanner(System.in);
        int[] liczby = new int[5];
        for(int i=0;i<5;i++){
          System.out.println("Wpisz liczbe");
            liczby[i] = scan.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println(liczby[i]);
        }
  for(int i=0;i<5;i++){
    if(liczby[i]%3==0){
      suma+=liczby[i];
    }
  }
    System.out.println("Suma\n"+suma);
  }
}
package tasks;

import java.util.Scanner;

public class Perevyortish{
    private final Scanner scanner;
    public Perevyortish(){
        this.scanner = new Scanner(System.in);
    }

    public void run(){
        System.out.print("Введите слово: ");
        String strUser = scanner.nextLine();

        //using array
        char[] arrayChar = strUser.toCharArray();
        char[] invertedArrayChar = new char[arrayChar.length];
        for(int i =0; i<arrayChar.length; i++){
            invertedArrayChar[i] = arrayChar[arrayChar.length -i -1];
        }
        String invertedword1 = new String(invertedArrayChar);
        System.out.println("Перевёрнутое слово: " + invertedword1);

        //using stringBldr
        String invertedword = new StringBuilder(strUser).reverse().toString();
        System.out.println("Перевёрнутое слово: " + invertedword);
    }
}
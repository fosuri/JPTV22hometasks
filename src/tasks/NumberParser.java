/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class NumberParser {

    private final Scanner scanner;

    public NumberParser(Scanner scanner) {
        this.scanner = new Scanner(System.in);
    }
    
    public void doNumberParser(){
        boolean repeat = true;
        
        System.out.println("--- Парсер чисел ---");
        System.out.println("");

        do{
            System.out.println("0. Назад в меню");
            System.out.println("1. Парсер чисел");
            System.out.print("Номер задачи: ");
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выбран выход в меню");
                    System.out.println("");
                    System.out.println("------------------------");
                    System.out.println("");
                    repeat = false;
                    break;
                case 1:
                    System.out.print("Введите трехзначное число: ");
                    int number = scanner.nextInt(); scanner.nextLine();
                    if(number >=100 && number <=999){
                        int hundreds = number / 100;
                        int remainder = number % 100;
                        int tens = remainder / 10;
                        int ones = remainder % 10;
                        int sum = hundreds+tens+ones;

                    System.out.println("Сотен: " + hundreds);
                    System.out.println("Десятков: " + tens);
                    System.out.println("Единиц: " + ones); 
                    System.out.println("Сумма: " + sum); 

                } else {
                        System.out.println("Введите трехзначное число!");
                    }
                    
                    break;
                default:
                    System.out.println("ERROR");
                    System.out.println("Выберайте номер задачи из списка!");
            }

            
            
            
        }while(repeat);
        
    }
}
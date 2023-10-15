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
public class TemperatureConventer {

    private final Scanner scanner;

    public TemperatureConventer(Scanner scanner) {
        this.scanner = new Scanner(System.in);
    }

    public void doConvert() {
        boolean repeat = true;
        double celsius, fahrenheit; 
        
        System.out.println("--- Конвентор температуры ---");
        System.out.println("");
        do{
            System.out.println("Выберите направление конвертирования:");
            System.out.println("0. Назад в меню");
            System.out.println("1. Цельсий -> Фаренгейт");
            System.out.println("2. Фаренгейт -> Цельсий");
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
                    System.out.println("Выбран Цельсий -> Фаренгейт");
                    System.out.println("");
                    System.out.print("Введите температуру в градусах Цельсия: ");
                    celsius = scanner.nextDouble();
                    fahrenheit = (celsius * 9/5)+32;
                    System.out.println("------------------------");
                    System.out.println("");
                    System.out.println("Температура в градусах Фаренгейта: "+fahrenheit);
                    System.out.println("");
                    System.out.println("------------------------");
                    
                    break;
                case 2:
                    System.out.println("");
                    System.out.print("Введите температуру в градусах Фаренгейта: ");
                    fahrenheit = scanner.nextDouble();
                    celsius = (fahrenheit -32)* 5/9;
                    System.out.println("------------------------");
                    System.out.println("");
                    System.out.println("Температура в градусах Цельсия: "+celsius);
                    System.out.println("");
                    System.out.println("------------------------");
                    break;
                default:
                    System.out.println("ERROR");
                    System.out.println("Выберайте направление конвертирования из списка!");
            }
        }while(repeat);
        
    }
    
}

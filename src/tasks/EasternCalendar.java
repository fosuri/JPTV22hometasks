/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;
import java.util.Scanner;
/**
 *
 * @author minec
 */

public class EasternCalendar {
    private final Scanner scanner;
    
    public EasternCalendar(Scanner scanner) {
        this.scanner = new Scanner(System.in);
    }
    
    public void doEasternCalendar(){
        boolean repeat = true;
        
        do{
            System.out.println("0. Назад в меню");
            System.out.println("1. Начать");
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
                    System.out.print("Введите год (например, 1984): ");
                    int year = scanner.nextInt();
                    String[] colors = {"зеленый", "красный", "желтый", "белый", "черный"};
                    String[] animals = {"крысы", "коровы", "тигра", "зайца", "дракона", "змеи", "лошади", "овцы", "обезьяны", "курицы", "собаки", "свиньи"};
                    
                    int colorIndex = (year - 1984) % 60 / 12;
                    int animalIndex = (year - 1984) % 12;
                    
                    String color = colors[colorIndex];
                    String animal = animals[animalIndex];
                    
                    System.out.println("Год " + year + " - год " + color + " " + animal);
                    
                    break;
                default:
                    System.out.println("ERROR");
                    System.out.println("Выберайте номер задачи из списка!");
            }
        }while(repeat);
        
    }
    
}

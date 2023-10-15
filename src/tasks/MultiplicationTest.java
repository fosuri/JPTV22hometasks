package tasks;

import java.util.Random;
import java.util.Scanner;

public class MultiplicationTest{
    private final Scanner scanner;
    private final Random random;
    
    public MultiplicationTest(Scanner scanner){
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }
    
    public void doMultiplicationTest(){
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
                    System.out.println("Проверка началась!");
                    int correctAnswers = 0;
                    System.out.println("Тест таблицы умножения (5 вопросов): ");
                    
                    for(int i = 0; i<5; i++){
                        int num1 = random.nextInt(11);
                        int num2 = random.nextInt(11);
                        int correctAnswer = num1 * num2;
                        
                        System.out.print("Вопрос " + (i + 1) + ": " + num1 + " x " + num2 + " = ");
                        int userAnswer = scanner.nextInt();
                        
                        if (userAnswer == correctAnswer) {
                            System.out.println("\u001B[32mПравильно!\u001B[0m"); // Зеленый цвет
                            correctAnswers++;
                        } else {
                            System.out.println("\u001B[31mОшибка!\u001B[0m"); // Красный цвет
                        }                       
                    }
                    System.out.println("Правильных ответов: " + correctAnswers);
                    
                    if (correctAnswers == 5) {
                        System.out.println("Молодец!");
                    } else if (correctAnswers >=3) {
                        System.out.println("Надо бы еще поучить.");
                    } else {
                        System.out.println("Срочно нужно учить таблицу умножения.");
                    }
                    
                    break;                    
                default:
                    System.out.println("ERROR");
                    System.out.println("Выберайте номер задачи из списка!");
            }
            
            
        }while(repeat);
    }
    
}
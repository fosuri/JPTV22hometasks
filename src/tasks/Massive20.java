/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author pupil
 */
public class Massive20 {

    private final Scanner scanner;

    public Massive20(Scanner scanner) {
        this.scanner = new Scanner(System.in);
    }
    
    public void doMassive20(){
        boolean repeat = true;
        
        System.out.println("");
        System.out.println("--- Массив20 ---");
        System.out.println("");
        
        do{
            System.out.println("0. Назад в меню");
            System.out.println("1. Создать массив из 20 случайных чисел");
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
                    //создан массив на 20 слотов
                    int[] arr = new int[20];
                    
                    // генератор рандом чисел
                    Random random = new Random();
                    
                    //Fill massive wiht random numbers
                    for (int i =0; i<20; i++){
                        int randomNumber = random.nextInt(100)*2;
                        arr[i] = randomNumber;
                    } 
                    System.out.println("Массив создан: ");
                    System.out.println(Arrays.toString(arr));
                    
                    //Find min & max element
                    int min = arr[0];
                    int max = arr[0];
                    for (int i = 1; i < arr.length; i++){
                        if (arr[i] < min){
                            min = arr[i];
                        }
                        if (arr[i] > max){
                            max = arr[i];
                        }
                    }
                    System.out.println("Минимальный элемент: " + min);
                    System.out.println("Максимальный элемент: " + max);
                    //Вычислить сумму
                    int sum = 0;
                    for (int i =0; i<arr.length; i++) {
                        if (arr[i] != min && arr[i] != max){
                            sum+=arr[i];
                        }
                    }
                    //среднее арифметическое
                    double avg = (double) sum/ (arr.length-2);
                    System.out.println("---------------------");
                    System.out.println("Среднее арифметическое без минимального и максимального: " + avg);
                    System.out.println("---------------------");

                    break;
                default:
                    System.out.println("ERROR");
                    System.out.println("Выберайте номер задачи из списка!");
            }
            
            
        }while(repeat);
        
    }
}
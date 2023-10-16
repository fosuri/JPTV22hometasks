/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22hometasks;

import java.util.Scanner;

import tasks.EasternCalendar;
import tasks.Massive20;
import tasks.MultiplicationTest;
import tasks.NumberParser;
import tasks.TemperatureConventer;
import tasks.WeatherInYear;
import tasks.LetterChecking;
import tasks.Perevyortish;

import Bookslib.BooksArray;



/**
 *
 * @author pupil
 */
public class App {
    private final Scanner scanner;

    public App() {
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        boolean repeat = true;
        do{
            System.out.println("Выберите задачу из списка:");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Конвертер температуры");
            System.out.println("2. Парсер чисел");
            System.out.println("3. Массив20");
            System.out.println("4. Восточный календарь");
            System.out.println("5. Тест таблицы умножения");
            System.out.println("6. Проверка букв");
            System.out.println("7. Погода в году");
            System.out.println("8. Перевернуть слово");
            System.out.println("9. Книги");
            System.out.print("Номер задачи: ");
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выбран выход из программы");
                    repeat = false;
                    break;
                    
                case 1:
                    System.out.println("Выбран конвертер температуры");
                    TemperatureConventer temperatureConventer = new TemperatureConventer(scanner);
                    temperatureConventer.doConvert();
                    break;
                    
                case 2:
                    System.out.println("Выбран конвертер парсер чисел");
                    NumberParser numberParser = new NumberParser (scanner);
                    numberParser.doNumberParser();
                    break;
                    
                case 3:
                    System.out.println("Выбран конвертер массив20");
                    Massive20 massive20 = new Massive20 (scanner);
                    massive20.doMassive20();
                    break;
                case 4:
                    System.out.println("Выбран восточный календарь");
                    EasternCalendar easterncalendar = new EasternCalendar (scanner);
                    easterncalendar.doEasternCalendar();
                    break;
                case 5:
                    System.out.println("Выбран тест таблицы умножения");
                    MultiplicationTest multiplicationtest = new MultiplicationTest (scanner);
                    multiplicationtest.doMultiplicationTest();
                    break;
                case 6:
                    System.out.println("Выбрана проверка букв");
                    LetterChecking letterchecking = new LetterChecking(scanner);
                    letterchecking.doLetterCheking();
                    break;
                case 7:
                    System.out.println("Выбрана погода в году");
                    WeatherInYear weatherinyear = new WeatherInYear();
                    weatherinyear.play();
                    break;
                case 8:
                    System.out.println("Выбрано перевернуть слово");
                    Perevyortish perevyortish = new Perevyortish();
                    perevyortish.run();
                    break;
                case 9:
                    System.out.println("Выбраны книги");
                    BooksArray booksArray = new BooksArray();
                    booksArray.runbooks();
                    break;
                default:
                    System.out.println("ERROR");
                    System.out.println("Выберайте номер задачи из списка!");
            }
            
        }while(repeat);
        
        
        
    }
    
}

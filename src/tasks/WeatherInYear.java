
package tasks;

import java.util.Random;
import java.util.Scanner;


public class WeatherInYear {
    private final Scanner scanner;
    public int[][] weatherInYear;

    public WeatherInYear(){
        this.scanner = new Scanner(System.in);
    }

    public void play(){
        boolean repeat = true;
        System.out.println("");
        System.out.println("--- WeatherInYear ---");
        System.out.println("");
        create();     
        do{
            
            System.out.println("0. Назад в меню");
            System.out.println("1. Показать всё");
            System.out.println("2. Средняя температура по каждому месяцу");
            System.out.println("3. Самые теплые и самые холодные дни в году");
            System.out.println("4. Отображение погоды на указанную дату");
            System.out.print("Номер задачи: ");
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    repeat = false;
                    break;        
                case 1:
                    showall();
                    break;
                case 2:
                    averageT();
                    break;
                case 3:
                    WarmestAndColdest();
                    break;
                case 4:
                    Tdate();
                    break;
                default:
                    break;
            }
        }while(repeat);
    }

    
    private enum MONTH{
        Январь, Февраль, Март, Апрель, Май, Июнь, Июль, Август, Сентябрь, Октябрь, Ноябрь, Декабрь
    }
    public void create(){
        Random random = new Random();
        //int[][] weatherInYear;
        weatherInYear = new int[12][];
        weatherInYear[0] = new int[31];  // Январь
        weatherInYear[1] = new int[28];  // Февраль
        weatherInYear[2] = new int[31];  // Март
        weatherInYear[3] = new int[30];  // Апрель
        weatherInYear[4] = new int[31];  // Май
        weatherInYear[5] = new int[30];  // Июнь
        weatherInYear[6] = new int[31];  // Июль
        weatherInYear[7] = new int[31];  // Август
        weatherInYear[8] = new int[30];  // Сентябрь
        weatherInYear[9] = new int[31];  // Октябрь
        weatherInYear[10] = new int[30]; // Ноябрь
        weatherInYear[11] = new int[31]; // Декабрь

        int[] minT = {-10, -8, -5, 0, 10, 15, 15, 12, 8, 3, 0, -5};
        int[] maxT = {-2, 0, 5, 12, 17, 23, 25, 23, 20, 15, 7, 1};

        //заполнение массива
        for (int i =0; i<weatherInYear.length;i++){
            for(int j =0; j<weatherInYear[i].length;j++){
                int minTemp = minT[i];
                int maxTemp = maxT[i];
                weatherInYear[i][j] = random.nextInt(maxTemp - minTemp +1) + minTemp;
            }
        }
    }
    // показ таблицы
    public void showall(){
        System.out.print("   ----------------------------------------------------------------Weather----------------------------------------------------------------\n");
        for (int i = 0; i < weatherInYear.length; i++) {
            System.out.printf("%10s: ", MONTH.values()[i]);
            for (int j = 0; j < weatherInYear[i].length; j++) {
                System.out.printf("%4d",weatherInYear[i][j]); 
            }
            System.out.println();  
        }
        System.out.println("   -------------------------------------------------------------------------------------------------------------------------------------");
    }
    // Средняя температура по каждому месяцу
    public void averageT() {
        for (int i = 0; i < weatherInYear.length; i++) {
            int totalTemperature = 0;
            for (int j = 0; j < weatherInYear[i].length; j++) {
                totalTemperature += weatherInYear[i][j];
            }     
            int averageTemperature = totalTemperature / weatherInYear[i].length;
            System.out.println("Средняя температура для " + MONTH.values()[i] + ": " + averageTemperature + "°C");
        }
    }
    // Самые теплые и самые холодные дни в году
    public void WarmestAndColdest(){
        int warmestday = weatherInYear[0][0];
        int coldestday = weatherInYear[0][0];
        int warmestmonth =0;
        int coldestmonth =0;

        for (int i = 0; i<weatherInYear.length; i++){
            for (int j =0; j<weatherInYear[i].length; j++){
                if (weatherInYear[i][j]>warmestday){
                    warmestday = weatherInYear[i][j];
                    warmestmonth =i;
                }
                if(weatherInYear[i][j]<coldestday){
                    coldestday = weatherInYear[i][j];
                    coldestmonth =i;
                }
            }
        }
        System.out.println("Самый тёплый день: "+MONTH.values()[warmestmonth]+" - "+ warmestday + "°C");
        System.out.println("Самый холодный день: "+MONTH.values()[coldestmonth]+" - "+ coldestday + "°C");
    }
    // Отображение погоды на указанную дату, введенную пользователем
    public void Tdate(){
        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt();scanner.nextLine();
        System.out.print("Введите день: ");
        int day = scanner.nextInt();scanner.nextLine();
        

        
        if (isvaliddate(month, day)){
            int temperature = weatherInYear[month-1][day -1];
            System.out.println("Погода на "+MONTH.values()[month-1]+ " "+ day+" - "+ temperature+"°C");
        } else {
            System.out.println("Неверная дата!!!");
        }
    }
    //для проверки даты
    public boolean isvaliddate(int month, int day) {
        return month >= 1 && month <= 12 && day >= 1 && day <= weatherInYear[month - 1].length;
    }
}


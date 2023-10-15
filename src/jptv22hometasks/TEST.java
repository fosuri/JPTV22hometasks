package jptv22hometasks;
import java.util.Random;
public class TEST {
    private enum MONTH {
        Январь, Февраль, Март, Апрель, Май, Июнь, Июль, Август, Сентябрь, Октябрь, Ноябрь, Декабрь
    }
    
    private int[][] weatherInYear; // Поле класса для хранения погодных данных

    public void create() {
        Random random = new Random();
        int[] minT = {-10, -8, -5, 0, 10, 15, 15, 12, 8, 3, 0, -5};
        int[] maxT = {-2, 0, 5, 12, 17, 23, 25, 23, 20, 15, 7, 1};
        
        // Инициализация массива для хранения погодных данных
        weatherInYear = new int[12][];
        for (int i = 0; i < 12; i++) {
            weatherInYear[i] = new int[getDaysInMonth(i)];
        }

        // Заполнение массива случайными данными
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < weatherInYear[i].length; j++) {
                int minTemp = minT[i];
                int maxTemp = maxT[i];
                weatherInYear[i][j] = random.nextInt(maxTemp - minTemp + 1) + minTemp;
            }
        }
    }

    public void showall() {
        // Теперь у нас есть доступ к полю weatherInYear
        System.out.print("   ----------------------------------------------------------------Weather----------------------------------------------------------------\n");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%10s: ", MONTH.values()[i]);
            for (int j = 0; j < weatherInYear[i].length; j++) {
                System.out.printf("%4d", weatherInYear[i][j]);
            }
            System.out.println();
        }
        System.out.println("   -------------------------------------------------------------------------------------------------------------------------------------");
    }

    // Метод для определения количества дней в месяце
    private int getDaysInMonth(int month) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysInMonth[month];
    }
    
    public static void main(String[] args) {
        TEST weatherData = new TEST();
        weatherData.create();
        weatherData.showall();
    }
}

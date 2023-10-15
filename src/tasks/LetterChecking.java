
package tasks;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class LetterChecking {
    private final Scanner scanner;
    
    
    public LetterChecking(Scanner scanner){
        this.scanner = new Scanner(System.in);
    }
    
    public void doLetterCheking(){
        boolean repeat = true;
        System.out.println("");
        System.out.println("--- Проверка букв ---");

        System.out.println("--- Конвентор температуры ---");

        System.out.println("");
        
        do{
            System.out.println("0. Назад в меню");

            System.out.println("1. Начать (русский тект)");

            System.out.println("1. Начать");

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
                    System.out.print("Введите слово: ");
                    String strUser = scanner.nextLine();
                    
                    String text = strUser.toLowerCase();
                    
                    boolean[] alphabet = new boolean[26];//массив отслеживания использованных букв

                    for(char c: text.toCharArray()) {
                        if (c>= 'a' && c <= 'z') {
                            alphabet[c - 'a'] = true;
                        }
                    }
                    
                    boolean containAllLetters = true;
                    for (boolean letterUsed : alphabet) {
                        if(!letterUsed){
                            containAllLetters = false;
                            break;
                        }
                    }
                    if(containAllLetters){
                        System.out.println("Данный текст содержит все буквы английского алфавита.");
                    } else {
                        System.out.println("В данном тексте отсутствуют все буквы английского алфавита.");
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            
        }while(repeat);
        
        
    }
    
}

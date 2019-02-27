/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author pupil
 */
public class App {
    
    /**
     * @param args the command line arguments
     */
    public void firstGame() {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random(System.currentTimeMillis());
        int start = 1;
        int min = 0;
        int max = 10;
        System.out.print("1)Свой диапазон\n2)Стандартный диапазон (0-10) \nВаше действие: ");
        int diapon = scanner.nextInt();
        if (diapon == 1){
            System.out.print("\nМинимальное число: ");
            min = scanner.nextInt();
            System.out.print("Максимальное число: ");
            max = scanner.nextInt();
        }
        System.out.print("Введите желаемое кол-во попыток:");
        int lives = scanner.nextInt();
        int livesDef = lives;

        int randomNumber = min + rnd.nextInt(max - min + 1);
        int gameNum = 1;
        int winGame = 0;
        while (start == 1){
           System.out.print(randomNumber); 
        
        
        System.out.print("\nЗагаданное число находится в диапазоне от "+min+" до "+max+" \n\nУ вас " + lives + " попытки \nВаш вариант ответа: ");
        int choose = scanner.nextInt();
        if (choose == randomNumber){
            System.out.println("\nПравильно! Вы угадали");
        while (choose == randomNumber){
            
            winGame += 1;
            System.out.print("\n1)Сыграть еще раз \n2)Выйти \n3)Задать новый диапазон \nВаше действие: ");
            int play = scanner.nextInt();
            if (play == 1){
                start = 1;
                lives = livesDef;
                randomNumber = min + rnd.nextInt(max - min + 1);
                gameNum += 1;
                break;
            }if (play == 2) {
                System.out.println("\nИгра окончена!\nВсего игр: "+ gameNum+"\nВыйгршных игр: "+winGame);;
                start = 0;
            }if (play ==3) {
            System.out.print("\nМинимальное число: ");
            min = scanner.nextInt();
            System.out.print("Максимальное число: ");
            max = scanner.nextInt();
            }}
        
        }if (choose != randomNumber){
            System.out.println("\nНеверно");
            lives -= 1;
        }
        
        if (lives == 0){
            System.out.println("Вы не смогли угадать, загаданное число равняется: "+randomNumber); 
        while(lives == 0){
            
            System.out.print("\n1)Сыграть еще раз \n2)Выйти \n3)Задать новый диапазон \nВаше действие: ");
            int play = scanner.nextInt();
            if (play == 1){
                start = 1;
                lives = livesDef;
                randomNumber = rnd.nextInt(11);
                gameNum += 1;
            }if (play ==2) {
                System.out.println("\nИгра окончена!\nВсего игр: "+ gameNum+"\nВыйгршных игр: "+winGame);
                start = 0;
            }if (play ==3) {
            System.out.print("Минимальное число: ");
            min = scanner.nextInt();
            System.out.print("Максимальное число: ");
            max = scanner.nextInt();
            }
        }}
        
        
        
        
        }
    }
}

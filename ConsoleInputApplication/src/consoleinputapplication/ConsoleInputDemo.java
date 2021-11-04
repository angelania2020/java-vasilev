/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consoleinputapplication;

import java.util.Scanner;

/**
 *
 * @author Angelina
 */
public class ConsoleInputDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String day, month;
        
        System.out.print("Какой сегодня день? ");
        day = input.nextLine();
        
        System.out.print("Какой месяц? ");
        month = input.nextLine();
        
        String text;
        text = "Сегодня "+day+", месяц - "+month;
        System.out.println(text);
    }
    
}

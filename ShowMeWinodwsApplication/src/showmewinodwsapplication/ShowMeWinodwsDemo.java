/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showmewinodwsapplication;

import javax.swing.JOptionPane;

/**
 *
 * @author Angelina
 */
public class ShowMeWinodwsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Название диалогового окна:
        String title;
        // Текст сообщения:
        String text;
        // Отображение первого окна с полем ввода:
        title=JOptionPane.showInputDialog(null,"Имя для окна:","Название",JOptionPane.WARNING_MESSAGE);
        // Отображение второго окна с полем ввода:
        text=JOptionPane.showInputDialog(null,"Текст сообщения:","Содержание",JOptionPane.PLAIN_MESSAGE);
        // Отображение окна с сообщением:
        JOptionPane.showMessageDialog(null,text,title,JOptionPane.INFORMATION_MESSAGE);

    }
    
}

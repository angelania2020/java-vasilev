package inputdialogapplication;

// Описание класса:

import javax.swing.JOptionPane;

public class InputDialogDemo {
    // Главный метод:
    public static void main(String[] args) {
        // Переменная для записи текста:
        String text;
        // Отображение диалогового окна с полем ввода:
        text=JOptionPane.showInputDialog("Введите текст:");
        // Отображение диалогового окна с сообщением:
        JOptionPane.showMessageDialog(null, "Вы ввели такой текст:\n"+text);
    }
    
}

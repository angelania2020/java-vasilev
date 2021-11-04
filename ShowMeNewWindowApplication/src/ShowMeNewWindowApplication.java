// Импортируется класс JOptionPane:
import javax.swing.JOptionPane;
// Описание класса ShowMeNewWindowApplication:
class ShowMeNewWindowApplication {
    // Описание главного метода программы:
    public static void main(String[] args) {
        // Текст для названия окна:
        String title="Message";
        // Текст сообщения:
        String text="Let us continue to learn Java";
        // Отображение диалогового окна с сообщением:
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.WARNING_MESSAGE);
    } // Завершение описания метода
} // Завершение описания класса

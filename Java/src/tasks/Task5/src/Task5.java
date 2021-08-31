import view.Main;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(">>>>> Reto 5 <<<<<");

        // Set UIManager
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // Run App
        JFrame main = new Main();
        main.setVisible(true);
    }
}

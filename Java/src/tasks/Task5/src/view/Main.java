package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

public class Main extends JFrame {

    public Main() {
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        setTitle("Bodegas Todo lo bueno");

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // Add content to the window.
        ActionButtons actionButtons = new ActionButtons();
        add(new Tabs(actionButtons), BorderLayout.CENTER);
        add(actionButtons, BorderLayout.SOUTH);

        // Create and set up the window.
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setSize(640, 340);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

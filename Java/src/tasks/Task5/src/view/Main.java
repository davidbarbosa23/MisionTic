package view;

import java.awt.BorderLayout;
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // Add content to the window.
        ContentTables contentTables = new ContentTables();
        ActionButtons actionButtons = new ActionButtons(contentTables);
        add(new Tabs(actionButtons, contentTables), BorderLayout.CENTER);
        add(actionButtons, BorderLayout.SOUTH);

        // Create and set up the window.
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setSize(640, 340);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

package view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Main extends JFrame {

    public Main() {
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        // Init Content
        ContentTables contentTables = new ContentTables();
        ActionButtons actionButtons = new ActionButtons(contentTables);
        Tabs tabs = new Tabs(actionButtons, contentTables);
        // Add content to the window.
        add(tabs, BorderLayout.CENTER);
        add(actionButtons, BorderLayout.SOUTH);

        // Create and set up the window.
        setTitle("Bodegas Todo lo bueno");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setSize(640, 340);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

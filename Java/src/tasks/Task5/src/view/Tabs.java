package view;

import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JComponent;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

public class Tabs extends JPanel {

    public Tabs(ActionButtons actionButtons, ContentTables contentTables) {
        super(new GridLayout(1, 1));

        setPreferredSize(new Dimension(640, 300));

        JTabbedPane tabbedPane = new JTabbedPane();

        JComponent panel1 = contentTables.getStocksTable();
        tabbedPane.addTab("Almacén", panel1);
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

        JComponent panel2 = contentTables.getProductsTable();
        tabbedPane.addTab("Productos", panel2);
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

        JComponent panel3 = contentTables.getEmployeesTable();
        tabbedPane.addTab("Empleados", panel3);
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

        JComponent panel4 = contentTables.getStoresTable();
        tabbedPane.addTab("Bodegas", panel4);
        tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);

        tabbedPane.addChangeListener(e ->
                actionButtons.setSelectedTab(tabbedPane.getSelectedIndex())
        );

        add(tabbedPane);

        // Enables to use scrolling tabs.
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }
}
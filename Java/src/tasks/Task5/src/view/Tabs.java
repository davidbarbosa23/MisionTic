/*
 * Example taken from:
 * https://docs.oracle.com/javase/tutorial/uiswing/examples/components/TabbedPaneDemoProject/src/components/TabbedPaneDemo.java
 */

package view;

import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JComponent;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

public class Tabs extends JPanel {

    public Tabs(ActionButtons actionButtons) {
        super(new GridLayout(1, 1));

        setPreferredSize(new Dimension(640, 300));

        JTabbedPane tabbedPane = new JTabbedPane();

        JComponent panel1 = ContentTables.getStocksTable();
        tabbedPane.addTab("Almacén", panel1);
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

        JComponent panel2 = ContentTables.getProductsTable();
        tabbedPane.addTab("Productos", panel2);
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

        JComponent panel3 = ContentTables.getEmployeesTable();
        tabbedPane.addTab("Empleados", panel3);
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

        JComponent panel4 = ContentTables.getStoresTable();
        tabbedPane.addTab("Bodegas", panel4);
        tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);

        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                System.out.println("Tab: " + tabbedPane.getSelectedIndex());
                actionButtons.setSelectedTab(tabbedPane.getSelectedIndex());
            }
        });

        //Add the tabbed pane to this panel.
        add(tabbedPane);

        //The following line enables to use scrolling tabs.
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }
}
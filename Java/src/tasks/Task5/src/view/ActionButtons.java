package view;

import controller.TabsActionsController;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class ActionButtons extends JPanel {
    private int selectedTab;

    public ActionButtons(ContentTables contentTables) {
        super(new GridLayout(1, 3));

        TabsActionsController tabsActionsController = new TabsActionsController(this, contentTables);

        JButton btnCreate = new JButton("Crear");
        btnCreate.addActionListener(tabsActionsController);
        btnCreate.setActionCommand("create");
        add(btnCreate);

        JButton btnUpdate = new JButton("Actualizar");
        btnUpdate.addActionListener(tabsActionsController);
        btnUpdate.setActionCommand("update");
        add(btnUpdate);

        JButton btnDelete = new JButton("Borrar");
        btnDelete.addActionListener(tabsActionsController);
        btnDelete.setActionCommand("delete");
        add(btnDelete);
    }

    public int getSelectedTab() {
        return selectedTab;
    }

    public void setSelectedTab(int selectedTab) {
        this.selectedTab = selectedTab;
    }
}

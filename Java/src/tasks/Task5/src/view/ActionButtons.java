package view;

import controller.ActionButtonsController;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class ActionButtons extends JPanel {
    private int selectedTab;

    public ActionButtons(ContentTables contentTables) {
        super(new GridLayout(1, 3));

        ActionButtonsController actionButtonsController = new ActionButtonsController(this, contentTables);

        JButton btnCreate = new JButton("Crear");
        btnCreate.addActionListener(actionButtonsController);
        btnCreate.setActionCommand("create");
        add(btnCreate);

        JButton btnUpdate = new JButton("Actualizar");
        btnUpdate.addActionListener(actionButtonsController);
        btnUpdate.setActionCommand("update");
        add(btnUpdate);

        JButton btnDelete = new JButton("Borrar");
        btnDelete.addActionListener(actionButtonsController);
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

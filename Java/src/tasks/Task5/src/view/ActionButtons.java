package view;

import controller.ActionsController;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class ActionButtons extends JPanel {
    private int selectedTab;

    private JButton btnCreate;
    private JButton btnUpdate;
    private JButton btnDelete;

    public ActionButtons() {
        super(new GridLayout(1, 3));

        ActionsController actionsController = new ActionsController(this);

        btnCreate = new JButton("Crear");
        btnCreate.addActionListener(actionsController);
        btnCreate.setActionCommand("create");
        add(btnCreate);

        btnUpdate = new JButton("Actualizar");
        btnUpdate.addActionListener(actionsController);
        btnUpdate.setActionCommand("update");
        add(btnUpdate);

        btnDelete = new JButton("Borrar");
        btnDelete.addActionListener(actionsController);
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

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.*;

public class ActionsController implements ActionListener {
    private ActionButtons actionButtons;

    public ActionsController(ActionButtons actionButtons) {
        this.actionButtons = actionButtons;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("Action Tab: " + actionButtons.getSelectedTab() + " - Command: " + actionEvent.getActionCommand());

        // Tab = Stock
        if (actionButtons.getSelectedTab() == 0) {
            if (actionEvent.getActionCommand().equals("create")) {
                FormStock formStockView = new FormStock();
                formStockView.setVisible(true);
            }
            if (actionEvent.getActionCommand().equals("update")) {

            }
            if (actionEvent.getActionCommand().equals("delete")) {

            }
        }

        // Tab = Product
        if (actionButtons.getSelectedTab() == 1) {
            if (actionEvent.getActionCommand().equals("create")) {
                FormProduct formProductView = new FormProduct();
                formProductView.setVisible(true);
            }
            if (actionEvent.getActionCommand().equals("update")) {

            }
            if (actionEvent.getActionCommand().equals("delete")) {

            }
        }

        // Tab = Employee
        if (actionButtons.getSelectedTab() == 2) {
            if (actionEvent.getActionCommand().equals("create")) {
                FormEmployee formEmployeeView = new FormEmployee();
                formEmployeeView.setVisible(true);
            }
            if (actionEvent.getActionCommand().equals("update")) {

            }
            if (actionEvent.getActionCommand().equals("delete")) {

            }
        }

        // Tab = Store
        if (actionButtons.getSelectedTab() == 3) {
            if (actionEvent.getActionCommand().equals("create")) {
                FormStore formStoreView = new FormStore();
                formStoreView.setVisible(true);
            }
            if (actionEvent.getActionCommand().equals("update")) {

            }
            if (actionEvent.getActionCommand().equals("delete")) {

            }
        }

    }
}

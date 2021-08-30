package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.ActionButtons;
import view.AddProduct;

public class ActionsController implements ActionListener {
    private ActionButtons actionButtons;

    public ActionsController(ActionButtons actionButtons) {
        this.actionButtons = actionButtons;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("Selected Tab: " + actionButtons.getSelectedTab() + " - Command: " + actionEvent.getActionCommand());

        if (actionEvent.getActionCommand() == "create") {
            AddProduct addProductView = new AddProduct();
            addProductView.setVisible(true);
        }
        if (actionEvent.getActionCommand() == "update") {

        }
        if (actionEvent.getActionCommand() == "delete") {

        }
    }
}

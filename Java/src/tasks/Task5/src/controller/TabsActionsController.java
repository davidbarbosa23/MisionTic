package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import interfaces.IFormView;
import view.ActionButtons;
import view.ContentTables;
import view.FormEmployee;
import view.FormProduct;
import view.FormStock;
import view.FormStore;

import javax.swing.JFrame;

public class TabsActionsController implements ActionListener {
    private ActionButtons actionButtons;
    private ContentTables contentTables;
    private IFormView formView = null;

    public TabsActionsController(ActionButtons actionButtons, ContentTables contentTables) {
        this.actionButtons = actionButtons;
        this.contentTables = contentTables;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("Action Tab: " + actionButtons.getSelectedTab() + " - Command: " + actionEvent.getActionCommand());

        // Tab = Stock
        if (actionButtons.getSelectedTab() == 0) {
            if (actionEvent.getActionCommand().equals("delete")) {
                // ToDo: Delete action
            } else formView = new FormStock(contentTables, actionEvent.getActionCommand());
        }

        // Tab = Product
        if (actionButtons.getSelectedTab() == 1) {
            if (actionEvent.getActionCommand().equals("delete")) {
                // ToDo: Delete action
            }
            formView = new FormProduct(contentTables, actionEvent.getActionCommand());
        }

        // Tab = Employee
        if (actionButtons.getSelectedTab() == 2) {
            if (actionEvent.getActionCommand().equals("delete")) {
                // ToDo: Delete action
            } else formView = new FormEmployee(contentTables, actionEvent.getActionCommand());
        }

        // Tab = Store
        if (actionButtons.getSelectedTab() == 3) {
            if (actionEvent.getActionCommand().equals("delete")) {
                // ToDo: Delete action
            }
            formView = new FormStore(contentTables, actionEvent.getActionCommand());
        }

        if (formView != null && formView instanceof JFrame)
            ((JFrame) formView).setVisible(true);

    }
}

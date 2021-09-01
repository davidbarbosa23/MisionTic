package view;

import controller.FormsActionsController;

import javax.swing.JButton;

public interface IFormView  {
    FormsActionsController formsActionsController = new FormsActionsController();
    JButton btnSave = new JButton("Guardar");
    JButton btnCancel = new JButton("Cancelar");

    void initForm(int height);

    JButton getBtnSave();
    JButton getBtnCancel();

    String getCmd();
}
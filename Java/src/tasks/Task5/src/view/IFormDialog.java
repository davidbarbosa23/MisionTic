package view;

import controller.FormsDialogsController;

import java.awt.Frame;

public interface IFormDialog {
    FormsDialogsController formController = new FormsDialogsController();

    void initForm();

    String getCmd();

    ContentTables getContentTables();

    Frame getMainFrame();
}

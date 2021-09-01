package view;

import java.awt.Frame;

public interface IFormDialog {
    void initForm();

    String getCmd();

    ContentTables getContentTables();

    Frame getMainFrame();
}

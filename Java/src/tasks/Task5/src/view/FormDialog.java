package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormDialog extends JPanel implements IFormDialog {
    private ContentTables contentTables;
    private String cmd;
    private String title = "";
    private Frame mainFrame;

    public FormDialog(ContentTables contentTables, String cmd, Frame mainFrame) {
        this.contentTables = contentTables;
        this.mainFrame = mainFrame;
        this.cmd = cmd;
        setForm();
    }

    protected void setForm() {
    }

    protected JPanel setTxtPanel(JTextField field) {
        field.setPreferredSize(new Dimension(150, 20));
        field.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(field);
        return panel;
    }

    public void initForm() {
        Object[] options = {"Guardar", "Cancelar"};
        int result = JOptionPane.showOptionDialog(
                this.mainFrame,
                this,
                title,
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
        );

        if (result == JOptionPane.OK_OPTION)
            formController.execute(this);

    }

    protected void setTitle(String title) {
        this.title = title;
    }

    public String getCmd() {
        return cmd;
    }

    public ContentTables getContentTables() {
        return contentTables;
    }

    public Frame getMainFrame() {
        return mainFrame;
    }
}

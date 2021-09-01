package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Form extends JFrame implements IFormView {
    private ContentTables contentTables;
    private String cmd;

    public Form(ContentTables contentTables, String cmd) {
        this.cmd = cmd;
        this.contentTables = contentTables;
        setForm();
    }

    protected void setForm() {
    }

    public void initForm(int height) {
        formsActionsController.setForm(this);
        formsActionsController.setContentTables(contentTables);

        JPanel buttonsPanel = new JPanel();
        this.btnSave.addActionListener(formsActionsController);
        buttonsPanel.add(this.btnSave);
        this.btnCancel.addActionListener(formsActionsController);
        buttonsPanel.add(this.btnCancel);
        add(buttonsPanel, BorderLayout.SOUTH);

        // Create and set up the window.
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setSize(360, height);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    protected JPanel setTxtPanel(JTextField field) {
        field.setPreferredSize(new Dimension(150, 20));
        field.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(field);
        return panel;
    }

    public JButton getBtnSave() {
        return btnSave;
    }

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public String getCmd() {
        return cmd;
    }

    public ContentTables getContentTables() {
        return contentTables;
    }
}

package view;

import model.Store;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormStore extends Form {
    private Store store;

    private JTextField nameTxt;
    private JTextField addressTxt;

    public FormStore(ContentTables contentTables, String cmd) {
        super(contentTables, cmd);
    }

    @Override
    public void setForm() {
        JLabel nameLbl = new JLabel("Nombre");
        this.nameTxt = new JTextField();

        JLabel addressLbl = new JLabel("Dirección");
        this.addressTxt = new JTextField();

        // Set title and default values
        if (getCmd().equals("update")) {
            setTitle("Actualizar Bodega");
            store = getContentTables().getSelectedStore();
            this.nameTxt.setText(store.getName());
            this.addressTxt.setText(String.valueOf(store.getAddress()));
        } else {
            setTitle("Agregar Bodega");
            this.nameTxt.setText("");
            this.addressTxt.setText("");
        }

        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panel.add(nameLbl);
        panel.add(setTxtPanel(this.nameTxt));
        panel.add(addressLbl);
        panel.add(setTxtPanel(this.addressTxt));

        add(panel, BorderLayout.CENTER);

        initForm(150);
    }

    public JTextField getNameTxt() {
        return nameTxt;
    }

    public JTextField getAddressTxt() {
        return addressTxt;
    }

    public Store getStore() {
        return store;
    }
}

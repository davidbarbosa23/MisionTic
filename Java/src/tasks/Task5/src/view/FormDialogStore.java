package view;

import model.Store;

import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormDialogStore extends FormDialog {
    private Store store;

    private JTextField nameTxt;
    private JTextField addressTxt;

    public FormDialogStore(ContentTables contentTables, String cmd, Frame mainFrame) {
        super(contentTables, cmd, mainFrame);
    }

    @Override
    public void setForm() {
        setLayout(new GridLayout(2, 2));

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

        add(nameLbl);
        add(setTxtPanel(this.nameTxt));
        add(addressLbl);
        add(setTxtPanel(this.addressTxt));

        initForm();
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

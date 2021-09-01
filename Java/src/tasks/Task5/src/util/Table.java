package util;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class Table extends JTable {

    public boolean isCellEditable(int rowIndex, int colIndex) {
        return false;
    }

    public void setSelectionModel(ListSelectionModel selectionModel) {
        super.setSelectionModel(new ForcedListSelectionModel());
    }
}

/*
 * Explanation here: https://stackoverflow.com/a/18311712
 */

package util;

import javax.swing.DefaultListSelectionModel;
import javax.swing.ListSelectionModel;

public class ForcedListSelectionModel extends DefaultListSelectionModel {

    public ForcedListSelectionModel () {
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    @Override
    public void clearSelection() {
    }

    @Override
    public void removeSelectionInterval(int index0, int index1) {
    }

}
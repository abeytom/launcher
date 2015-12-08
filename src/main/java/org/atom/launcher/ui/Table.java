package org.atom.launcher.ui;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: abey.tom
 * Date: 7/14/13
 * Time: 1:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Table extends JTable{
    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
        Component c = super.prepareRenderer(renderer, row, column);
        JComponent jc = (JComponent)c;
        if (!isRowSelected(row)){
//            c.setBackground(row % 2 == 0 ? getBackground() : Color.LIGHT_GRAY);
        }
        else{
        }
            jc.setBorder(new MatteBorder(0, 0, 1, 1, Color.LIGHT_GRAY) );
        return c;
    }
}

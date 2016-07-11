/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ERT;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;
/**
 *
 * @author petehahn
 */
public class TableModelExtRatings extends AbstractTableModel {
    private final int columnCount = 12;
    private final String[] colNames={"59", "63", "67", "71", "59", "63", "67", "71", "59", "63", "67", "71", "59", "63", "67", "71"};
    private ArrayList<String[]> ResultSets;

    public TableModelExtRatings(ArrayList<String[]> al) {
        ResultSets = new ArrayList<>();
        ResultSets = al;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object[] row = ResultSets.get(rowIndex);
        return row[columnIndex];
    }

    @Override
    public int getRowCount() {
        return ResultSets.size();
    }

    @Override
    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public String getColumnName(int param) {
        return colNames[param];
    }  
    
    @Override
    public Class getColumnClass(int columnIndex) {
        if (columnIndex == 0) {
            
        }
        return Integer.class;
    }
}

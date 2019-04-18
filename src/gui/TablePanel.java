package gui;

import model.User;

import javax.swing.*;
import java.awt.BorderLayout;
import java.util.List;

public class TablePanel extends JPanel {
    private UserTableModel tableModel;
    private JTable table;

    public TablePanel(){
        tableModel = new UserTableModel();
        table = new JTable(tableModel);

        setLayout(new BorderLayout());

        add(table, BorderLayout.CENTER);
    }

    public void setData(List<User> db){
        tableModel.setData(db);
    }

    public void refresh(){
        tableModel.fireTableDataChanged();
    }
}

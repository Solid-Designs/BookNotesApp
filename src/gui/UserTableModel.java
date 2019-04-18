package gui;

import model.User;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class UserTableModel extends AbstractTableModel {
    // Pass a reference of the user through the constructor
    private List<User> db;

    public UserTableModel(){

    }

    public void setData(List<User> db){
        this.db = db;
    }

    @Override
    public int getRowCount() {
        return db.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        User user = db.get(rowIndex);

        switch(columnIndex){
            case 0:
                return user.getId();
            case 1:
                return user.getUserName();
            case 2:
                return user.getPassword();
        }
        return null;
    }
}

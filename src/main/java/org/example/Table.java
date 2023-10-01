package org.example;

public class Table {

    int tableNumber;
    boolean isAvailable;

    public Table(int tableNumber, boolean isAvailable) {
        this.tableNumber = tableNumber;
        this.isAvailable = isAvailable;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}

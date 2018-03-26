public class Location {
    int row, column;
    double maxValue;

    public Location(int inRow, int inColumn, double inMax){
        this.row = inRow;
        this.column = inColumn;
        this.maxValue = inMax;
    }

    public void setRow(int inRow){
        this.row = inRow;
    }

    public void setColumn(int inColumn){
        this.column = inColumn;
    }

    public void setMax(double inMax){
        this.maxValue = inMax;
    }

    public int getRow(){
        return this.row;
    }

    public int getColumn(){
        return this.column;
    }

    public double getMaxValue(){
        return this.maxValue;
    }
}
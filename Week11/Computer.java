import java.time.LocalDate;

public class Computer implements Comparable<Computer>{
    LocalDate purchaseDate;
    public Computer(){

    }
    public int compareTo(Computer inComputer){
        return purchaseDate.compareTo(inComputer.purchaseDate);
    }
}

public static void main(String args[]){
    Computer comp1 = new Computer();
    Computer comp2 = new Computer();

    comp1.compareTo(comp2);
}

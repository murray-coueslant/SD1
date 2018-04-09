public class MammalInt implements AnimalInt{
    public void eat(){
        System.out.println("Mammal eats");
    }

    public void walks(){
        System.out.println("Mammal walks");
    }

    public static void main(String args[]){
        MammalInt m = new MammalInt();
        m.eat();
        m.walks();
    }
}
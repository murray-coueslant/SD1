public class Dog extends Animal {
    public Dog(){
        this.setType("mammal");
        this.setDiet("omnivore");
    }

    public void barks(Dog dog){
        System.out.println("woof");
    }


}

public static void main(String args[]){
    System.out.println();
}
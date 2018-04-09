public class Dog extends Animal {
    public Dog(){
        this.setType("mammal");
        this.setDiet("omnivore");
    }

    public void barks(){
        System.out.println("woof");
    }


}
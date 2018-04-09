public class Walker extends Dog {
    public Walker(){
        System.out.println("Pug");
        barks(new Pug());

        System.out.println("Shepard");
        barks(new Shepard());
    }
}
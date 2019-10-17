package neo.mohosyny.designpatterns.Singleton;

public class Eager {

    private static final Eager instance = new Eager();


    private Eager(){

        //////mohosyny
    }


    public static Eager getInstance(){

        return instance;
    }

}

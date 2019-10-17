package neo.mohosyny.designpatterns.Singleton;

public class Lazy {

    private static Lazy instace;


    private Lazy() {
        ///mohosyny
    }


    public static Lazy getInstace() {
        if (instace == null) {
            instace = new Lazy();
        }
        return instace;
    }

}

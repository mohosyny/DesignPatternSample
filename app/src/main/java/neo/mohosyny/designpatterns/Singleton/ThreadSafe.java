package neo.mohosyny.designpatterns.Singleton;

public class ThreadSafe {
    private static ThreadSafe instance;


    public synchronized static ThreadSafe getInstance() {

        if (instance == null) {
            instance = new ThreadSafe();
        }
        return instance;
    }

    private ThreadSafe() {
        //mohosyny
    }
}

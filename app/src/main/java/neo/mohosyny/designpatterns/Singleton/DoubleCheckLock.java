package neo.mohosyny.designpatterns.Singleton;

public class DoubleCheckLock {
    private static DoubleCheckLock instance;


    public static DoubleCheckLock getInstance() {
        if (instance == null) {

            synchronized (DoubleCheckLock.class) {
                instance = new DoubleCheckLock();
            }
        }
        return instance;
    }


    private DoubleCheckLock() {
        //mohosyny
    }

}

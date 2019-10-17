package neo.mohosyny.designpatterns.Singleton;

public class BillPugh {

    public static class BillPughHolder {
        private final static BillPugh INSTANCE = new BillPugh();
    }


    public static BillPugh getInstance() {

        return BillPughHolder.INSTANCE;
    }

    private BillPugh() {
        //mohosyny
    }


}

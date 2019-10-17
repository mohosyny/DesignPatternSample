package neo.mohosyny.designpatterns.Singleton;

public class StaticBlock {
    private static StaticBlock Instance;

    static {

        try {
            Instance = new StaticBlock();
        } catch (RuntimeException exception) {

            ///mohosyny
        }
    }

    private StaticBlock() {

    }


    public static StaticBlock getInstance() {
        return Instance;
    }
}

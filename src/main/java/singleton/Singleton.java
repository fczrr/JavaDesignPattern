package singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    //線程不安全
    //public static Singleton getInstance() {
    //    if (instance == null) {
    //        instance = new Singleton();
    //    }
    //    return instance;
    //}

    //線程安全寫法
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

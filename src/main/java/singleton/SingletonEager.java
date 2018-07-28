package singleton;
//Eager mode
public class SingletonEager {

    //單例貪婪模式-初始化即建立好實例，不適合不常用、消化資源大的類別
    private static final SingletonEager singleton = new SingletonEager();
    //private建構子
    private SingletonEager(){

    }
    public static SingletonEager getSingleton() {
        return singleton;
    }
}

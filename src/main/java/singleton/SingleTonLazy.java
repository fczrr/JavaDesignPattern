package singleton;
//lazy 初始化消耗多的話建議使用
public class SingleTonLazy {

    //private建構子
    private SingleTonLazy() {
        System.out.println("SingleTonLazy init");
    }

    private static class SingleTonHolder {

        private SingleTonHolder(){
            System.out.println("holder init");
        }
        private static final SingleTonLazy INSTANCE = new SingleTonLazy();
    }

    public static SingleTonLazy getInstance() {
        return SingleTonHolder.INSTANCE;
    }
}

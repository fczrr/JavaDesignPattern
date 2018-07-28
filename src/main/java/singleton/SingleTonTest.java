package singleton;

public class SingleTonTest extends Thread {

    private String id;

    public SingleTonTest(String id) {
        this.id = id;
    }

    public void run() {
        Singleton singleton = Singleton.getInstance();
        if (singleton != null) {
            System.out.println("id" + id + "取得單例hashcode" + singleton.hashCode());
        }
    }

    public static void main(String[] args) {
        //模擬單執行緒
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("單執行緒取得單例實體1:"+s1.hashCode()+" 實體2:"+s2.hashCode());

        //模擬多執行緒
        Thread st1 = new SingleTonTest("執行緒1");
        Thread st2 = new SingleTonTest("執行緒2");

        st1.start();
        st2.start();


        //一般版 須注意線程
        Singleton singleton = Singleton.getInstance();
        //Eager 貪婪模式 一開始即建立實例，適合初始消耗不大
        SingletonEager singletonEager = SingletonEager.getSingleton();
        //lazy 懶加載 初始消耗大時使用
        SingleTonLazy singleTonLazy = SingleTonLazy.getInstance();
        //enum 第一次呼叫才加載，線程安全 best!
        SingleTonENUM singleTonENUM = SingleTonENUM.getInstance();
    }


}

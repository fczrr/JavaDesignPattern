package singleton;


interface MySingleTon{
    void doSomething();
}


public enum SingleTonENUM implements MySingleTon{
    //same as public static final SingleTonENUM INSTANCE = new SingleTonENUM();
    //enum會在第一次加載才會實例化
    INSTANCE{
        public void doSomething(){
            System.out.println("Hello this is MySingleTon Implement Method!");
        }
    };

    private SingleTonENUM(){
        System.out.println("Hello!Enum init");
    }


    public void method(){
        System.out.println("Hello SingleTonENUM!");
    }

    public static SingleTonENUM getInstance(){
        return SingleTonENUM.INSTANCE;
    }
}

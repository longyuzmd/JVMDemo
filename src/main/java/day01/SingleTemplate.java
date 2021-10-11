package day01;

public class SingleTemplate {

    private SingleTemplate(){

    }

    private static SingleTemplate st = null;

//    public static synchronized SingleTemplate getInstance(){  // 同步方法 锁=SingleTemplate.class
//        if(st == null){
//
//            return new SingleTemplate();
//        }
//        return st;
//    }

    public static SingleTemplate getInstance(){
        // 同步代码块 效率很低
//        synchronized (SingleTemplate.class) {
//            if (st == null) {
//                return new SingleTemplate();
//            }
//            return st;
//        }

        if(st == null){
            synchronized (SingleTemplate.class) {
                if (st == null) {
                    return new SingleTemplate();
                }
                return st;
            }
        }
        return st;
    }
}

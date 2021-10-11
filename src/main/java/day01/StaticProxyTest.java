package day01;

public class StaticProxyTest {
    public static void main(String[] args) {
        NikClothFactory nikClothFactory = new NikClothFactory();
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nikClothFactory);
        proxyClothFactory.productCloth();
    }
}

/**
 * 代理模式的思想：
 *
 * 静态代理：
 *  一个接口，两个实现类
 *  两个实现类
 *      被代理类
 *      代理类
 *  要求：调用代理类的方法，实际执行被代理类的方法
 */

interface ClothFactory{

    void productCloth();

}

// 被代理类
class NikClothFactory implements ClothFactory{

    public void productCloth() {
        System.out.println("耐克工厂生产衣服。。。。");
    }
}

class ProxyClothFactory implements ClothFactory{

    private NikClothFactory nikClothFactory;

    public ProxyClothFactory(NikClothFactory nikClothFactory){
        this.nikClothFactory = nikClothFactory;
    }

    public void productCloth() {
        // 增强效果，aop的原理实现
        System.out.println("前置增强。。。");
        nikClothFactory.productCloth();
        System.out.println("后置增强。。。");
    }
}

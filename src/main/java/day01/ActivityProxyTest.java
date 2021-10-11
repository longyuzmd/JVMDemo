package day01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ActivityProxyTest {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superMan);
        String believe = proxyInstance.believe();
        System.out.println(believe);
        proxyInstance.eat("辣椒");
    }
}

/**
 * 动态代理：
 *  一个接口，一个实现类
 *   实现类 被代理类
 * 要求： 动态生成一个被代理类对象，
 * 完成调用代理类方法，实际调用被代理类方法
 *
 */

interface Human{

    String believe();

    void eat(String food);
}

class AopDemo{

    public void method1(){
        System.out.println("方法1");
    }

    public void method2(){
        System.out.println("方法2");
    }
}

// 被代理类
class SuperMan implements Human{

    public String believe() {
        return "超级英雄是有信仰的！";
    }

    public void eat(String food) {
        System.out.println("我喜欢吃"+food);
    }
}

/**
 * 代理工厂 动态生成代理对象实例
 */
class ProxyFactory{

    public static Object getProxyInstance(Object obj){
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), myInvocationHandler);
    }
}

class MyInvocationHandler implements InvocationHandler{

    private Object obj;

    public MyInvocationHandler(Object obj){
        this.obj = obj;
    }


    // 代理对象调用被代理对象的方法a, 就会指定如下方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        AopDemo aopDemo = new AopDemo();
        aopDemo.method1();

        Object invoke = method.invoke(obj, args);

        aopDemo.method2();
        return invoke;
    }
}
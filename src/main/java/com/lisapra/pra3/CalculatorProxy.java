package com.lisapra.pra3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CalculatorProxy {

    /**
     *
     *  为传入的参数对象创建一个动态代理对象
     * @param calculator 被代理对象
     * @return
     */
    //想在匿名内部类里面调用外部参数的值就必须加上关键字final
    public static Calculator getProxy(Calculator calculator){

        System.out.println("invoke方法开始执行了");
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        //被代理对象的类加载器
        ClassLoader loader = calculator.getClass().getClassLoader();
        //被代理对象的接口
        Class<?>[] interfaces = calculator.getClass().getInterfaces();

        //方法执行器，执行被代理对象的目标方法
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    LogUtil.start(method,args);
                    result = method.invoke(calculator, args);
                    LogUtil.stop(method,result);
                }catch (Exception e){
                    LogUtil.logException(method,e);
                }finally {
                    LogUtil.end(method);
                }
                return result;
            }
        };

        Object proxy = Proxy.newProxyInstance(loader, interfaces, invocationHandler);
        return (Calculator) proxy;
    }
}

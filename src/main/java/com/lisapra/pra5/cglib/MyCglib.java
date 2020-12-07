package com.lisapra.pra5.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理类
 */
public class MyCglib implements MethodInterceptor {
    /*
 	此方法用来实现方法的拦截，四个参数分别表示的含义：
 	obj:表示增强的对象，即实现这个接口类的一个对象
 	method：表示要拦截的方法
 	args：表示被拦截的方法的参数
 	proxy:表示要触发父类的方法对象
 	*/
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object o1 = methodProxy.invokeSuper(o, objects);
        return o1;
    }
}

package ����ģʽ;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HomeLine implements InvocationHandler {
	 private Person target;
	    
	    public Object getInstance(Person target){
	        this.target = target;
	        Class clazz = target.getClass();
	        Object obj = Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	        return obj;
	    }
	@Override
	public Object invoke(Object obj, Method method, Object[] args) throws Throwable {
		 	System.out.println("�������ң��Ұ�����ҷ���..");
	        //��һ��������target,Ҳ���Ǳ�������Ķ��󣻵ڶ��������Ƿ����еĲ���
	        method.invoke(target, args);
	        System.out.println("�������ң��Ѿ�������..");
	        return null;
	}

}

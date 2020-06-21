package com.example.gofp.head_first.sol.structural.proxy.classes;

import com.example.gofp.binding.Systems;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

public class NonOwnerInvocationHandler implements InvocationHandler {
    private static final String TAG = "OwnerInvocationHandler";

    private PersonBean person;

    public NonOwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    public static PersonBean getProxy(PersonBean person){
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),new NonOwnerInvocationHandler(person));
    }

    /**
     *  Работа с Reflection через proxy Java стандартная реализация
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)throws IllegalAccessException {
        try {
            if(method.getName().startsWith("get")){
                return method.invoke(person,args);
            }else if(method.getName().equals("setHotOrNotRating")){
                return method.invoke(person,args);
            }else if(method.getName().startsWith("set")) {
                throw new IllegalAccessException();
            }

        } catch (InvocationTargetException e) {
            Systems.out.println(String.format("%s: %s",TAG, Objects.requireNonNull(e.getMessage())));
        }
        return null;
    }
}

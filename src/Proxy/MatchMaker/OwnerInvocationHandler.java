package Proxy.MatchMaker;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean person;

    public OwnerInvocationHandler(PersonBean person){
        this.person = person;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException{
        try {
            if (method.getName().startsWith("get"))
                return method.invoke(person, args);
            else if (method.getName().equals("setHotOrNotRating"))
                throw new IllegalAccessException();
            else if (method.getName().startsWith("set"))
                return method.invoke(person, args);
        } catch (InvocationTargetException e){
            e.printStackTrace();
        }
        return null;
    }

    PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }
}
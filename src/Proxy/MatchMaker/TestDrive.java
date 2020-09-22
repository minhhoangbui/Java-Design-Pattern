package Proxy.MatchMaker;

import java.util.HashMap;

public class TestDrive {
    HashMap<String, PersonBean> datingDB = new HashMap<>();
    public static void main(String[] args) {
        TestDrive test = new TestDrive();
        test.drive();
    }

    public TestDrive() {
        initializeDatabase();
    }

    public void drive(){
        PersonBean joe = getPersonFromDatabase("Joe Javabean");
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("football, wine");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.err.println("Cannot set rating himself");
        }

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("girls, dolls");
        } catch (Exception e) {
            System.err.println("Cannot execute this method");
        }
        nonOwnerProxy.setHotOrNotRating(9);
    }

    void initializeDatabase() {
        PersonBean joe = new PersonBeanImpl();
        joe.setName("Joe Javabean");
        joe.setGender("male");
        joe.setInterests("cars, robots");
        joe.setHotOrNotRating(8);

        PersonBean kelly = new PersonBeanImpl();
        kelly.setName("Kelly Clarkson");
        kelly.setGender("female");
        kelly.setInterests("shopping, movie");
        kelly.setHotOrNotRating(7);

        datingDB.put(joe.getName(), joe);
        datingDB.put(kelly.getName(), kelly);
    }

    PersonBean getPersonFromDatabase(String name) {
        return datingDB.get(name);
    }

    PersonBean getOwnerProxy(PersonBean person) {
        OwnerInvocationHandler handler = new OwnerInvocationHandler(person);
        return handler.getOwnerProxy(person);
    }

    PersonBean getNonOwnerProxy(PersonBean person) {
        NonOwnerInvocationHandler handler = new NonOwnerInvocationHandler(person);
        return handler.getNonOwnerProxy(person);
    }
}

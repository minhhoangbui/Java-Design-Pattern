package Proxy.Gumball;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    private static final long serialVersionUID = 2L;
    State soldState;
    State noQuarterState;
    State hasQuarterState;
    State soldOutState;

    State state;
    int count = 0;
    String location;

    public GumballMachine(String location, int numberOfBalls) throws RemoteException {
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);

        this.location = location;
        this.count = numberOfBalls;

        if (numberOfBalls > 0){
            System.out.println("This machine at " + location + " has " + numberOfBalls +
                    " balls at the beginning");
            state = noQuarterState;
        }
        else
            state = soldOutState;
    }

    public void releaseBall() {
        System.out.println("A ball is rolling out...");
        if (count != 0)
            count--;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void refill(int numberOfBalls) {
        state.refill(numberOfBalls);
        state = noQuarterState;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public State getState() {
        return state;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "GumballMachine at " + getLocation();
    }
}

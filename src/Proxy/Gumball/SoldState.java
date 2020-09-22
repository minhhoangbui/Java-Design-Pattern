package Proxy.Gumball;

public class SoldState implements State{
    transient GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.err.println("Please wait a minute before inserting");
    }

    @Override
    public void ejectQuarter() {
        System.err.println("We already gave out a ball");
    }

    @Override
    public void turnCrank() {
        System.err.println("You just did that");
    }

    @Override
    public void refill(int numberOfBalls) {
        System.err.println("We're not sure that we can refill now");
    }

    @Override
    public void dispense() {
        System.out.println("Alright, we are about to dispense");
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() > 0)
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        else
            gumballMachine.setState(gumballMachine.getSoldOutState());
    }


    public String toString() {
        return "Dispensing a gumball";
    }
}

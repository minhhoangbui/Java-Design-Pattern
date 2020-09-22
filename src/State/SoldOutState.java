package State;

public class SoldOutState implements State{
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.err.println("Why the heck inserting more quarter?");
    }

    @Override
    public void ejectQuarter() {
        System.err.println("You don't have anything here to eject");
    }

    @Override
    public void dispense() {
        System.err.println("There aren't no balls to dispense");
    }

    @Override
    public void turnCrank() {
        System.err.println("Turn crank for that when there is nothing here");
    }

    @Override
    public void refill(int numberOfBalls) {
        System.out.println("Thank God. Now we could keep playing");
        gumballMachine.setCount(numberOfBalls);
    }
}

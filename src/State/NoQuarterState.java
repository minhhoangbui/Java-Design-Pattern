package State;

public class NoQuarterState implements State{
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Thank you to insert a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void turnCrank() {
        System.err.println("How to turn crank when you don't have quarter");
    }

    @Override
    public void dispense() {
        System.err.println("You don't have a quarter to dispense");
    }

    @Override
    public void ejectQuarter() {
        System.err.println("You can't eject what you don't have");
    }

    @Override
    public void refill(int numberOfBalls) {
        System.err.println("It's too soon to do things like this");
    }
}

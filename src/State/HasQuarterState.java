package State;

public class HasQuarterState implements State{
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Okay, here you are");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void dispense() {
        System.err.println("You haven't turned crank yet");
    }

    @Override
    public void insertQuarter() {
        System.err.println("You cannot insert two quarters");
    }

    @Override
    public void turnCrank() {
        System.out.println("Okay. You gonna have your ball soon");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void refill(int numberOfBalls) {
        System.err.println("Maybe there are still balls to play");
    }
}

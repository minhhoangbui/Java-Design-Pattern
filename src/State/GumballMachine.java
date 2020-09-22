package State;

public class GumballMachine {
    State soldState;
    State noQuarterState;
    State hasQuarterState;
    State soldOutState;

    State state;
    int count;

    public GumballMachine(int numberOfBalls) {
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        this.count = numberOfBalls;
        if (numberOfBalls > 0){
            System.out.println("This machine has " + numberOfBalls + " balls at the beginning");
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
    }

    public void setState(State state) {
        this.state = state;
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
}

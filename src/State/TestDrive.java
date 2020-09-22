package State;

public class TestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(2);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("------------");

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("------------");

        gumballMachine.insertQuarter();
    }
}

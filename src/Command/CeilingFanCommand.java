package Command;

public abstract class CeilingFanCommand implements Command{
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public abstract void execute();

    public void undo() {
        switch (prevSpeed) {
            case CeilingFan.HIGH: ceilingFan.high();
                break;
            case CeilingFan.MEDIUM: ceilingFan.medium();
                break;
            case CeilingFan.LOW: ceilingFan.low();
                break;
            case CeilingFan.OFF: ceilingFan.off();
                break;
            default: System.out.println("Invalid status");
                System.exit(1);
        }
    }
}

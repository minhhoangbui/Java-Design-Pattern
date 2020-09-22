package Command;

public class TestDrive {
    public static void main(String[] args) {
        RemoteControlWithUndo controller = new RemoteControlWithUndo();
        CeilingFan ceilingFan = new CeilingFan("Living room");
        Light light = new Light();

        Command ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        Command ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        Command ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        controller.setCommand(0, lightOnCommand, lightOffCommand);
        controller.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);

        Command[] studyMode = {lightOnCommand, ceilingFanMediumCommand};
        Command[] restMode = {lightOffCommand, ceilingFanOffCommand};
        Command studyCommand = new MacroCommand(studyMode);
        Command restCommand = new MacroCommand(restMode);
        controller.setCommand(2, studyCommand, restCommand);

        controller.onButtonWasPushed(0);
        controller.onButtonWasPushed(1);
        controller.offButtonWasPushed(1);
        controller.offButtonWasPushed(0);
        controller.onButtonWasPushed(2);
        controller.offButtonWasPushed(2);
    }
}

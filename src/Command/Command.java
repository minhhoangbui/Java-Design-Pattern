package Command;

// It seems similar to Facade, which use another interface to simplify another interface

public interface Command {
    void execute();

    void undo();
}

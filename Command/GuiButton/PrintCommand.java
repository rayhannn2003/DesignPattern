package Command.GuiButton;

class PrintCommand implements Command {
    private ApplicationLogic app;

    public PrintCommand(ApplicationLogic app) {
        this.app = app;
    }

    public void execute() {
        app.print();
    }
}

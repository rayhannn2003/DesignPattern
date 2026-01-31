package Command.GuiButton;
class ExitCommand implements Command {
    private ApplicationLogic app;

    public ExitCommand(ApplicationLogic app) {
        this.app = app;
    }

    public void execute() {
        app.exit();
    }
}

package Command.GuiButton;

class SaveCommand implements Command {
    private ApplicationLogic app;

    public SaveCommand(ApplicationLogic app) {
        this.app = app;
    }

    public void execute() {
        app.save();
    }
}

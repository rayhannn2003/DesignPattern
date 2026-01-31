package Command.GuiButton;

public class Main {
    public static void main(String[] args) {

        ApplicationLogic app = new ApplicationLogic();

        Button saveButton = new Button();
        Button printButton = new Button();
        Button exitButton = new Button();

        saveButton.setCommand(new SaveCommand(app));
        printButton.setCommand(new PrintCommand(app));
        exitButton.setCommand(new ExitCommand(app));

        saveButton.click();
        printButton.click();
        exitButton.click();
    }
}


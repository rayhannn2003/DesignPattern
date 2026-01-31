package Mediator.DialogBox;

// import Mediator.DialogBox.DialogBox.ListBox;

public class MediatorDemo {
    public static void main(String[] args) {
        DialogBox dialog = new DialogBox();

        Button button = new Button(dialog);
        TextBox textBox = new TextBox(dialog);
        ListBox listBox = new ListBox(dialog);

        dialog.setComponents(button, textBox, listBox);

        button.click();
    }
}

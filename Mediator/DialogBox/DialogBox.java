package Mediator.DialogBox;

// import Mediator.DialogBox.DialogBox.DialogMediator;
// import Mediator.DialogBox.DialogBox.ListBox;

class DialogBox implements DialogMediator {

    Button button;
    TextBox textBox;
    ListBox listBox;

    void setComponents(Button b, TextBox t, ListBox l) {
        button = b;
        textBox = t;
        listBox = l;
    }

    public void notify(Component sender, String event) {
        if (sender == button && event.equals("click")) {
            textBox.clear();
            listBox.update();
        }
    }
}

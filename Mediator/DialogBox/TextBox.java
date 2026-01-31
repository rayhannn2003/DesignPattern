package Mediator.DialogBox;

// import Mediator.DialogBox.DialogBox.DialogMediator;

class TextBox extends Component {
    TextBox(DialogMediator mediator) {
        super(mediator);
    }

    void clear() {
        System.out.println("TextBox cleared");
    }
}

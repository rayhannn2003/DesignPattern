package Mediator;

class TextBox extends Component {
    TextBox(DialogMediator mediator) {
        super(mediator);
    }

    void clear() {
        System.out.println("TextBox cleared");
    }
}

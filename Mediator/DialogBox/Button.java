package Mediator.DialogBox;

// import Mediator.DialogBox.DialogBox.DialogMediator;

class Button extends Component {
    Button(DialogMediator mediator) {
        super(mediator);
    }

    void click() {
        mediator.notify(this, "click");
    }
}

package Mediator;

class Button extends Component {
    Button(DialogMediator mediator) {
        super(mediator);
    }

    void click() {
        mediator.notify(this, "click");
    }
}

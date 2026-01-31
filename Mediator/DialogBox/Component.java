package Mediator.DialogBox;

// import Mediator.DialogBox.DialogBox.DialogMediator;

abstract class Component {
    protected DialogMediator mediator;

    Component(DialogMediator mediator) {
        this.mediator = mediator;
    }
}

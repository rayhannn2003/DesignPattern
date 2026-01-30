package Mediator;

abstract class Component {
    protected DialogMediator mediator;

    Component(DialogMediator mediator) {
        this.mediator = mediator;
    }
}

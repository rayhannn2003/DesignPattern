package Mediator.DialogBox;

class ListBox extends Component {
    ListBox(DialogMediator mediator) {
        super(mediator);
    }

    void update() {
        System.out.println("ListBox updated");
    }
}

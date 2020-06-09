// Invoker
public class Assistant {
    Command command;

    public void takeOrder(Command c){
        command = c;
        command.orderUp();
    }
}

public abstract class NotifierDecorator implements Notifier {
    protected Notifier decoratedNotifier;

    public NotifierDecorator(Notifier decoratedNotifier) {
        this.decoratedNotifier = decoratedNotifier;
    }

    public void send(String message) {
        decoratedNotifier.send(message);
    }
}
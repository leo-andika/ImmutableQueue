import interfaces.Queue;

/**
 * representation of an empty queue
 *
 * @param <T>
 */
public final class EmptyQueue<T> implements Queue<T> {

    private final static EmptyQueue emptyQueue = new EmptyQueue();

    static EmptyQueue getInstance() {
        return emptyQueue;
    }

    @SuppressWarnings("unchecked")
    public Queue<T> enQueue(T t) {
        return new ImmutableQueue<T>(ImmutableStack.getEmptyStack().push(t), ImmutableStack.getEmptyStack());
    }

    public Queue<T> deQueue() throws Exception {
        throw new Exception("this is an empty queue");
    }

    public T head() throws Exception {
        throw new Exception("this is an empty queue");
    }

    public boolean isEmpty() {
        return true;
    }
}

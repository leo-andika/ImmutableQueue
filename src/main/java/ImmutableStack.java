import interfaces.Stack;

public class ImmutableStack<T> implements Stack<T> {

    private final T head;
    private final Stack<T> tail;

    public ImmutableStack(T head, Stack<T> tail) {
        this.head = head;
        this.tail = tail;
    }

    public final Stack<T> push(T t) {
        return new ImmutableStack<T>(t, this);
    }

    public final Stack<T> pop() {
        return tail;
    }

    public final T getHead() {
        return this.head;
    }

    public final boolean isEmpty() {
        return false;
    }

    /**
     * get the empty stack
     * @return the singleton instance of an empty stack
     */
    public final static Stack getEmptyStack(){
        return EmptyStack.getInstance();
    }
}

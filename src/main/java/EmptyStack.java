import interfaces.Stack;

/**
 * representation of an empty stack
 * @param <T>
 */
public final class EmptyStack<T> implements Stack<T> {

    private final static EmptyStack emptyStack = new EmptyStack();

    public final static EmptyStack getInstance() {
        return emptyStack;
    }

    public final Stack<T> push(T t) {
        return new ImmutableStack<T>(t, this);
    }

    public final Stack<T> pop() throws Exception {
        throw new Exception("Stack is empty");
    }

    public final T getHead() throws Exception {
        throw new Exception("Stack is empty");
    }

    public final boolean isEmpty() {
        return true;
    }


}

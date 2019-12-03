import interfaces.Queue;
import interfaces.Stack;

public class ImmutableQueue<T> implements Queue<T> {

    private final Stack<T> forwards;
    private final Stack<T> backwards;

    public ImmutableQueue(Stack<T> forwards, Stack<T> backwards) {
        this.forwards = forwards;
        this.backwards = backwards;
    }

    /**
     * Get the reverse version of given stack
     *
     * @param stack that will be reversed
     * @return reversed version of the stack
     * @throws Exception
     */
    public static Stack getReversedStack(Stack stack) throws Exception {
        Stack r = new EmptyStack();
        while (!stack.isEmpty()) {
            r = r.push(stack.getHead());
            stack = stack.pop();
        }

        return r;
    }

    /**
     * get the empty version of the queue
     *
     * @return empty queue
     */
    public static Queue getEmptyQueue() {
        return EmptyQueue.getInstance();
    }

    public Queue<T> enQueue(T t) {
        return new ImmutableQueue<T>(forwards, backwards.push(t));
    }

    @SuppressWarnings("unchecked")
    public Queue<T> deQueue() throws Exception {
        Stack<T> newF = forwards.pop();
        if (!newF.isEmpty()) {
            return new ImmutableQueue<T>(newF, backwards);
        } else if (backwards.isEmpty()) {
            return ImmutableQueue.getEmptyQueue();
        } else {
            return new ImmutableQueue<T>(ImmutableQueue.getReversedStack(backwards), ImmutableStack.getEmptyStack());
        }
    }

    public T head() throws Exception {
        if (this.isEmpty()) {
            return null;
        }
        return this.forwards.getHead();
    }

    public boolean isEmpty() {
        return false;
    }
}

package interfaces;

public interface Stack<T> {

    /**
     * Push new element to the stack
     *
     * @param t the generic element which will be inserted to the stack
     * @return new stack after the element is inserted
     */
    Stack<T> push(T t);

    /**
     * Remove the top element of the stack
     *
     * @return the new stack after the top element is removed
     */
    Stack<T> pop() throws Exception;

    /**
     * Get the top element of the stack
     *
     * @return the top element of the stack
     */
    T getHead() throws Exception;

    /**
     * Used to check if the stack is empty
     *
     * @return true if the stack is empty. Otherwise, return false
     */
    boolean isEmpty();

}

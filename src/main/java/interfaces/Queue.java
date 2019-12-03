package interfaces;

public interface Queue<T> {

    /**
     * This function is used to insert new generic element to a queue
     *
     * @param t the element which will be inserted to the queue
     * @return new queue after the element is inserted
     */
    Queue<T> enQueue(T t);

    /**
     * This function is used to remove the head element of the queue
     *
     * @return new queue after the head element is removed
     */
    Queue<T> deQueue() throws Exception;

    /**
     * Get the head element of the queue
     *
     * @return the head element of the queue
     */
    T head() throws Exception;

    /**
     * Used to check if the queue is empty
     *
     * @return true when the queue is empty. Otherwise, return false
     */
    boolean isEmpty();
}

import interfaces.Queue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmptyQueueTest {

    Queue<Integer> queue;

    @Before
    public void setUp() {
        queue = new EmptyQueue<>();
    }

    @Test
    public void testGetInstance_ShouldReturnSingletonInstance() {
        Queue<Integer> expected = EmptyQueue.getInstance();

        Assert.assertEquals(EmptyQueue.getInstance(), expected);
    }

    @Test
    public void testEnqueue_ShouldInsertNewElement() throws Exception {
        Integer data = 100;
        queue = queue.enQueue(data);

        Assert.assertEquals(queue.head(), data);
    }

    @Test(expected = Exception.class)
    public void testDequeueEmptyQueue_ShouldThrowException() throws Exception {
        queue.deQueue();
    }

    @Test(expected = Exception.class)
    public void testHeadEmptyQueue_ShouldThrowException() throws Exception {
        queue.head();
    }

    @Test
    public void testIsEmptyOnEmptyQueue_ShouldReturnTrue() {
        Assert.assertTrue(queue.isEmpty());
    }


}

import interfaces.Queue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ImmutableQueueTest {

    Queue<String> queue;

    @Before
    public void setUp(){
        queue = ImmutableQueue.getEmptyQueue();
    }

    @Test
    public void testEnQueue_ShouldCreateNewQueueWithNewElement() {
        Queue<String> queue2 = ImmutableQueue.getEmptyQueue();
        String data = "unit test";

        queue = queue.enQueue(data);
        Assert.assertNotSame(queue, queue2);
    }

    @Test
    public void testDequeueFromOneMemberQueue_ShouldReturnEmptyQueue() throws Exception {
        String data = "unit test";
        queue = queue.enQueue(data);

        Assert.assertSame(queue.head(), data);
        queue = queue.deQueue();
        Assert.assertTrue(queue.isEmpty());
    }

    @Test(expected = Exception.class)
    public void testDequeueFromEmptyQueue_ShouldThrowException() throws Exception {
        queue.deQueue();
    }

    @Test
    public void testDequeue_ShouldReturnQueueWithoutRemovedElement() throws Exception {
        String data1 = "unit";
        String data2 = "test";
        queue = queue.enQueue(data1).enQueue(data2);
        Assert.assertEquals(queue.head(), data1);

        queue = queue.deQueue();
        Assert.assertEquals(queue.head(), data2);
    }

    @Test
    public void testHead_ShouldReturnHeadElementOfQueue() throws Exception {
        String data1 = "unit";
        String data2 = "test";
        queue = queue.enQueue(data1).enQueue(data2);

        Assert.assertEquals(queue.head(), data1);
    }

    @Test(expected = Exception.class)
    public void testHeadFromEmptyQueue_ShouldThrowException() throws Exception {
        queue.head();
    }

    @Test
    public void testIsEmptyOnFilledQueue_ShouldReturnFalse() {
        String data1 = "unit";
        String data2 = "test";
        queue = queue.enQueue(data1).enQueue(data2);
        Assert.assertFalse(queue.isEmpty());
    }

}

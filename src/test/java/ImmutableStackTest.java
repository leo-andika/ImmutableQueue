import interfaces.Stack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ImmutableStackTest {

    Stack<String> stack;

    @Before
    public void setUp() {
        stack = ImmutableStack.getEmptyStack();
    }

    @Test
    public void testPushElement_ShouldReturnNewStackWithAddedElement() throws Exception {
        String data = "paypay";

        Assert.assertTrue(stack.isEmpty());

        stack = stack.push(data);
        Assert.assertFalse(stack.isEmpty());
        Assert.assertEquals(stack.getHead(), data);
    }

    @Test
    public void testPop_ShouldReturnStackWithoutRemovedElement() throws Exception {
        String data1 = "paypay";
        String data2 = "japan";
        stack = stack.push(data1).push(data2);
        Assert.assertEquals(stack.getHead(), data2);
        stack = stack.pop();
        Assert.assertNotEquals(stack.getHead(), data2);
    }

    @Test(expected = Exception.class)
    public void testPopFromEmptyStack_ShouldThrowException() throws Exception {
        stack.pop();
    }

    @Test(expected = Exception.class)
    public void testHeadFromEmptyStack_ShouldThrowException() throws Exception {
        stack.getHead();
    }

    @Test
    public void testIsEmptyOnFilledStack_ShouldReturnFalse() {
        String data1 = "paypay";
        String data2 = "japan";
        stack = stack.push(data1).push(data2);

        Assert.assertFalse(stack.isEmpty());
    }
}

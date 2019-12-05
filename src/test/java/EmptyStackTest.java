import interfaces.Stack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmptyStackTest {

    Stack<Integer> stack;

    @Before
    public void setUp() {
        stack = new EmptyStack<>();
    }

    @Test
    public void testGetInstance_ShouldReturnSingletonObject() {
        Stack<Integer> expected = EmptyStack.getInstance();

        Assert.assertEquals(EmptyStack.getInstance(), expected);
    }

    @Test
    public void testPushEmptyStack_ShouldInsertNewElement() throws Exception {
        Integer data = 99;
        stack = stack.push(data);

        Assert.assertEquals(stack.getHead(), data);
    }

    @Test(expected = Exception.class)
    public void testPopEmptyStack_ShouldThrowException() throws Exception {
        stack.pop();
    }

    @Test(expected = Exception.class)
    public void testGetHeadEmptyStack_ShouldThrowException() throws Exception {
        stack.getHead();
    }

    @Test
    public void testIsEmpty_ShouldReturnTrue() {
        Assert.assertTrue(stack.isEmpty());
    }


}

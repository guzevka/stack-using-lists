import java.util.ArrayList;
import java.util.List;

public class Stack {
    private final List<Integer> stack = new ArrayList<>();

    public void push(int e) {
        stack.add(e);
    }
    public int pop() {
        int tmp = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return tmp;
    }
    public boolean isEmpty() {
        return (stack.size() == 0);
    }
    public Object[] toArray() {
        return stack.toArray();
    }
    public int size() {
        return stack.size();
    }
}

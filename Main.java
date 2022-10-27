public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(4);
        stack.push(0);
        stack.push(-2);

        while(!stack.isEmpty()) {
            int value = stack.pop();
            System.out.print(value);
            System.out.print(" ");
        }

        for(int i=0; i<stack.size(); i++) System.out.println(stack.toArray()[i]);

    }
}
package collections_impl.stack;

public class StackImplDriver {

    public static void main (String args[]){
        Stack stack = new Stack();
        stack.push(5);
        stack.push(10);
        stack.push(35);
        stack.push(20);

        System.out.println("Size:" +stack.size);
        System.out.println("top value is :"  +stack.top());
        System.out.println("Removed : " +stack.pop());
        System.out.println("top value is :"  +stack.top());
    }


}

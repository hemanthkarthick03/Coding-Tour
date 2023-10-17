package Stack.Java;

class Stack {
    private int arr[];
    private int top;
    private int capacity;

    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            System.exit(1);
        }

        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(1);
        }

        return arr[top--];
    }

    public void printStack() {
        System.out.print("Stack : ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(0);
        st.push(5);
        st.push(3);

        System.out.println("Popped Element: " + st.pop());

        st.printStack();
    }
}
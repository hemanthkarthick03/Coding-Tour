#include <bits/stdc++.h>

class Stack {
    int size, top;
    int * arr;

    public:
        Stack(){
            top = -1;
            size = 1000;
            arr = new int[size];
        }

        void push(int x){
            top++;
            arr[top]=x;
        }

        int pop(){
            int x = arr[top];
            top--;
            return x;
        }

        int Top(){
            return arr[top];
        }

        int Size(){
            return top+1;
        }
};

int main(){
    Stack st;
    st.push(1);
    st.push(2);
    st.push(3);

    std::cout << st.Top() << " ";
    std::cout << st.pop() << " ";
    std::cout << st.Top();
}
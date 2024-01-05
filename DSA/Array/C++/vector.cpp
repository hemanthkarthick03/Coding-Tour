class DynamicArray {
private:
    int* arr;
    int len;
    int capacity;

public:
    DynamicArray(int capacity) : capacity(capacity),len(0) {    
        if (capacity<=0)    
            return;
    
        arr = new int[capacity];      
    }

    int get(int i) {
        return arr[i];
    }

    void set(int i, int n) {
        arr[i]=n;    
    }

    void pushback(int n) {
        
        if (capacity==len)
            resize();
        arr[len]=n;
        len++;
    }

    int popback() {
        if (len>0)
            len--;
        return arr[len];
    }

    void resize() {
        capacity *= 2;
        int* newArr = new int[capacity];
        for (int i=0;i<len;i++)
            newArr[i] = arr[i];
        
        delete[] arr;
        arr = newArr;
    }

    int getSize() {
        return len;
    }

    int getCapacity() {
        return capacity;
    }
};

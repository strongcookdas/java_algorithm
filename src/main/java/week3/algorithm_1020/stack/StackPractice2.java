package week3.algorithm_1020.stack;

public class StackPractice2 {

    private Integer[] arr;
    private int top = -1;

    public int getTop() {
        return top;
    }

    public Integer[] getArr() {
        return arr;
    }

    public StackPractice2() {
        this.arr = new Integer[10000];
    }

    public StackPractice2(int size) {
        this.arr = new Integer[size];
    }

    public void push(int value) {
        this.arr[++top] = value;
    }

    public int pop() {
        if(this.isEmpty()){
            throw new RuntimeException("스택이 비었습니다.");
        }
        return this.arr[top--];
    }


    public boolean isEmpty() {
        return (top == -1) ? true : false;
    }
}

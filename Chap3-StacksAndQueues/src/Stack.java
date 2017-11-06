import java.util.LinkedList;

public class Stack {
	LinkedList<Integer> head=new LinkedList<Integer>();
	int size=0,maxSize;
	Stack(){
		
	}
	Stack(int s){
		maxSize=s;
	}
	void push(int d){
		head.addFirst(d);
		size++;
	}
	int pop(){
		int ele=head.removeFirst();
		size--;
		return ele;
	}
	int top(){
		return head.getFirst();
	}
	int sizeOfStack(){
		return size;
	}
	boolean isEmpty(){
		return head.isEmpty();
	}
	boolean isFull(){
		return maxSize==size;
	}
}

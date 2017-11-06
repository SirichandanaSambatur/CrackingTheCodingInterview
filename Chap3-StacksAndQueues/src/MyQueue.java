
public class MyQueue {
	Stack pushStack;
	Stack popStack;
	int size=0;
	MyQueue(){
		pushStack=new Stack();
		popStack=new Stack();
	}
	boolean isFull(){
		if(pushStack.isFull()&&popStack.isFull())
			return true;
		return false;
	}
	void moveElements(){
		if(popStack.isEmpty()){
			while(!pushStack.isEmpty()){
				popStack.push(pushStack.pop());
			}
		}
	}
	void insert(int ele){
			pushStack.push(ele);
			size++;
	}
	int remove(){
		if(pushStack.isEmpty()&&popStack.isEmpty()){
			return -1;
		}
		if(popStack.isEmpty())
			moveElements();
		size--;
		return popStack.pop();
		
	}
	
	public static void main(String args[]){
		MyQueue mq=new MyQueue();
		mq.insert(1);
		mq.insert(2);
		mq.insert(3);
		mq.insert(24);
		System.out.println("Element popped= "+mq.remove());
		System.out.println("Element popped= "+mq.remove());
	}

}

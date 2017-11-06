
public class StackMin {
	Stack values;
	Stack minValues;

	StackMin(int size){
		values=new Stack(size);
		minValues=new Stack(size);
	}
	int minimunValueOfStack(){
		return minValues.top();
	}
	void insertIntoMinStack(int data){
		if(values.isEmpty()){
			values.push(data);
			minValues.push(data);
		}
		else{
			values.push(data);
			if(data<minValues.top()){
				minValues.push(data);
			}
			else
				minValues.push(minValues.top());
		}
	}
	
	int removeFromMinStack(){
		if(values.isEmpty()){
			System.out.println("Stack is empty");
			return -1;
		}
		int ele=values.pop();
		minValues.pop();
		return ele;
	}
	int topOfMinStack(){
		return values.top();
	}
	int sizeOfMinStack(){
		return values.sizeOfStack();
	}
	public static void main(String args[]){
		StackMin sm=new StackMin(5);
		sm.insertIntoMinStack(6);
		sm.insertIntoMinStack(5);
		sm.insertIntoMinStack(9);
		System.out.println("The minimum of stack is "+sm.minimunValueOfStack());
		sm.insertIntoMinStack(3);
		sm.insertIntoMinStack(4);
		System.out.println("The minimum of stack is "+sm.minimunValueOfStack());
		System.out.println("The element popped from stack is "+sm.removeFromMinStack());
		System.out.println("The minimum of stack is "+sm.minimunValueOfStack());
		
	}

}

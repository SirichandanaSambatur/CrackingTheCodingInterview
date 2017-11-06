
public class SortStack {
	Stack sortedStack=new Stack();
	Stack tempStack=new Stack();
	
	void pushIntoSort(int d){
		if(isEmpty()){
			sortedStack.push(d);
			return;
		}
		while(peekSort()>d)
			{
				tempStack.push(sortedStack.pop());
				if(sortedStack.isEmpty())
					break;
			}
		sortedStack.push(d);
		while(!tempStack.isEmpty()){
				sortedStack.push(tempStack.pop());
			}
	}
	
	int popFromSort(){
		if(isEmpty())
		{
			System.out.println("Stack empty");
			return -1;
		}
		return sortedStack.pop();
	}
	
	int peekSort(){
		if(isEmpty())
		{
			System.out.println("Stack empty");
			return -1;
		}
		return sortedStack.top();
	}
	boolean isEmpty(){
		return sortedStack.isEmpty(); 
	}
	void display(){
		Stack tempD=sortedStack;
		while(!tempD.isEmpty())
			System.out.println(tempD.pop());
	}
	public static void main(String args[]){
		SortStack ss=new SortStack();
		ss.pushIntoSort(6);
		ss.pushIntoSort(8);
		ss.pushIntoSort(2);
		ss.pushIntoSort(4);
		System.out.println("Popped element= "+ss.popFromSort());
		ss.display();
	}
}

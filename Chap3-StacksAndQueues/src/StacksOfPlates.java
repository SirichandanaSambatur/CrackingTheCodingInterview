import java.util.ArrayList;

public class StacksOfPlates {
	ArrayList<Stack> setOfPlates=new ArrayList<Stack>();
	int sizeOfStack=4;
	Stack getLast(){
		int size=setOfPlates.size();
		return setOfPlates.get(size-1);
	}
	void pushIntoSet(int data){
		if(setOfPlates.isEmpty()){
			Stack newStack=new Stack(sizeOfStack);
			newStack.push(data);
			setOfPlates.add(newStack);
		}
		else{
		Stack last=getLast();
		if(last.isFull()){
			Stack newStack=new Stack(sizeOfStack);
			newStack.push(data);
			setOfPlates.add(newStack);
		}
		else
			last.push(data);}
	}
	int popFromSet(){
		Stack last=getLast();
		int ele=last.pop();
		if(last.sizeOfStack()==0){
			setOfPlates.remove(last);
		}
		return ele;
	}
	int numberOfStacks(){
		return setOfPlates.size();
	}
	public static void main(String args[]){
		StacksOfPlates sop=new StacksOfPlates();
		sop.pushIntoSet(1);
		sop.pushIntoSet(2);
		sop.pushIntoSet(3);
		sop.pushIntoSet(15);
		sop.pushIntoSet(61);
		System.out.println("Number of stacks= "+sop.numberOfStacks());
		System.out.println("Popped element= "+sop.popFromSet());
		sop.pushIntoSet(61);
		sop.pushIntoSet(451);
		sop.pushIntoSet(616);
		sop.pushIntoSet(617);
		sop.pushIntoSet(17);
		sop.pushIntoSet(7);
		System.out.println("Number of stacks= "+sop.numberOfStacks());
	}

}

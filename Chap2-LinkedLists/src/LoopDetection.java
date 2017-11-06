//Chapter 2- Problem 2.8
//Author- Siri Chandana S
//variation doesn't find circle by address, finds circle by value.
public class LoopDetection {
	Node circle(LinkedList one){
		Node intersects=null;
		Node slow=one.head;
		Node fast=one.head;
		while(slow.data!=fast.data&&slow!=one.head&&fast!=one.head){
			slow=slow.next;
			fast=fast.next.next;
		}
		slow=one.head;
		while(slow.data!=fast.data){
			slow=slow.next;
			fast=fast.next;
		}
		intersects=slow;
		return intersects;
	}
	public static void main(String args[]){
		LinkedList myList=new LinkedList();
		myList.appendToHead(1);
		myList.appendToHead(2);
		myList.appendToHead(3);
		myList.appendToHead(4);
		myList.appendToHead(5);
		myList.appendToHead(6);
		myList.appendToHead(7);
		myList.appendToHead(2);
		LoopDetection ld=new LoopDetection();
		Node found=ld.circle(myList);
		System.out.print(found.data);
	}

}

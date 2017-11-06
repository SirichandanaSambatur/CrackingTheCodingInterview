//Chapter 2- Problem 2.4
//Author Siri Chandana S
public class Partition {
	LinkedList divideList(LinkedList head, int val){
		System.out.println("Inside partition");
		LinkedList less=new LinkedList();
		LinkedList more=new LinkedList();
		int v;
		Node temp=head.head;
		while(temp!=null){
			v=temp.data;
			temp=temp.next;
			if(v<val)
				less.appendToTail(v);
			else
				more.appendToTail(v);
			
		}
		less.head=less.addList(more);
		less.display();
		return less;	
	}
	public static void main(String args[]){
		System.out.println("Performing partition");
		LinkedList first = new LinkedList();
		first.appendToTail(3);
		first.appendToTail(5);
		first.appendToTail(8);
		first.appendToTail(5);
		first.appendToTail(10);
		first.appendToTail(2);
		first.appendToTail(1);
		Partition p=new Partition();
		LinkedList m=p.divideList(first, 5);
		m.display();
	}
}

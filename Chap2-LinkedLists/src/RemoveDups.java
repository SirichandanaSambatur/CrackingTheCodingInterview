/* 2.1  Write a code to remove duplicates from an unsorted linked list*/
import java.util.HashSet;

public class RemoveDups {
	LinkedList remove(LinkedList head1){
		HashSet<Integer> checkMap= new HashSet<Integer>();
		Node first=head1.head;
		Node previous=head1.head;
		while(first!=null){
			if(checkMap.contains(first.data))
			{
				previous.next=first.next;
			}
			else{
				checkMap.add(first.data);
				previous=first;
			}
			first=first.next;
		}
		return head1;
	}
	
	public static void main(String args[]){
		LinkedList head= new LinkedList();
		head.appendToTail(1);
		head.appendToTail(2);
		head.appendToTail(1);
		head.appendToTail(45);
		head.appendToTail(45);
		head.appendToTail(2);
		RemoveDups r= new RemoveDups();
		head=r.remove(head);
		Node temp=head.head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

}

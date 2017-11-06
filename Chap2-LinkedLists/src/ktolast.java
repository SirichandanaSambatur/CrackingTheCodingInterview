//Chapter 2- Problem 2.2
//Author-Siri Chandana S
public class ktolast {

	int printKtolast(LinkedList first, int k){
		int idx=0;
		Node temp=first.head;
		while(temp!=null){
			idx++;
			temp=temp.next;
		}
		return idx-k;
	}
	
	public static void main(String args[]){
		LinkedList head= new LinkedList();
		head.appendToTail(1);
		head.appendToTail(2);
		head.appendToTail(1);
		head.appendToTail(45);		
		head.appendToTail(41);
		head.appendToTail(61);
		head.appendToTail(19);
		ktolast r= new ktolast();
		int val=r.printKtolast(head, 3);
		System.out.println("value"+val);
		Node temp=head.head;
		Node prev=head.head;
		int valn=1;
		while(temp!=null){
			valn++;
			if(valn==val){
				prev.next=temp.next.next;
				break;
		}
			prev=temp;
			temp=temp.next;
		}
		temp=head.head;
	while(temp!=null){
		System.out.println(temp.data);
		temp=temp.next;
	}
	}
}

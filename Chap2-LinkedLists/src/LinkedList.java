// Data Structure Linked List
//Author- Siri Chandana S
/* Methods implemented
 * appendToTail(int d)- add the element to the end of the list
 * appendToHead(int d)- add the element to the front of the list
 * deleteNode(int d)- find the element in the list and delete it
 * display()-show the contents of the linked list
 * get(int idx)- returns the element present at the index
 * addList(LinkedList list)- appends the linked list passed to the end of the linked list
 */
public class LinkedList {
		Node head=null;
		int count=0;
		void appendToTail(int d){
			Node end = new Node(d);
			count++;
			if(head==null)
				head=end;
			else{Node n=head;
			while(n.next !=null){
				n=n.next;
			}
			n.next=end;}
		}
		void appendToHead(int d){
			Node front=new Node(d);
			front.next=head;
			head=front;
		}
		void deleteNode(int d){
			if(head==null)
				System.out.println("LinkedList is empty");
			else{
			Node n=head;
			if(n.data==d){
				head=head.next;
			}
			while(n.next!=null){
				if(n.next.data==d){
					n.next=n.next.next;
					break;
				}
				n=n.next;
			}
			}
		}
		int get(int idx){
			Node temp=head;
			for(int i=0;i<count;i++){
				if(i==idx)
					break;
				temp=temp.next;
			}
			return temp.data;
		}
		
		Node addList(LinkedList list1){
			Node temp=head;
			if(head==null)
			{
				head=list1.head;
				return head;
			}
			while(temp.next!=null)
				temp=temp.next;
			temp.next=list1.head;
			return head;
		}
		void display(){
			Node temp=head;
			while(temp!=null){
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.print("\n");
		}
	
}

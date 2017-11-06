//Chapter 2- problem 2.7
//Author- Siri Chandana S
public class Intersection {
	Node isIntersect(LinkedList one,LinkedList two){
		Node temp1=one.head;
		Node temp2;
		while(temp1!=null){
			temp2=two.head;
			while(temp2!=null){
			if(temp1.next==temp2)
				return temp2;
			else if(temp2.next==temp1)
				return temp1;
			else
				temp2=temp2.next;
			}
				temp1=temp1.next;
		}
		return null;
	}
	public static void main(String args[]){
		SumOfLists sol=new SumOfLists();
		LinkedList one=new LinkedList();
		one.appendToTail(1);
		one.appendToTail(1);
		one.appendToTail(6);
		LinkedList two=new LinkedList();
		two.appendToTail(5);
		two.appendToTail(9);
		two.appendToTail(2);
		LinkedList three=sol.reverseOrder(one, two);
		three.display();
		LinkedList four=sol.forwardOrder(one, two);
		four.display();
	}
}

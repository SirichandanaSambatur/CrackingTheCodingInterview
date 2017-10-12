
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

}

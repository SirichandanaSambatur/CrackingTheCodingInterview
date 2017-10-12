import java.util.*;
public class SumOfLists {
	LinkedList reverseOrder(LinkedList first, LinkedList second){
		LinkedList sum=new LinkedList();
		int countF=0,countS=0;
		Node temp1=first.head;
		Node temp2=second.head;
		while(temp1!=null){
			countF+=1;
				temp1=temp1.next;}
		while(temp2!=null){
			countS+=1;
			temp2=temp2.next;
		}
		temp1=first.head;
		temp2=second.head;
		int s=0,c=0;
		while(temp1!=null||temp2!=null){
			if(temp1==null)
				s=temp2.data;
			else if(temp2==null)
				s=temp1.data;
			else
				s=temp1.data+temp2.data;
			int p=s%10;
			sum.appendToTail(p+c);
			c=s/10;
			if(temp1!=null)
				temp1=temp1.next;
			if(temp2!=null)
				temp2=temp2.next;
		}	
		return sum;
	}
	LinkedList forwardOrder(LinkedList first, LinkedList second){
		Stack<Integer> buffer=new Stack<Integer>();
		LinkedList sum=new LinkedList();
		int countF=0,countS=0;
		Node temp1=first.head;
		Node temp2=second.head;
		while(temp1!=null){
			countF+=1;
				temp1=temp1.next;}
		while(temp2!=null){
			countS+=1;
			temp2=temp2.next;
		}
		temp1=first.head;
		temp2=second.head;
		while(countS<countF){
			buffer.push(temp1.data);
			temp1=temp1.next;
			countS++;
		}
		while(countS>countF){
			buffer.push(temp2.data);
			temp2=temp2.next;
			countF++;
		}
		while(temp1!=null&&temp2!=null){
			int p=temp1.data+temp2.data;
			buffer.push(p);
			temp1=temp1.next;
			temp2=temp2.next;
		}
		int ele=0;
		int c=0;
		while(!buffer.isEmpty()){
			ele=buffer.pop();
			int p=ele%10;
			sum.appendToHead(p+c);
			c=ele/10;
		}
		if(c!=0)
			sum.appendToHead(c);
		return sum;
	}
	public static void main(String args[]){
		SumOfLists sol=new SumOfLists();
		LinkedList one=new LinkedList();
		one.appendToTail(1);
		one.appendToTail(1);
		one.appendToTail(6);
		LinkedList two=new LinkedList();
		two.appendToTail(5);
		//two.appendToTail(9);
		two.appendToTail(2);
		LinkedList three=sol.reverseOrder(one, two);
		three.display();
		LinkedList four=sol.forwardOrder(one, two);
		four.display();
	}

}

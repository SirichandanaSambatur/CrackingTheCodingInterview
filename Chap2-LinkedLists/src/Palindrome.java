//Chapter 2-Problem 2.6
//Author- Siri Chandana S

import java.util.*;
public class Palindrome {
	boolean checkP(LinkedList one){
		Stack<Integer> buf=new Stack<Integer>();
		Node slow=one.head;
		Node fast=one.head;
		while(fast!=null&&fast.next!=null){
			buf.push(slow.data);
			slow=slow.next;
			fast=fast.next.next;
		}
		if(fast!=null)
			slow=slow.next;
		while(!buf.isEmpty()){
			int ele=buf.pop();
			if(ele!=slow.data)
			{
				return false;
			}
			slow=slow.next;
		}
		return true;
	}
	public static void main(String args[]){
		Palindrome p = new Palindrome();
		LinkedList arr=new LinkedList();
		arr.appendToTail(1);
		arr.appendToTail(2);
		arr.appendToTail(8);
		arr.appendToTail(8);
		arr.appendToTail(9);
		arr.appendToTail(1);
		System.out.println(p.checkP(arr));
	}
}

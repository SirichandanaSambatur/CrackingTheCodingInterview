package oneAway;

public class OneAway {
	public boolean check(String s, String p){
		boolean flag=false;
		if(s.length()==p.length()){
			flag=replaceChar(s,p);
		}
		else if(s.length()+1==p.length()){
			flag=insertChar(p,s);
		}
		else if(p.length()+1==s.length()){
			  flag=deleteChar(s,p);
		}
		else
			flag=false;
		return flag;
		
	}
	public boolean replaceChar(String s1, String s2){
		int count=0;
		for(int i=0;i<s1.length();i++){
			if(count>1)
				return false;
			if(s1.charAt(i)!=s2.charAt(i))
			{
				count++;
			}
		}
		
		return true;
	}
	public boolean insertChar(String longS, String shortS){
		int count=0;
		System.out.println("insert");
		for(int i=0;i<shortS.length();i++){
			//System.out.println(shortS.charAt(i));
			//System.out.println(longS.charAt(i));
			//System.out.println(count);
			if(count>1)
				return false;
			if(shortS.charAt(i)!=longS.charAt(i))
			{
				if(shortS.charAt(i)!=longS.charAt(i+1) )
					count++;
			}
		}
		
		return true;
	}
	public boolean deleteChar(String longS, String shortS){
		int count=0;
		for(int i=0;i<shortS.length();i++){
			//System.out.println(shortS.charAt(i));
			//System.out.println(longS.charAt(i));
			//System.out.println(count);
			if(count>1)
				return false;
			if(shortS.charAt(i)!=longS.charAt(i)&&shortS.charAt(i)!=longS.charAt(i+1) )
			{
					count++;
			}
		}
		
		return true;
	}
	public static void main(String args[]){
		OneAway oa = new OneAway();
		String s1="pleskf";
		String s2="ples";
		System.out.println(oa.check(s1, s2));
	}

}

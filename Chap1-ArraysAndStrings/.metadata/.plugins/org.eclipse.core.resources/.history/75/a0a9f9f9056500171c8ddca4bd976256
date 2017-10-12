
public class URLify {

	public void removeSpaces(StringBuilder s, int truelength){
		int countSpaces=0,idx;
		int len=s.length();
		for(int i=0;i<truelength;i++){
			if(s.charAt(i)==' ')
				countSpaces++;
		}
		idx=truelength+countSpaces*2;
		if(truelength>len) s.setCharAt(truelength, '\0');
		for(int i=truelength-1;i>=0;i--){
			if(s.charAt(i)==' '){
				s.setCharAt(idx-1,'0');
				s.setCharAt(idx-2,'2');
				s.setCharAt(idx-3,'%');
				idx=idx-3;
			}
			else{
				s.setCharAt(idx-1,s.charAt(i));
				idx=idx-1;		
			}
		}
		System.out.println("New string is:"+s.toString());
	}
	public static void main(String args[]){
		StringBuilder myName = new StringBuilder("Mr John Smith    ");
		int truelength=13;
		URLify u=new URLify();
		u.removeSpaces(myName,truelength);
	}
}

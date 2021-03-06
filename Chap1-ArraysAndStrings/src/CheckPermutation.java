
import java.util.Hashtable;

public class CheckPermutation {
	public boolean check(String s, String p){
		int[] countLetters= new int[128];
		int len1=s.length();
		int len2=p.length();
		if(len1!=len2)
			return false;
		for(int i=0;i<len1;i++){
			countLetters[s.charAt(i)]++;
		}
		for(int j=0;j<len2;j++){
			countLetters[p.charAt(j)]--;
			if(countLetters[p.charAt(j)]<0)
				return false;
		}
		return true;
	}
	public static void main(String args[]){
		CheckPermutation cp = new CheckPermutation();
		String t1="asdfgg";
		String t2="gfdsagfgh";
		System.out.println(cp.check(t1, t2));
		
	}

}

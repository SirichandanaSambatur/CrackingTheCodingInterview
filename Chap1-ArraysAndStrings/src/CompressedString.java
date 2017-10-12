package oneAway;

public class CompressedString {
	public String compressed(String s){
		StringBuilder ab= new StringBuilder();
		int count=0;
		for(int i=0;i<s.length();i++){
			count++;
			if(i+1>=s.length()){
				ab.append(s.charAt(i));
				ab.append(count);
				count=0;
			}
			else if(s.charAt(i)!=s.charAt(i+1)){
				ab.append(s.charAt(i));
				ab.append(count);
				count=0;
			}
		}
		if(ab.length()<s.length()){
			System.out.println(s.length());
			return s;
		}
		return ab.toString();
	}
	public static void main(String args[]){
		CompressedString cs=new CompressedString();
		String tr="asdfg";
		//System.out.println(tr.length());
		System.out.println(cs.compressed(tr));
	}
}

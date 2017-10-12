package oneAway;

public class StringRotation {
	public boolean isRotate(String s1,String s2){
		int n= s1.length();
		if(s1.length()==s2.length()&&n>0){
			String temp=s1+s1;
			return temp.contains(s2);
		}
		return false;
	}
	public static void main(String args[]){
		StringRotation sr= new StringRotation();
		String s1="waterk";
		String s2="terway";
		System.out.println(sr.isRotate(s1, s2));
	}
}

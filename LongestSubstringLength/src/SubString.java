import java.util.ArrayList;

public class SubString {

	public static void main(String[] args) {
		String s="abcdabcbb";
		int start=0;
		int end=0;
		int maxLength=0;
		ArrayList<Character> al=new ArrayList<>();
		while(end<s.length()) {
			if(!al.contains(s.charAt(end))) {
				al.add(s.charAt(end));
				end++;
				maxLength=Math.max(maxLength, al.size());
			}else {
				al.remove(Character.valueOf(s.charAt(start)));
					
				start++;
			}
		}
		System.out.println("Maximum length of the Substring is: "+maxLength);

	}

}

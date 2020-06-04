package StringQuestions;

public class ReverseStr {

	public static void main(String[] args) {
		String st="Mohit Bhal";
		System.out.println(st);
		System.out.println(st.length());
		char[] ch=st.toCharArray();
		System.out.println(ch.length-1);
		
		for(int i=ch.length-1;i>=0;i--) {
			
			System.out.print(ch[i]);
		}
		
	}

}

package Assignment3;

public class Program4 {

	public static void main(String[] args) {
		String s1="hellovidya";
		char[] ch=new char[s1.length()];//string converted to char array
		for(int i=0;i<s1.length();i++)
		{
			ch[i]=s1.charAt(i);
		}
		for(char c:ch)
		{
			System.out.println(c);
		}
		
		
		char[] c = s1.toCharArray();//char array converted to string
		System.out.println(c);
		
		
		/*
		 converting string to char and it will show which char is present in the index.
		for(int i=0;i<str.length();i++)
		{
		char c=str.charAt(i);
		System.out.println("char at"+i+"index is:"+c);
		}
	*/
	}

}

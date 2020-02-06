import java.util.*;
public class PostTo{
	public static String convertPostToPre(Stack<String> st,String str)
	{//exp=exp+"ritik";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a'&&str.charAt(i)<='z')
				st.push(str.charAt(i)+"");
			else{
				String b=st.pop();
				String a=st.pop();
				switch(str.charAt(i)){
					case '+': a="+"+a+b; break;
					case '-': a="-"+a+b; break;
					case '*': a="*"+a+b; break;
					case '/': a="/"+a+b; break;
				}

				st.push(a);
			}
		}
	return st.pop();
	
	
	//	return exp;
	}
	public static String convertPreToPost(Stack<String> st,String str)
	{
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)>='a'&&str.charAt(i)<='z')
				st.push(str.charAt(i)+"");
			else{
				String b=st.pop();
				String a=st.pop();
				switch(str.charAt(i)){
					case '+': a=b+a+"+"; break;
					case '-': a=b+a+"-"; break;
					case '*': a=b+a+"*"; break;
					case '/': a=b+a+"/"; break;
				}

				st.push(a);
			}
		}
		
		return st.pop();//(new StringBuffer(st.pop())).reverse().toString();
	
	
	}
	public static void main(String[] args){
	Stack<String> st=new Stack<String>();
	int x=(new Scanner(System.in)).nextInt();
	if(x==1){
	String str=(new Scanner(System.in)).nextLine();
	
	System.out.println(convertPostToPre(st,str));
	}
	else
	{
		String str=(new Scanner(System.in)).nextLine();
		System.out.println(convertPreToPost(st,str));
	}
	}
}

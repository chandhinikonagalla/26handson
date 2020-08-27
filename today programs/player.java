import java.util.*;
class player
{
public static void main(String[] args)
{
Scanner p=new Scanner(System.in);
String v=p.nextLine();
boolean b;
b=player.validatePlayer(v);
if(b)
{
	System.out.println("valid");
}
else
{
	System.out.println("Invalid");
}
}

public static boolean validatePlayer(String v)
{
	boolean temp=false;
	if(!(v.contains("A")||v.contains("a")))
	temp=true;
	
	for(int i=0;i<v.length();i++)
	{
		if(i%2==0){
			if((v.charAt(i)=='A'||v.charAt(i)=='a'))
			temp=false;
		}
}
return temp;
}
}
import java.util.*;
class City
{
public static void main(String[] args)

{	boolean t;
	t=City.validateCity(args[0]);

	if(t){
		System.out.println("Valid");
	}
	else{
		System.out.println("invalid");
	}
}
public static boolean validateCity(String v){
	boolean temp=false;
	
		if((v.charAt(0) >= 'a' && v.charAt(0) <= 'z')||(v.charAt(0) >= 'A' && v.charAt(0) <= 'Z'))
			if((v.charAt(1) >= 'a' && v.charAt(1) <= 'z')||(v.charAt(1) >= 'A' && v.charAt(1) <= 'Z'))
				if((v.charAt(v.length()-1) >= 'a' && v.charAt(v.length()-1) <= 'z')||(v.charAt(v.length()-1) >= 'A' && v.charAt(v.length()-1) <= 'Z'))
					if((v.charAt(v.length()-2) >= 'a' && v.charAt(v.length()-2) <= 'z')||(v.charAt(v.length()-2) >= 'A' && v.charAt(v.length()-2) <= 'Z')){
						for(int i=2;i<=v.length()-3;i++){
							if(v.charAt(i)=='*'){
							temp=true;}
							else{
								temp=false;
								break;
							}
				}
	
}
	return temp;
}
}

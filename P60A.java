//import java.io.*;
import java.util.*;
import java.util.streams.*;
import java.lang.reflect.*;
import com.sun.jdi.Method;
public class P60A{
  public static void main(String[] args){
	  String[] list = {"spam", "sausage", "spam", "spam", "bacon", "spam", "tomato", "spam"};
	  List<String> ll = new ArrayList<>();
	  for(String s: list){
		if(!ll.contains(s)){
		  ll.add(s);
		}
	  }
	  List<String> l2 = new ArrayList<String>(list);
	  LinkedHashSet<String> lhm = new LinkedHashSet(l2);
	  
	  System.out.println(ll+"\n"+l2);
  }
}

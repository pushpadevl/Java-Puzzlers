 
class swap_meat{
	public static void main(String arg[]){
		int a=12,b=13,c=14;
		a=a^b;
		b=b^a;
		a=b^a;
		System.out.println(""+a);
		
		a=a^(b^(b^a));
		System.out.println(""+a);
		
		
		
	}
	
	
	
	
}

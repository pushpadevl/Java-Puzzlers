public class inclementIncrement{
	public static void main(String [] args){
		int j=0;
		for(int i=0;i<100;i++){
			j=j++;
		System.out.println(j + "\t"+ i);
		}
	}
}

/* assignment
is equivalent to this sequence of statements:
int tmp = j;
j = j + 1;
j = tmp;
*/
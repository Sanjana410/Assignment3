
public class Class3_PrintReverse_Sanjana {
	public static void reverse(int n)
	{
		int num = n;
		int num3 = 0;
		while(num>0){
		int num1 = num%10;
		 num3= num3 *10+ num1;
			num = num/10;
			
		}
		System.out.println(num3);
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = Integer.parseInt(args[0]);
		reverse(m);

	}

}


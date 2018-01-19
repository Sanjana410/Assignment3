
public class Class3_PrintArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(args[0]);
		int arm=0;
		int a;
		while(num>0)
		{
		a=num%10;
		num=num/10;
		arm=arm+a*a*a;
		}
		System.out.println(arm);
		System.out.println();

	}

}

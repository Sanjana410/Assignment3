
public class Class3_Primenos {
	public static void prime(int num){
		int count;
		for (int i = 1; i<= num; i++) {
			   count = 0;
			   for (int j = 2; j<= i / 2; j++) {
			    if (i % j == 0) {
			     count++;
			     break;
			    }
			   }

			   if (count == 0) {
			    System.out.println(i);
			   }

			  }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = Integer.parseInt(args[0]);
		prime(m);
		

	}

}

import java.util.ArrayList;


public class Class3_AscendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp =0;
		int a[]= {1,1,1,1,0,0,1,0};
		for (int i = 0; i < a.length; i++) 
        {
            for (int j = i + 1; j < a.length; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < a.length - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
    
		

	}

}

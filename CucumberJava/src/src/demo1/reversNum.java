package demo1;

public class reversNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num=1324,rem,rev=0;
         
         while(num!=0)
         {
        	 rem=num%10;
        	 rev=rev*10+rem;
        	 num=num/10;
         }
         System.out.println(rev);
	}

}

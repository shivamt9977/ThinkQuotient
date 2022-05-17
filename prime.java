
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 java.util.Scanner scn=new java.util.Scanner(System.in);
	 System.out.println("Enter the number");
	 int a=scn.nextInt();//13
	 int count=0;
	 for(int i=2;i<a;i++)
	 {
		 if(a%i==0)
		 {
			 count++;
		 }
	 }
	 if(count==0)
	 {
		 System.out.println("Prime");
	 }
	 else
	 {
		 System.out.println("Non Prime");

	 }
	 

	}

}

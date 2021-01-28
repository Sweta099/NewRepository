
class Test
{
	
    int square(int x)
    {
    	return (x*x);
    	
    	
    }
    int add(int x, int y)
    {
    	return(x+y);
    	
    }
}
class Calculation
{
	
	 
	public static void main(String args[])
	  {
		
		 @SuppressWarnings("unused")
		int square;
	     @SuppressWarnings("unused")
		int add;
         int x = 3,y=6;
         Test sc=new Test();
         square = sc.square(6);
		 add = sc.add(20,30);
		
		System.out.println("Square is :" + (x*x));
		 
		System.out.println("add is : " +(x+y));
		 
	  }


	}



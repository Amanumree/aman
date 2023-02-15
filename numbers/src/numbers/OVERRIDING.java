package numbers;

class OVERRIDING {
	public   void status(String x) {
    	  System.out.println("");
      }
}
      class OVERRIDING1 extends OVERRIDING
      {
    	  public  void status(String x) {
    		 System.out.println();
      }
}
      class main{
    	  public static void main(String[] args) {
    		  OVERRIDING1 s1= new  OVERRIDING1(hyy);
    		 
		}
}

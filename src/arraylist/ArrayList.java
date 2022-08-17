package arraylist;
import java.lang.StringBuilder;
import java.util.Arrays;

public class ArrayList<T> {

	private final int DEFAULT_SIZE=10;
   	private int currentItem=0;
   	private T arList[];
	
   
	@SuppressWarnings("unchecked")
	public ArrayList()
	{   
      
   	// arList=new T[DEFAULT_SIZE];                                        				  	
			  
    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 

  @SuppressWarnings("unchecked")
    public  ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
	  
    }//end preferred constructor
	
  	public boolean addItem(T item) {
  		
  		for (int i =currentItem;  i< arList.length  ;i++ ) {
 				 if(arList[i]== null) {
 					 this.arList[i]=item;
 					 
 				 }
 				 else if (arList[i] !=null){
 					this.arList[i+1]=item;
 					++currentItem;
 				 }//end else if statement
 				 return true;
 					}//end if 
 		
 					return false;
 					}//end else
  	

	@Override
	public String toString() {
		
		return 
		
		Arrays.toString(arList) ;
	}


  	
}//end class

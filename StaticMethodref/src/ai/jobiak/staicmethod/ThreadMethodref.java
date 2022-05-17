package ai.jobiak.staicmethod;

public class ThreadMethodref {
	 public static void ThreadStatus(){  
	        System.out.println("Thread is running...");  
	    }  

	public static void main(String[] args) {
		
		 Thread t2=new Thread(ThreadMethodref::ThreadStatus);  
	        t2.start(); 

	}

}

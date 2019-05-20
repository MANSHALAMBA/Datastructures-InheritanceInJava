class c {
	int i = 1;
	 private int j =2;
	void show() {
		System.out.println(" i =" + i + "j="+ j);
		
	}
	void incrementj() {
		j=j+2;
	}
	
	
}

class d extends c{
	
	
	
	
}









public class inheritance2 {

	public static void main(String[] args) {
		  
	      d obj = new d();
	      obj.i=5;
	      obj.show();
	      obj.incrementj();
	      obj.show();
	      
	       
	}
	
	
	
}

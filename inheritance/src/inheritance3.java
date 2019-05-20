class e {
	int i;
	void increment() {
		i=i+2;
		
	}
}
class f extends e{
	
	void show() {
	System.out.println(i);
}
}




public class inheritance3 {
	public static void main(String[] args) {
		  
	      e obj = new e();
	      obj.i=10;
	      f obj2=new f();
	      obj2.i=4;
	      obj2.increment();
	      obj2.show();
	      System.out.println(obj.i);
	       
	}
}

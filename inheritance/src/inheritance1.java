class a{
	int i ;
	void show() {
		System.out.print(" i =  " + i);
		
	}
}

class b extends a{
	b(){
		i=-1;
	}
	void show() {
		System.out.print(" i =  " + i);
		
	}
	
}

public class inheritance1 {
   
	public static void main(String[] args) {
		
       a obj=new a();
       obj.i=5;
       b obj2 = new b();
       obj2.show();
       obj.show();
       
}

	
	
	
	
}

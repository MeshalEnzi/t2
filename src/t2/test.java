package t2;

public class test {

	public static void main(String[] args) {


		
		
		
		Patient a1 = new Patient ("saleh , "     ,      "a ", 123 , 65 ) ; 
		Patient a2= new Patient ("moh , "  , "ss ", 3456 , 55 ) ; 
		
		Hospital h = new Hospital (20 ," alhbib") ;
		
		
		System.out.println (		h.addPatient(a1) ) ; 
		System.out.println (		h.addPatient(a2) ) ; 


		System.out.println (h.countPatients("a") ) ; 

		
		
		
		
	}

}

package atm;

public class History {
	String [] history =new String [5];
	int counter=0;
	
public boolean full(String [] h) {
	for(int i = 0 ; i < h.length ; i++) {
		if(h[i]==null) return false;
		
	}
		return true;
	
}
public void popping(String[]x, String operation) {
	for(int i=0; i<4;i++) {
		x[i]=x[i+1];
	}
		x[4]=operation;
}
public void enter(String[] x, String operation) {
	if(!full(x)) {
		x[counter]=operation;
		++counter;
	}
	  else popping(x,operation);
		
	}
}

package _06_vault;

public class SecretAgent {

	
 int findCode(Vault v){
	for(int i=0; i<1000001; i++) {
		boolean a = v.tryCode(i);
		if (a==true) {
			return i;
		}	

	}
return -1;
 
 }

	}



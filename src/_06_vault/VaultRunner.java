package _06_vault;

public class VaultRunner {

	public static void main(String[] args) {
Vault v = new Vault();
SecretAgent a = new SecretAgent();
boolean one = v.tryCode(12345);
// add JOption
int b = a.findCode(v);
	System.out.println(b);
	}

}


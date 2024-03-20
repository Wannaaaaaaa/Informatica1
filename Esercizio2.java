import java.util*.;
public class Esercizio2 {
	public static void main(String[] args) {
		char car = 'a';
		Scanner in; 
		in = new Scanner( System.in );
		System.out.println("Inserisci un numero");
		int incremento = in.nextInt();
		car += incremento;
		System.out.println("Valore finale di car: " + car);
	}
}

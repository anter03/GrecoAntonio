/**<b>Greco</b>  <u>4ai</u> <i>13/05/2020</i>
 * 
 * @author Antonio Greco
 *
 */
public class GrecoClass {

	/**
	 * 
	 * @param b
	 * @param e
	 * @return cognomeMet
	 */
	
	public float cognomeMet (int b, int e) {
		int val1=b;  // val1 deve essere uguale a b non a uno
		for (int i=1; i<e; i++){
		val1 = val1 * b;
		}
		return val1;
		}
	//nel for bisognava iserire e al posto di b inoltre bisognava cambiare la condizione e inserire i<e e
	//non i<=e
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 GrecoClass g=new GrecoClass();
 System.out.println(g.cognomeMet(3, 7));
	}

}

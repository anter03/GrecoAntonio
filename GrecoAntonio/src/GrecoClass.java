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
		int val1=1;
		for (int i=1; i<=b; i++){
		val1 = val1 * b;
		}
		return val1;
		}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 GrecoClass g=new GrecoClass();
 System.out.println(g.cognomeMet(1, 1));
	}

}

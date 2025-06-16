/**
 * Exam Aufgabe.
 *
 * <ul>
 * <li>Die Struktur (Name, Parameter, Modifier) der gegebenen Methoden darf nicht verändert werden.</li>
 * <li>Eigene (Hilfs-)Methoden dürfen erstellt und verwendet werden</li>
 * <li>Die vorgegebenen Exam-Methoden werden zur finalen Prüfung verwendet</li>
 * <li>Die main-Methode kann zum Test der Implementierung verwendet werden</li>
 * </ul>
 *
 */
public class ExamTask2
{

	/**
	 * <p>
	 * Diese Methode berechnet die Summe aller Zahlen aud dem übergebenen Array.
	 * </p>
	 *  <ul>
	 * 		  <li>Wenn das übergebene Array die Länge 0 hat, dann soll die Methode das Ergebnis 0 zurückgeben</li>
	 * 		  <li>Wenn das übergebene Array den Wert <code>null</code> hat, dann soll die Methode das Ergebnis 0 zurückgeben</li>
	 * 		  <li>In allen anderen Fällen wird die Summer der einzelnen Werte geliefert</li>
	 *  </ul>
	 * 
	 * <p><u>Beispiel:</u></p>
	 * <ul>
	 * <li>calculateSum(  [] ) --&gt; 0</li>
	 * <li>calculateSum( null ) --&gt; 0</li>
	 * <li>calculateSum( [2, 3, -1] ) --&gt; 4</li>
	 * </ul>
	 * 
     * @param p_array Das Eingabearray, das die Ganzzahlen enthält.
     *            Kann sowohl positive als auch negative Werte enthalten.
     *
     * @return Die Summe aller Zahlen im Array. Gibt 0 zurück, wenn das Array leer oder null ist.
	 */
	public static int calculateSum(int[] p_array)
	{
		if( p_array == null || p_array.length == 0)
		{
			return 0;
		}
		
		int l_sum = 0;
		for(int v : p_array )
		{
			l_sum = l_sum + v;
		}
		
		return l_sum;
	}

	/**
	 * @hidden
	 */
	public static void main(String[] args)
	{
		// Hier koennen sie ihren eigenen Code zum Testen der Methode hinterlegen

	}
}

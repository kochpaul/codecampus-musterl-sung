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
public class ExamTask5
{

	/**
	 * <p>
	 * Diese Methode gibt für die Buchstaben 'a', 'b', 'c' und 'd' die entsprechenden
	 * </p>
	 *
	 * Folgende Bedingung sind zu erfüllen:
	 * <ul>
     *   <li>'a' --&gt; "Aachen"</li>
     *   <li> 'b' --&gt; "Berlin"</li>
     *   <li> 'c' --&gt; "Chemnitz"</li>
     *   <li> 'd' --&gt; "Duisburg"</li>
     *   <li> Ansonsten --&gt; null</li>
	 * </ul>
	 *
	 * <p><u>Beispiel:</u></p>
	 * <ul>
	 * <li> getCity( 'a' ) --&gt; Aachen</li>
	 * <li> getCity( 'A' ) --&gt; null</li>
	 * </ul>
	 *
     * @param p_char Der Buchstabe, der geprüft wird.
     * @return String: Der Name der Stadt, die dem Buchstaben entspricht oder null
     */
    public static String getCity(char p_char)
	{
		switch( p_char )
		{
		case 'a': return "Aachen";
		case 'b': return "Berlin";
		case 'c': return "Chemnitz";
		case 'd': return "Duisburg";
		default: return null;
		}
	}

	/**
	 * @hidden
	 */
	public static void main(String[] args)
	{
		// Hier koennen sie ihren eigenen Code zum Testen der Methode hinterlegen
	}
}
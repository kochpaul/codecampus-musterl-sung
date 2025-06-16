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
public class ExamTask4
{

	/**
	 * <p>
	 * Diese Methode soll die Anzahl an Konsonanten in einem String zählen.
	 * </p>
	 *
	 * Folgende Bedingung sind zu erfüllen:
	 * <ul>
	 *  <li>Wenn der übergebene String die Länge 0 hat, dann soll die Methode den Wert 0 zurückliefern</li>
	 *  <li>Wenn der übergebene String den Wert <code>null</code> hat, soll die Methode den Wert 0 zurückliefern</li>
	 *  <li>Für alle anderen Fälle wird die Anzahl der Konsonaten geliefert</li>
	 * </ul>
	 *
	 * <p><u>Anmerkung:</u><br>
	 * Als Konsonanten werden alle Buchstaben betrachtet, die keine Vokale ('a', 'e', 'i', 'o', 'u') sind. Groß-, Kleinschreibung ist ebenfalls zu beachten.
	 *
	 * <p><u>Beispiel:</u></p>
	 * <ul>
	 * <li> countConsonants( null ) --&gt; 0</li>
	 * <li> countConsonants( "abcc" ) --&gt; 3</li>
	 * <li> countConsonants( "xUz" ) --&gt; 2</li>
	 * <li> countConsonants( "" ) --&gt; 0</li>
	 * </ul>
	 *
     * @param p_input Der Eingabestring, in dem die Konsonanten gezählt werden sollen.
     *              Wenn der String null oder leer ist, wird 0 zurückgegeben.
     * @return int: Die Anzahl der Konsonanten im Eingabestring.
     */
    public static int countConsonants(final String p_input)
	{
		if( p_input == null || p_input.length() == 0 )
		{
			return 0;
		}
		
		int l_count = 0;
		for( char c : p_input.toCharArray() )
		{
			if( c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U' )
			{
				continue;
			}
			l_count++;
		}
		
		return l_count;
	}

	/**
	 * @hidden
	 */
	public static void main(String[] args)
	{
		// Hier koennen sie ihren eigenen Code zum Testen der Methode hinterlegen
	}
}
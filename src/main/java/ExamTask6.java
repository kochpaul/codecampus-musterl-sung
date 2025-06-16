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
public class ExamTask6
{

	/**
	 * <p>
	 * Diese Methode zählt die Vorkommen aller Zeichen in einer Zeichenkette und liefert die Anzahl des am meisten vorkommenden Zeichens zurück.<br>
	 * </p>
	 *
	 * Folgende Bedingung sind zu erfüllen:
	 * <ul>
	 * 	<li>Die Methode liefert immer einen positiven Wert zurück</li>
	 *  <li>Wenn die übergebene Zeichenkette die Länge 0 hat, soll 0 geliefert werden</li>
	 *  <li>Wenn die übergebene Zeichenkette den Wert <code>null</code> hat, soll 0 geliefert werden</li>
	 *  <li>Gro&szlig;- Kleinschreibung ist zu beachten</li>
	 * </ul>
	 *
	 * <p><u>Anmerkung:</u><br>
	 * Es kann davon ausgegangen werden, dass der übergebene String nur ASCI-Code Zeichen enthät.
	 * Siehe auch: {@link String#charAt(int)}
	 * </p>
	 *
	 * <p><u>Tipp:</u>
	 * <ul>
	 * <li>Ein <code>char</code> kann auch als ganzzahliger Wert betrachtet werden</li>
	 * <li>Typumwandlungen können via <code>Casting</code> vorgenommen werden (<code>char</code> --&gt; <code>int</code>).</li>
	 * </ul>
	 *
	 * <p><u>Beispiel:</u>
	 * <ul>
	 * <li> getCountOfMostUsedCharacter( null ) --&gt; 0</li>
	 * <li> getCountOfMostUsedCharacter( "" ) --&gt; 0</li>
	 * <li> getCountOfMostUsedCharacter( "aaBBbbccDDeDDee" ) --&gt; 4</li>
	 * </ul>
	 *
	 * @param p_str Die zu verarbeitende Zeichenkette
	 * @return int: Die Anzahl der Vorkommen des am häufigst verwendeten Zeichens.
	 */
	public static int getCountOfMostUsedCharacter(final String p_str)
	{
		if( p_str == null || p_str.length() == 0 )
		{
			return 0;
		}
		
		int l_maxCount = 0;
		
		for( char c: p_str.toCharArray() )
		{
			int l_currentCount = 0;
			for( char cc: p_str.toCharArray() )
			{
				if( c == cc )
				{
					l_currentCount++;
				}
			}
			
			l_maxCount = (l_currentCount > l_maxCount) ? l_currentCount : l_maxCount;
		}
		
		return l_maxCount;
	}

	/**
	 * @hidden
	 */
	public static void main(String[] args)
	{
		// Hier koennen sie ihren eigenen Code zum Testen der Methode hinterlegen
	}
}
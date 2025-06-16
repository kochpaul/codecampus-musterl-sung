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
public class ExamTask3
{

	/**
	 * <p>
	 * Diese Methode prüft, ob eine Zahl eine Primzahl ist.<br>
	 * </p>
	 *
	 * <p><u>Anmerkung:</u><br>
	 * Primzahlen sind natürliche Zahlen größer 1, die nur durch sich selbst und 1 teilbar sind.
	 *
	 * <p><u>Beispiel:</u></p>
	 * <ul>
	 * <li> isPrim( -3 ) --&gt; false </li>
	 * <li> isPrim( 11 ) --&gt; true </li>
	 * </ul>
     *
     * @param p_number Die zu überprüfende Zahl.
     * @return true, wenn die Zahl eine Primzahl ist, andernfalls false.
     */
    public static boolean isPrim(final int p_number)
	{
		if( p_number <= 1 )
		{
			return false;
		}
		
		if( p_number == 2 )
		{
			return true;
		}
		
		if( p_number % 2 == 0 )
		{
			return false;
		}
		
		for( int i=2; i<p_number; i++ )
		{
			if( p_number % i == 0 )
			{
				return false;
			}
		}
		
		return true;
	}

	/**
	 * @hidden
	 */
	public static void main(String[] args)
	{
		// Hier koennen sie ihren eigenen Code zum Testen der Methode hinterlegen

	}
}
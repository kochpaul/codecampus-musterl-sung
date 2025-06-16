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
public class ExamTask1
{

	/**
	 * <p>
	 * Diese Methode überprüft, ob die beiden übergebenen boolean-Werte den Wert 'true' haben.
	 * </p>
	 *
     * @param p_param1 der erste boolean-Wert
     * @param p_param2 der zweite boolean-Wert
     * @return true, wenn beide Parameter true sind, andernfalls false
     */
    public static boolean areBothTrue(final boolean p_param1, final boolean p_param2)
    {
		return p_param1 && p_param2;
	}

	/**
	 * @hidden
	 */
	public static void main(String[] args)
	{
		// Hier koennen sie ihren eigenen Code zum Testen der Methode hinterlegen

	}
}

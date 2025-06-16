
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import testing.UniGraderTestResultExtension;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(UniGraderTestResultExtension.class)
class ExamUnitTest
{
	private static final int DEFAULT_TIMEOUT = 30;

	//private static final String CLASS_TEMPLATE = "de.dhbw.assignments.exam.impl.%s";
	//private static final String CLASS_TEMPLATE = "de.dhbw.assignments.exam.solution.%s";



//ExamTask1

	@Test
	@Order(1101)
	@DisplayName("ExamTask1.areBothTrue: Angenommen die Methode wird mit 2 Parametern beide true aufgerufen. Das erwartete Ergebnis der Methode ist true.")
	void testAreBothTrue_BothTrue() {

		assertTrue(invoke_Examtask1_areBothTrue(true, true), "Erwartet: true, wenn beide Parameter wahr sind");
	}

	@Test
	@Order(1101)
	@DisplayName("ExamTask1.areBothTrue: Angenommen die Methode wird mit dem ersten Parameter false und dem zweiten true aufgerufen. Das erwartete Ergebnis der Methode ist false.")
	void testAreBothTrue_FirstFalseSecondTrue() {
		assertFalse(invoke_Examtask1_areBothTrue(false, true), "Erwartet: false, wenn der erste Parameter falsch und der zweite wahr ist");
	}

	@Test
	@Order(1101)
	@DisplayName("ExamTask1.areBothTrue: Angenommen die Methode wird mit dem ersten Parameter true und dem zweiten false aufgerufen. Das erwartete Ergebnis der Methode ist false.")
	void testAreBothTrue_FirstTrueSecondFalse() {
		assertFalse(invoke_Examtask1_areBothTrue(true, false), "Erwartet: false, wenn der erste Parameter wahr und der zweite falsch ist");
	}

	@Test
	@Order(1101)
	@DisplayName("ExamTask1.areBothTrue: Angenommen die Methode wird mit 2 Parametern beide false aufgerufen. Das erwartete Ergebnis der Methode ist false.")
	void testAreBothTrue_BothFalse() {
		assertFalse(invoke_Examtask1_areBothTrue(false, false), "Erwartet: false, wenn beide Parameter falsch sind");
	}
	//ExamTask2

	@Test
	@Order(1102)
	@DisplayName("ExamTask2.calculateSum: Angenommen die Methode wird mit einem Array aufgerufen, der null ist. Das erwartete Ergebnis der Methode ist 0.")
	void testCalculateSum_NullArray() {
		assertEquals(0, invoke_Examtask2_calculateSum(null), "Erwartet: 0, wenn das Array null ist");
	}

	@Test
	@Order(1102)
	@DisplayName("ExamTask2.calculateSum: Angenommen die Methode wird mit einem leeren Array aufgerufen. Das erwartete Ergebnis der Methode ist 0.")
	void testCalculateSum_EmptyArray() {
		assertEquals(0, invoke_Examtask2_calculateSum(new int[]{}), "Erwartet: 0, wenn das Array leer ist");
	}

	@Test
	@Order(1102)
	@DisplayName("ExamTask2.calculateSum: Angenommen die Methode wird mit einem Array aufgerufen, das positive und negative Werte enthält. Das erwartete Ergebnis der Methode ist die korrekte Summe.")
	void testCalculateSum_PositiveAndNegativeValues() {
		assertEquals(4, invoke_Examtask2_calculateSum(new int[]{2, 3, -1}), "Erwartet: 4, wenn die Summe der Werte im Array 4 ergibt");
	}

	@Test
	@Order(1102)
	@DisplayName("ExamTask2.calculateSum: Angenommen die Methode wird mit einem Array aufgerufen, das nur positive Werte enthält. Das erwartete Ergebnis der Methode ist die korrekte Summe.")
	void testCalculateSum_PositiveValuesOnly() {
		assertEquals(15, invoke_Examtask2_calculateSum(new int[]{5, 5, 5}), "Erwartet: 15, wenn die Summe der Werte im Array 15 ergibt");
	}


	@Test
	@Order(1103)
	@DisplayName("ExamTask3.isPrim: Angenommen die Methode wird mit einer negativen Zahl aufgerufen. Das erwartete Ergebnis der Methode ist false.")
	void testIsPrim_NegativeNumber() {
		assertFalse(invoke_Examtask3_isPrim(-3), "Erwartet: false, da negative Zahlen keine Primzahlen sind");
	}

	@Test
	@Order(1103)
	@DisplayName("ExamTask3.isPrim: Angenommen die Methode wird mit der Zahl 0 aufgerufen. Das erwartete Ergebnis der Methode ist false.")
	void testIsPrim_Zero() {
		assertFalse(invoke_Examtask3_isPrim(0), "Erwartet: false, da 0 keine Primzahl ist");
	}

	@Test
	@Order(1103)
	@DisplayName("ExamTask3.isPrim: Angenommen die Methode wird mit der Zahl 1 aufgerufen. Das erwartete Ergebnis der Methode ist false.")
	void testIsPrim_One() {
		assertFalse(invoke_Examtask3_isPrim(1), "Erwartet: false, da 1 keine Primzahl ist");
	}

	@Test
	@Order(1103)
	@DisplayName("ExamTask3.isPrim: Angenommen die Methode wird mit der Zahl 2 aufgerufen. Das erwartete Ergebnis der Methode ist true.")
	void testIsPrim_Two() {
		assertTrue(invoke_Examtask3_isPrim(2), "Erwartet: true, da 2 eine Primzahl ist");
	}


	@Test
	@Order(1103)
	@DisplayName("ExamTask3.isPrim: Angenommen die Methode wird mit einer ungeraden Primzahl aufgerufen. Das erwartete Ergebnis der Methode ist true.")
	void testIsPrim_OddPrimeNumber() {
		assertTrue(invoke_Examtask3_isPrim(11), "Erwartet: true, da 11 eine Primzahl ist");
	}



	//ExamTask4


	@Test
	@Order(1104)
	@DisplayName("ExamTask4.countConsonants: Angenommen die Methode wird mit einem null-String aufgerufen. Das erwartete Ergebnis der Methode ist 0.")
	void testCountConsonants_NullInput() {
		assertEquals(0, invoke_Examtask4_countConsonants(null), "Erwartet: 0, wenn der Eingabestring null ist");
	}

	@Test
	@Order(1105)
	@DisplayName("ExamTask4.countConsonants: Angenommen die Methode wird mit einem leeren String aufgerufen. Das erwartete Ergebnis der Methode ist 0.")
	void testCountConsonants_EmptyInput() {
		assertEquals(0, invoke_Examtask4_countConsonants(""), "Erwartet: 0, wenn der Eingabestring leer ist");
	}



	@Test
	@Order(1106)
	@DisplayName("ExamTask4.countConsonants: Angenommen die Methode wird mit einem gemischten String aus Vokalen und Konsonanten aufgerufen. Das erwartete Ergebnis der Methode ist die Anzahl der Konsonanten.")
	void testCountConsonants_MixedString() {
		assertEquals(3, invoke_Examtask4_countConsonants("abcc"), "Erwartet: 3, wenn der String \"abcc\" drei Konsonanten enthält");
	}

	@Test
	@Order(1106)
	@DisplayName("ExamTask4.countConsonants: Angenommen die Methode wird mit einem String aus Konsonanten aufgerufen. Das erwartete Ergebnis der Methode ist die Anzahl der Konsonanten.")
	void testCountConsonants_OnlyConsonants() {
		assertEquals(3, invoke_Examtask4_countConsonants("ccc"), "Erwartet: 3, da der String \"ccc\" drei Konsonanten enthält");
	}

	@Test
	@Order(1107)
	@DisplayName("ExamTask4.countConsonants: Angenommen die Methode wird mit einem String mit Groß- und Kleinbuchstaben aufgerufen. Das erwartete Ergebnis der Methode ist die Anzahl der Konsonanten.")
	void testCountConsonants_MixedCase() {
		assertEquals(2, invoke_Examtask4_countConsonants("xUz"), "Erwartet: 2, wenn der String \"xUz\" zwei Konsonanten enthält");
	}
	//ExamTask5


	@Test
	@Order(1108)
	@DisplayName("ExamTask5.getCity: Angenommen die Methode wird mit dem Buchstaben 'a' aufgerufen. Das erwartete Ergebnis der Methode ist 'Aachen'.")
	void testGetCity_A() {
		assertEquals("Aachen", invoke_Examtask5_getCity('a'), "Erwartet: Aachen, wenn der Buchstabe 'a' übergeben wird");
	}

	@Test
	@Order(1108)
	@DisplayName("ExamTask5.getCity: Angenommen die Methode wird mit dem Buchstaben 'b' aufgerufen. Das erwartete Ergebnis der Methode ist 'Berlin'.")
	void testGetCity_B() {
		assertEquals("Berlin", invoke_Examtask5_getCity('b'), "Erwartet: Berlin, wenn der Buchstabe 'b' übergeben wird");
	}

	@Test
	@Order(1108)
	@DisplayName("ExamTask5.getCity: Angenommen die Methode wird mit dem Buchstaben 'c' aufgerufen. Das erwartete Ergebnis der Methode ist 'Chemnitz'.")
	void testGetCity_C() {
		assertEquals("Chemnitz", invoke_Examtask5_getCity('c'), "Erwartet: Chemnitz, wenn der Buchstabe 'c' übergeben wird");
	}

	@Test
	@Order(1108)
	@DisplayName("ExamTask5.getCity: Angenommen die Methode wird mit dem Buchstaben 'd' aufgerufen. Das erwartete Ergebnis der Methode ist 'Duisburg'.")
	void testGetCity_D() {
		assertEquals("Duisburg", invoke_Examtask5_getCity('d'), "Erwartet: Duisburg, wenn der Buchstabe 'd' übergeben wird");
	}

	@Test
	@Order(1108)
	@DisplayName("ExamTask5.getCity: Angenommen die Methode wird mit einem Großbuchstaben aufgerufen. Das erwartete Ergebnis der Methode ist null.")
	void testGetCity_Uppercase() {
		assertNull(invoke_Examtask5_getCity('A'), "Erwartet: null, wenn ein Großbuchstabe übergeben wird");
	}

	@Test
	@Order(1108)
	@DisplayName("ExamTask5.getCity: Angenommen die Methode wird mit einem Buchstaben aufgerufen, der nicht 'a', 'b', 'c' oder 'd' ist. Das erwartete Ergebnis der Methode ist null.")
	void testGetCity_InvalidCharacter() {
		assertNull(invoke_Examtask5_getCity('x'), "Erwartet: null, wenn ein nicht spezifizierter Buchstabe übergeben wird");
	}
	//ExamTask6

	@Test
	@Order(1109)
	@DisplayName("ExamTask6.getCountOfMostUsedCharacter: Angenommen die Methode wird mit dem String 'null' aufgerufen. Das erwartete Ergebnis der Methode ist 0.")
	void testGetCountOfMostUsedCharacter_NullString() {
		assertEquals(0, invoke_Examtask6_getCountOfMostUsedCharacter(null), "Erwartet: 0, wenn der String null übergeben wird");
	}

	@Test
	@Order(1109)
	@DisplayName("ExamTask6.getCountOfMostUsedCharacter: Angenommen die Methode wird mit dem leeren String '' aufgerufen. Das erwartete Ergebnis der Methode ist 0.")
	void testGetCountOfMostUsedCharacter_EmptyString() {
		assertEquals(0, invoke_Examtask6_getCountOfMostUsedCharacter(""), "Erwartet: 0, wenn der leere String übergeben wird");
	}

	@Test
	@Order(1109)
	@DisplayName("ExamTask6.getCountOfMostUsedCharacter: Angenommen die Methode wird mit dem String 'aaBBbbccDDeDDee' aufgerufen. Das erwartete Ergebnis der Methode ist 4.")
	void testGetCountOfMostUsedCharacter_MixedString() {
		assertEquals(4, invoke_Examtask6_getCountOfMostUsedCharacter("aaBBbbccDDeDDee"), "Erwartet: 4, wenn der String 'aaBBbbccDDeDDee' übergeben wird");
	}

	@Test
	@Order(1109)
	@DisplayName("ExamTask6.getCountOfMostUsedCharacter: Angenommen die Methode wird mit dem String 'abc' aufgerufen. Das erwartete Ergebnis der Methode ist 1.")
	void testGetCountOfMostUsedCharacter_OneOccurrenceEach() {
		assertEquals(1, invoke_Examtask6_getCountOfMostUsedCharacter("abc"), "Erwartet: 1, wenn der String 'abc' übergeben wird");
	}


	@Test
	@Order(1109)
	@DisplayName("ExamTask6.getCountOfMostUsedCharacter: Angenommen die Methode wird mit dem String 'aaaa' aufgerufen. Das erwartete Ergebnis der Methode ist 4.")
	void testGetCountOfMostUsedCharacter_SingleCharacter() {
		assertEquals(4, invoke_Examtask6_getCountOfMostUsedCharacter("aaaa"), "Erwartet: 4, wenn der String 'aaaa' übergeben wird");
	}

	@Test
	@Order(1109)
	@DisplayName("ExamTask6.getCountOfMostUsedCharacter: Angenommen die Methode wird mit dem String 'aAbBcCdD' aufgerufen. Das erwartete Ergebnis der Methode ist 1.")
	void testGetCountOfMostUsedCharacter_CaseSensitive() {
		assertEquals(1, invoke_Examtask6_getCountOfMostUsedCharacter("aAbBcCdD"), "Erwartet: 1, wenn der String 'aAbBcCdD' übergeben wird");
	}






	private static boolean invoke_Examtask1_areBothTrue(boolean value1, boolean value2){
		Class<?> l_examClass = findClass( "ExamTask1");
		Method l_method = findMethod(l_examClass, true, "areBothTrue", boolean.class, boolean.class);
		return invokeStaticMethod(l_method, boolean.class, value1, value2);
	}

	private static int invoke_Examtask2_calculateSum(int[] p_array){
		Class<?> l_examClass = findClass( "ExamTask2");
		Method l_method = findMethod(l_examClass, true, "calculateSum",int [].class);
		return invokeStaticMethod(l_method, int.class, p_array);
	}

	private static boolean invoke_Examtask3_isPrim(int p_number){
		Class<?> l_examClass = findClass( "ExamTask3");
		Method l_method = findMethod(l_examClass, true, "isPrim",int.class);
		return invokeStaticMethod(l_method, boolean.class, p_number);
	}

	private static int invoke_Examtask4_countConsonants(String p_input){
		Class<?> l_examClass = findClass( "ExamTask4");
		Method l_method = findMethod(l_examClass, true, "countConsonants",String.class);
		return invokeStaticMethod(l_method, int.class, p_input);
	}
	private static String invoke_Examtask5_getCity(char p_char){
		Class<?> l_examClass = findClass( String.format( "ExamTask5"));
		Method l_method = findMethod(l_examClass, true, "getCity",char.class);
		return invokeStaticMethod(l_method, String.class, p_char);
	}
	private static int invoke_Examtask6_getCountOfMostUsedCharacter(String p_input){
		Boolean isStatic = null;
		Class<?> l_examClass = findClass( "ExamTask6");
		Method l_method = findMethod(l_examClass, isStatic, "getCountOfMostUsedCharacter",String.class);
		boolean isMethodStatic = Modifier.isStatic(l_method.getModifiers());
		if(isMethodStatic){
			return invokeStaticMethod(l_method, int.class, p_input);
		}
		else{
			Object l_instance;
			try
			{
				l_instance = l_examClass.getDeclaredConstructor().newInstance();
			}
			catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				   | NoSuchMethodException | SecurityException ex)
			{
				throw new Error(ex);
			}

			return invokeNonStaticMethod(l_instance, l_method, int.class, new Object[]{p_input});


		}




	}




	private static String invoke_ExamTask2_chooseCorrectOption()
	{
		Class<?> l_examClass = findClass( String.format( "ExamTask2"));
		Method l_method = findMethod(l_examClass, true, "chooseCorrectOption", new Class[0]);
		return invokeStaticMethod(l_method, String.class, new Object[0]);
	}

	private static double invoke_ExamTask3_getMaximum(double[] p_data)
	{
		Class<?> l_examClass = findClass( String.format( "ExamTask3"));
		Method l_method = findMethod(l_examClass, true, "getMaximum", double[].class);
		return invokeStaticMethod(l_method, double.class, new Object[]{p_data});
	}

	private static int invoke_ExamTask4_findDoubleLetterIndex(String p_data)
	{
		Class<?> l_examClass = findClass( String.format( "ExamTask4"));
		Method l_method = findMethod(l_examClass, true, "findDoubleLetterIndex", String.class);
		return invokeStaticMethod(l_method, int.class, new Object[]{p_data});
	}

	private static String invoke_ExamTask5_removeVocals(String p_data)
	{
		Class<?> l_examClass = findClass( String.format( "ExamTask5"));
		Method l_method = findMethod(l_examClass, true, "removeVocals", String.class);
		return invokeStaticMethod(l_method, String.class, new Object[]{p_data});
	}

	private static int invoke_ExamTask6_getCountOfMostUsedCharacter(String p_data)
	{
		Class<?> l_examClass = findClass( String.format( "ExamTask6"));
		Method l_method = findMethod(l_examClass, false, "getCountOfMostUsedCharacter", String.class);

		Object l_instance;
		try
		{
			l_instance = l_examClass.getDeclaredConstructor().newInstance();
		}
		catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
			   | NoSuchMethodException | SecurityException ex)
		{
			throw new Error(ex);
		}

		return invokeNonStaticMethod(l_instance, l_method, int.class, new Object[]{p_data});
	}

	private static void handleThrowable(Throwable p_th)
	{
		Throwable th = p_th;

		if( th instanceof Error )
		{
			throw (Error)th;
		}

		while( th.getCause() != null )
		{
			th = th.getCause();
		}

		if( th instanceof Error )
		{
			throw (Error)th;
		}

		fail(p_th.getMessage(), p_th );
	}

	private static final Class<?> findClass(final String p_className)
	{
		try
		{
			return Class.forName(p_className);
		}
		catch (ClassNotFoundException ex)
		{
			//handleThrowable( ex );
			throw new Error(ex);
		}
		catch(Throwable th)
		{
			handleThrowable( th );
		}

		return null;
	}

	/*private static final <T> Method findMethod(Class<T> p_class, boolean p_isStatic, String p_methodeName, Class<?>... p_parameterList )
	{
		try
		{
			Method l_method = p_class.getMethod(p_methodeName, p_parameterList);

			if( p_isStatic && !Modifier.isStatic(l_method.getModifiers()))
			{
				throw new NoSuchMethodException(l_method + " should be static!");
			}

			return l_method;
		}
		catch(NoSuchMethodException ex)
		{
			throw new Error(ex);
		}
		catch(Throwable th)
		{
			handleThrowable( th );
		}
		return null;
	}*/
	private static final <T> Method findMethod(Class<T> p_class, Boolean p_isStatic, String p_methodeName, Class<?>... p_parameterList) {
		try {
			Method l_method = p_class.getMethod(p_methodeName, p_parameterList);

			// If p_isStatic is explicitly set (true/false), check the modifier
			if (p_isStatic != null) {
				boolean isMethodStatic = Modifier.isStatic(l_method.getModifiers());

				if (p_isStatic && !isMethodStatic) {
					throw new NoSuchMethodException(l_method + " should be static!");
				} else if (!p_isStatic && isMethodStatic) {
					throw new NoSuchMethodException(l_method + " should not be static!");
				}
			}

			return l_method;
		} catch (NoSuchMethodException ex) {
			throw new Error(ex);
		} catch (Throwable th) {
			handleThrowable(th);
		}
		return null;
	}


	@SuppressWarnings("unchecked")
	private static <T> T invokeStaticMethod( Method p_method, Class<T> p_returnType, Object... args)
	{
		try
		{
			return (T)p_method.invoke(null, args);
		}
		catch(ClassCastException ex)
		{
			throw new Error(ex);
		}
		catch(Throwable th)
		{
			th.printStackTrace();
			handleThrowable( th );
		}

		return null;
	}

	@SuppressWarnings("unchecked")
	private static <T> T invokeNonStaticMethod( Object p_instance, Method p_method, Class<T> p_returnType, Object... args)
	{
		try
		{
			return (T)p_method.invoke(p_instance, args);
		}
		catch(ClassCastException ex)
		{
			throw new Error(ex);
		}
		catch(Throwable th)
		{
			th.printStackTrace();
			handleThrowable( th );
		}

		return null;
	}
}

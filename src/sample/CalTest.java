package sample;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import com.junit.Calculator;

class CalTest {
	/* Creating calculator object for Calculator Class */
	Calculator calculator =new Calculator();
	
	@Test
	void Addition_test_pass() {
		/* calling the addition() method which is in Calculator Class */
		assertEquals(" addition() executed successfully",8,calculator.addition(5, 3),0.0);
		assertEquals(" addition() executed successfully",12.5,calculator.addition(9.5, 3),0.0);
		assertEquals(" addition() executed successfully",2192986.5,calculator.addition(2161343.5,31643),0.0);
		assertEquals(" addition() executed successfully",70860.9,calculator.addition(5427, 65433.9),0.0);
		assertEquals("addition() executed successfully",7.75304,calculator.addition(3.8765, 3.87654),0.0);
		assertEquals("addition() executed successfully",7863875.5,calculator.addition(7837347.7, 26527.8),0.0);
	}	
	
	@Test
	void Addition_test_fail()
	{
		/* test cases for addition() fails */
		assertFalse("addition() executed successfully",890!=calculator.addition(540, 350));
		assertFalse("addition() executed successfully",89418165.4!=calculator.addition(78331, 89339834.4));
		assertFalse("addition() executed successfully",4293290.1!=calculator.addition(3834834.1,458456));
		assertFalse("addition() executed successfully",11607!=calculator.addition(5465.5,6141.5));	
	}
	@Test
	void multiplication_test_pass() {
		
		/* calling the multiplication() method which is in Calculator Class */
			assertEquals("multiplication() executed successfully",15,calculator.multiplication(5, 3),0.0);
			assertEquals("multiplication() executed successfully",28.5,calculator.multiplication(9.5, 3),0.0);
			assertEquals("multiplication() executed successfully",68391392370.5,calculator.multiplication(2161343.5,31643),0.0);
			assertEquals("multiplication() executed successfully",355109775.3,calculator.multiplication(5427, 65433.9),0.0);
			assertEquals("multiplication() executed successfully",15.02740731,calculator.multiplication(3.8765, 3.87654),0.0);
			assertEquals("multiplication() executed successfully",207919651.734705,calculator.multiplication(7837.789, 26527.845),0.0);
			
	}
	
	@Test
	void multiplication_test_fail()
	{
		/* test cases for multiplication() fails */
		assertFalse("multiplication() executed successfully",189000!=calculator.multiplication(540, 350));
		assertFalse("multiplication() executed successfully",699840486.4!=calculator.multiplication(78331, 8934.4));
		assertFalse("multiplication() executed successfully",0!=calculator.multiplication(3834834.1,0.0));
		assertFalse("multiplication() executed successfully",33566368.25!=calculator.multiplication(5465.5,6141.5));	
	}

	
	@Test
	void division_test_pass()
	{
		/* calling the division() method which is in Calculator.java Class */
		assertEquals("division() executed successfully",0.5,calculator.division(4, 8),0.001);
		assertEquals("division() executed successfully",1.6666666666666667,calculator.division(5, 3),0.0);
		assertEquals("division() executed successfully",3.1666666666666665,calculator.division(9.5, 3),0.0);
		assertEquals("division() executed successfully",68.30400088487185,calculator.division(2161343.5,31643),0.0);
		assertEquals("division() executed successfully",0.08293866023574936,calculator.division(5427, 65433.9),0.0);
		assertEquals("division() executed successfully",0.9999896815201185,calculator.division(3.8765, 3.87654),0.0);
		assertEquals("division() executed successfully",0.2954551717261617,calculator.division(7837.789, 26527.845),0.0);	
	}	
	
	@Test
	void division_test_fail()
	{
		/* test cases for division() fails */
		assertFalse("division() executed successfully",50!=calculator.division(550, 11));
		assertFalse("division() executed successfully",8.767348674785100!=calculator.division(78331, 8934.4));
		assertFalse("division() executed successfully",7669.6682!=calculator.division(3834834.1,500));
		assertFalse("division() executed successfully",119.594!=calculator.division(59797,500));	
	}
}

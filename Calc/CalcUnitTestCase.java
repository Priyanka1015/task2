/*
* Unit test cases for Calculator
*/
class CalcUnitTestCase{

	public void testOperation() {
		Calculator c = new Calculator();
		assertEquals(10, c.Operation(5,5,"Addition"));
		assertEquals(12, c.Operation(3,4,"Subtraction"));
		assertEquals(9, c.Operation(3,3,"Multiplication"));
	}
}
/**
 * 
 * @author Priyanka
 * SI,CI is simple interest and compound interest
 */
 
 public class SICIUnitTestCase
 {
	 
	@Test
	public void TestCaseSimpleInterest() {
		SimpleCompoundInterest simplecompoundinterest;
		 simpleInterest = new SimpleCompoundInterest(20000, 1.5f, 2);
		assertEquals(600, simpleInterest.SimpleInterest());
		simpleInterest = new SimpleCompoundInterest(20000, 2.5f, 5);
		assertEquals(1000, simpleInterest.SimpleInterest());
	}
	@Test
	void TestCaseCompoundIntrest() {
		SimpleCompoundInterest compoundInterest;
		compoundInterest = new SimpleCompoundInterest(50000, 4.5f, 4);
		assertEquals(59625.93, compoundInterest.CompoundInterest());
		compoundInterest = new SimpleCompoundInterest(10202, 1.5f, 1);
		assertEquals(10355.03, compoundInterest.CompoundInterest());
	}
 }
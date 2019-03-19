/**
 * 
 * @author Priyanka
 *
 */
class CostEstimatorTest {

	@Test
	public void TestCostEstimator() {
		CostEstimator ce;
		ce = new CostEstimator('A', 500, false);
		assertEquals(600000.0, ce.findCost());
		ce = new CostEstimator('B', 500.618, false);
		assertEquals(750927, ce.findCost());
		ce = new CostEstimator('C', 550, false);
		assertEquals(990000.0, ce.findCost());
		ce = new CostEstimator('C', 800, true);
		assertEquals(2000000.0, ce.findCost());
		
	}

}

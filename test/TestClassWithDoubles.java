import zunit.TestSuite;

public class TestClassWithDoubles extends TestSuite {

    @Override
    public void testMethodList() {
        passingTest();
        failingTest();

    }

    public static void main(String[] args) {
        TestClassWithDoubles testClass = new TestClassWithDoubles();
        testClass.runTestSuite();
    }

    private void passingTest(){
        assertEquals(5.5,5.5);
    }
    private void failingTest(){
        assertEquals(3.5,7.1);
    }



}

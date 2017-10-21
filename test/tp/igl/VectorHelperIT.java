/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.igl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**  
 *
 * @author PC.H.D.G
 */
public class VectorHelperIT {
    
    public VectorHelperIT() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
   // Des methodes non utilisées pour ce cas  
   /* @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
*/
    /**
     * Test of getMin method, of class VectorHelper.
     */
  /*  @Test
    public void testGetMin() {
        System.out.println("getMin");
        VectorHelper instance = new VectorHelper();
        int expResult = 0;
        int result = instance.getMin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMax method, of class VectorHelper.
     */
  /*  @Test
    public void testGetMax() {
        System.out.println("getMax");
        VectorHelper instance = new VectorHelper();
        int expResult = 0;
        int result = instance.getMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of max_min method, of class VectorHelper.
     */
    @Test
    public void testMax_min() {
        System.out.println("max_min");
        int tabtest[] = {13,15,4,80,66,10,14};
        VectorHelper instance = new VectorHelper(tabtest);
        int max = 80;
        int min = 4;
        instance.max_min();
        assertEquals(max,instance.getMax());
        assertEquals(min,instance.getMin());

        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of sommer method, of class VectorHelper.
     */
    @Test
    public void testSommer() throws Exception {
        System.out.println("sommer");
        int[] tab2 = null;
        VectorHelper instance = new VectorHelper();
        instance.sommer(tab2);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of formule method, of class VectorHelper.
     */
    @Test
    public void testFormule() {
        System.out.println("formule");
        int tabtest[] = {13,15,4,80,66,10,14};
        VectorHelper instance = new VectorHelper(tabtest);
        instance.formule();
        int tabresult[] = {14,16,5,81,67,11,15};
        Assert.assertArrayEquals(tabresult,instance.tab);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of inverser method, of class VectorHelper.
     */
    @Test
    public void testInverser() {
        System.out.println("inverser");
        int tabtest[] = {13,15,4,80,66,10,14};
        VectorHelper instance = new VectorHelper(tabtest);
        instance.inverser();
        int tabresult[] = {14,10,66,80,4,15,13};
        Assert.assertArrayEquals(instance.tab,tabresult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of trier method, of class VectorHelper.
     */
    @Test
    public void testTrier() {
        System.out.println("trier");
        int tabtest[] = {13,15,4,80,66,10,14};
        VectorHelper instance = new VectorHelper(tabtest);
        instance.trier();
        int tabresult[] = {4,10,13,14,15,66,80};
        Assert.assertArrayEquals(instance.tab,tabresult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getMin method, of class VectorHelper.
     */
    @org.junit.Test
    public void testGetMin() {
        System.out.println("getMin");
        VectorHelper instance = new VectorHelper();
        int expResult = 0;
        int result = instance.getMin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMax method, of class VectorHelper.
     */
    @org.junit.Test
    public void testGetMax() {
        System.out.println("getMax");
        VectorHelper instance = new VectorHelper();
        int expResult = 0;
        int result = instance.getMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

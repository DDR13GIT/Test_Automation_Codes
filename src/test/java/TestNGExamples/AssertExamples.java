package TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertExamples {

    @Test
    public void testAssertions() {
        int actual = 5;
        int expected = 5;
        int[] actualArray = {1, 2, 3};
        int[] expectedArray = {1, 2, 3};
        Object obj1 = null;
        Object obj2 = new Object();
        Object obj3 = obj2;

        // assertEquals
        Assert.assertEquals(actual, expected, "Actual and expected values are not equal");

// assertNotEquals
        Assert.assertNotEquals(actual, 6, "Actual value is equal to 6");

// assertTrue
        Assert.assertTrue(actual == 5, "Actual value is not equal to 5");

// assertFalse
        Assert.assertFalse(actual == 6, "Actual value is equal to 6");

// assertNull
        Assert.assertNull(obj1, "Object is not null");

// assertNotNull
        Assert.assertNotNull(obj2, "Object is null");

// assertSame
        Assert.assertSame(obj2, obj3, "Objects do not point to the same reference");

// assertNotSame
        Assert.assertNotSame(obj1, obj2, "Objects point to the same reference");

    }
}

//Summary of Assert Methods
//assertEquals: Checks equality of two values.
//        assertNotEquals: Checks inequality of two values.
//        assertTrue: Checks if a condition is true.
//assertFalse: Checks if a condition is false.
//assertNull: Checks if an object is null.
//assertNotNull: Checks if an object is not null.
//assertSame: Checks if two references point to the same object.
//        assertNotSame: Checks if two references do not point to the same object.
//assertArrayEquals: Checks if two arrays are equal.
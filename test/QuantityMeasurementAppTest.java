/**
 * QuantityMeasurementAppTest - Unit Tests for UC2: Feet and Inches equality
 */


import org.junit.Test;
import static org.junit.Assert.*;

public class QuantityMeasurementAppTest {
    // Error cause: the file imports JUnit 4 (org.junit.*), where assertTrue/assertFalse
    // signatures are (String message, boolean condition). Several tests used JUnit 5
    // order (boolean, String), which causes method resolution/compilation errors.
    
    @Test
    public void testFeetEquality_SameValue() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);   
        QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(1.0); 
        
        boolean result = feet1.equals(feet2);

        assertTrue("Two Feet objects with value 1.0 should be equal", result);
    }

        @Test
        public void testFeetEquality_DifferentValue() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(2.0);

        boolean result = feet1.equals(feet2);

        assertFalse("Two Feet objects with different values (1.0 and 2.0) should not be equal", result);
    }

    @Test
    public void testFeetEquality_NullComparison() {
        QuantityMeasurementApp.Feet feet = new QuantityMeasurementApp.Feet(1.0);

        boolean result = feet.equals(null);

        assertFalse("A Feet object should not be equal to null", result);
    }

    @Test
    public void testFeetEquality_DifferentClass() {
        QuantityMeasurementApp.Feet feet = new QuantityMeasurementApp.Feet(1.0);
        String nonFeetObject = "1.0";

        boolean result = feet.equals(nonFeetObject);

        assertFalse("A Feet object should not be equal to a String object", result);
    }

    @Test
    public void testFeetEquality_SameReference() {
        QuantityMeasurementApp.Feet feet = new QuantityMeasurementApp.Feet(1.0);

        boolean result = feet.equals(feet);

        assertTrue("A Feet object should be equal to itself", result);
    }

    @Test
    public void testFeetEquality_SymmetricProperty() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(5.0);
        QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(5.0);

        boolean result1 = feet1.equals(feet2);
        boolean result2 = feet2.equals(feet1);

        assertTrue("Equality should be symmetric: if feet1.equals(feet2) then feet2.equals(feet1)", result1 && result2);
    }

    @Test
    public void testFeetEquality_TransitiveProperty() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(5.0);
        QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(5.0);
        QuantityMeasurementApp.Feet feet3 = new QuantityMeasurementApp.Feet(5.0);

        boolean result1 = feet1.equals(feet2);
        boolean result2 = feet2.equals(feet3);
        boolean result3 = feet1.equals(feet3);

        assertTrue("Equality should be transitive: if feet1.equals(feet2) and feet2.equals(feet3) then feet1.equals(feet3)", result1 && result2 && result3);
    }

    @Test
    public void testFeetEquality_FloatingPointPrecision() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.5);
        QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(1.5);

        boolean result = feet1.equals(feet2);

        assertTrue("Two Feet objects with floating point values (1.5 and 1.5) should be equal", result);
    }

    // @Test
    // public void testFeetEquality_NonNumericInputNaN() {
    //     try {
    //         new QuantityMeasurementApp.Feet(Double.NaN);
    //         fail("Expected IllegalArgumentException for NaN input");
    //     } catch (IllegalArgumentException ex) {
    //         assertTrue("NaN should be rejected as non-numeric input", ex.getMessage().contains("finite numeric"));
    //     }
    // }
}

//     @Test
//     public void testFeetAndInches_CrossTypeComparison() {
//         QuantityMeasurementApp.Feet feet = new QuantityMeasurementApp.Feet(1.0);
//         QuantityMeasurementApp.Inches inches = new QuantityMeasurementApp.Inches(1.0);

//         assertFalse("Feet should not be equal to Inches even if values match", feet.equals(inches));
//     }

//     @Test
//     public void testInchesEquality_SameValue() {
//         QuantityMeasurementApp.Inches inch1 = new QuantityMeasurementApp.Inches(1.0);
//         QuantityMeasurementApp.Inches inch2 = new QuantityMeasurementApp.Inches(1.0);

//         boolean result = inch1.equals(inch2);

//         assertTrue("Two Inches objects with value 1.0 should be equal", result);
//     }

//     @Test
//     public void testInchesEquality_DifferentValue() {
//         Inches inch1 = new Inches(1.0);
//         Inches inch2 = new Inches(2.0);

//         boolean result = inch1.equals(inch2);

//         assertFalse("Two Inches objects with different values (1.0 and 2.0) should not be equal", result);
//     }

//     @Test
//     public void testInchesEquality_NullComparison() {
//         Inches inch = new Inches(1.0);

//         boolean result = inch.equals(null);

//         assertFalse("An Inches object should not be equal to null", result);
//     }

//     @Test
//     public void testInchesEquality_DifferentClass() {
//         Inches inch = new Inches(1.0);
//         String nonInchObject = "1.0";

//         boolean result = inch.equals(nonInchObject);

//         assertFalse("An Inches object should not be equal to a String object", result);
//     }

//     @Test
//     public void testInchesEquality_SameReference() {
//         Inches inch = new Inches(1.0);

//         boolean result = inch.equals(inch);

//         assertTrue("An Inches object should be equal to itself", result);
//     }

//     @Test
//     public void testInchesEquality_NonNumericInputInfinity() {
//         try {
//             new Inches(Double.POSITIVE_INFINITY);
//             fail("Expected IllegalArgumentException for Infinity input");
//         } catch (IllegalArgumentException ex) {
//             assertTrue("Infinity should be rejected as non-numeric input", ex.getMessage().contains("finite numeric"));
//         }
//     }
// }

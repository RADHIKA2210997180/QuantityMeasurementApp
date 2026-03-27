package QuantityMeasurementApp;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class MeasurementApplicationTests {

    @Test
    void testFeetEquality_SameValue() {
        MeasurementApplication.Feet f1 = new MeasurementApplication.Feet(89.6);
        MeasurementApplication.Feet f2 = new MeasurementApplication.Feet(89.6);

        assertEquals(f1, f2);
    }

    @Test
    void testFeetInEquality_DifferentValue() {
        MeasurementApplication.Feet f1 = new MeasurementApplication.Feet(89.6);
        MeasurementApplication.Feet f2 = new MeasurementApplication.Feet(34.6);

        assertNotEquals(f1, f2);
    }
    @Test
    void testFeetNullable_NullValue() {
                MeasurementApplication.Feet f1 = new MeasurementApplication.Feet(55.0);

        assertFalse(f1.equals(null));
    }
    @Test
    void testFeetEquality_ClassComparison() {
        MeasurementApplication.Feet f1 = new MeasurementApplication.Feet(89.6);

       assertFalse(f1.equals("Some string"));
    
    
    }
    @Test
    void testFeetEquality_SameReference() {
        MeasurementApplication.Feet f1 = new MeasurementApplication.Feet(89.6);

       assertTrue(f1.equals(f1));
    
    
    }

    void testInchesEquality_SameValue() {

    	MeasurementApplication.Inches i1 = new MeasurementApplication.Inches(10.5);

    	MeasurementApplication.Inches i2 = new MeasurementApplication.Inches(10.5);



        assertEquals(i1, i2);

    }



    @Test

    void testInchesEquality_DifferentValue() {

    	MeasurementApplication.Inches i1 = new MeasurementApplication.Inches(10.5);

    	MeasurementApplication.Inches i2 = new MeasurementApplication.Inches(5.2);



        assertNotEquals(i1, i2);

    }



    @Test

    void testInchesEquality_NullValue() {

    	MeasurementApplication.Inches i1 = new MeasurementApplication.Inches(7.0);



        assertNotEquals(i1, null);

    }



    @Test

    void testInchesEquality_DifferentType() {

    	MeasurementApplication.Inches i1 = new MeasurementApplication.Inches(7.0);

        String other = "7.0";



        assertNotEquals(i1, other);

    }


}
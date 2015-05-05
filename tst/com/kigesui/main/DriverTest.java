package com.kigesui.main;

public class DriverTest extends junit.framework.TestCase {

    public void testNothing() {
    }

    public void testWillAlwaysFail() {
        fail("expected failure");
    }

    public void testAdd() {
        assertEquals(Driver.add(1,2),3);
    }

}

package com.lits.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.junit.JUnitRule;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class MainTest4JUnit {

    @Test
    public void test (){
//        assertEquals(4, summ(2,2));
        assertFalse(summ (1,2)==4);
        assertTrue(summ(2,2)==4);
    }

    @Test(expected = RuntimeException.class)
    public void test2 (){
    }


    private int summ (int n1, int n2){
        return n1 + n2;
    }
}

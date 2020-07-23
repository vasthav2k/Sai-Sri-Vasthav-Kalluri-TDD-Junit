package com.epam.TDDJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class First2CharsTest {
   First first;

    @BeforeEach
      void setup()
    {
        first = new First();
        }
    
    @Test
    void test0()
    {
    	assertEquals("AA", first.first("AAAA"));
    }

    @Test
      void test1() {
        assertEquals("BCD", first.first("ABCD"));
        }

    @Test
      void test2() {
        assertEquals("CD", first.first("AACD"));
        }

    @Test
      void test3() {
        assertEquals("BCD", first.first("BACD"));
        }

    @Test
      void test4() {
        assertEquals("BBAA", first.first("BBAA"));
        }
    
    @Test
    void test5()
  	{
     assertEquals("", first.first("AA"));
     }

    @Test
      void test6()
    	{
       assertEquals("BAA", first.first("AABAA"));
       }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author francesc.amoroso
 */
public class FizzBuzzTest {
  private FizzBuzz instance;
  public FizzBuzzTest() {

  }
  @Before
  public void setUp() {
    instance = new FizzBuzz();
  }
  @Test public void listeDeUnACent() {
    int[] tab = instance.cheatSheet();
    for(int i=0;i<100;i++){
      assertEquals(i+1,tab[i]);
    }
  }
  @Test public void testFizz() {
    for(int i=0;i<100;i++){
      if((i+1)%3 ==0)assertEquals("Fizz",instance.displayFizz(i+1));
    }
  }
  @Test public void testBuzz() {
    for(int i=0;i<100;i++){
      if((i+1)%5 == 0)assertEquals("Buzz",instance.displayBuzz(i+1));
    }
  }
  @Test public void testFizzBuzz() {
    for(int i=0;i<100;i++){
      if(((i+1)%5 == 0)&&((i+1)%3 == 0))assertEquals("FizzBuzz",instance.displayFizzBuzz(i+1));
    }
  }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sebastie.baumann
 */
public class FizzBuzz {
  public FizzBuzz() {
    // TODO code application logic here
  }
  public int[] cheatSheet(){
    int[] tab = new int[100];
    for(int i=0;i<100;i++){
      tab[i] = i+1;
    }
    return tab;
  }
  public void display() {
    int[] tab = cheatSheet();

    for(int elem : tab) {
      String result = displayFizzBuzz(elem)!=null ?
          displayFizzBuzz(elem) :
          displayFizz(elem)!=null ?
              displayFizz(elem) : displayBuzz(elem)!=null ?
              displayBuzz(elem) : Integer.toString(elem);
      System.out.println(result);
    }
  }
  public String
  displayFizz(int val) {
    if(val%3 == 0)return "Fizz";
    return null;
  }
  public String displayBuzz(int val) {
    if(val%5 == 0)return "Buzz";
    return null;
  }
  public String displayFizzBuzz(int val) {
    if(((val)%5 == 0)&&((val)%3 == 0))return "FizzBuzz";
    return null;
  }
}
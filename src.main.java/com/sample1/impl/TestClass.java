/** Copyright CodeJava.net To Present
All rights reserved.
*/
package com.sample1.impl;

public class TestClass {
 private static int a = 7;
 private static int b = 9;
  public static void main(String[] args) {

    sum(a,b);
    min(a,b);
  }
public static int sum(int a, int b){
 return a+b; 
}
public static int min(int a, int b){
  return a-b; 
 }
}

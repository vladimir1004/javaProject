package com.baranzev;


public class Equaition {
  private double a;
  private double b;
  private double c;

  private int n;
// doing construction
  public Equaition(double a, double b, double c){

    this.a = a;
    this.b = b;
    this.c = c;

    double d = b*b - 4*a*c;
    if(d>0){
      n=2;

    }
else {
      if (d==0){
        n=1;
      }
      else {
        n=0;
      }
    }
  }
  //doing metod that returns the result
  public int rootNumber(){
    return n;
  }
}

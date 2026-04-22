package org.example;

public class Methods {
  
  public double somar(double a, double b) {
    return a + b;
  }
  
  public double subtrair(double a, double b) {
    return a - b;
  }
  
  public double multiplicar(double a, double b) {
    return a * b;
  }
  
  public Double dividir(double a, double b) {
    if (b == 0) return null;
    return a / b;
  }
  
  public double potencia(double a, double b) {
    return Math.pow(a, b);
  }
  
  public double raiz(double a, double b) {
    return Math.pow(a, 1/b);
  }
  
  public double log(double a, double b) {
    return (Math.log(a) / Math.log(b));
  }
}

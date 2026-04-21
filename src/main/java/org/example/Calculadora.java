package org.example;

import static java.lang.System.out;

public class Calculadora {
  public static void main(String[] args) {
    
    var m = new Methods();
    
    var sc = new java.util.Scanner(System.in);
    
    do {
      out.println("Operações:");
      out.println("\n\n1. Somar");
      out.println("\n2. Subtrair");
      out.println("\n3. Multiplicar");
      out.println("\n4. Dividir");
      out.println("\n5. Potência");
      out.println("\n6. Raíz");
      out.println("\n7. Logarítmo");
      out.println("\n\n");
    
    
      switch (sc.nextInt()) {
        case 1:
          out.print("Digite o primeiro valor:");
          int a = sc.nextInt();
          out.print("\nDigite o segundo valor:");
          int b = sc.nextInt();
          out.format("A soma dos números digitados é: %.2f\n", m.somar(a, b));
          break;
        
        case 2:
          out.print("Digite o primeiro valor:");
          int c = sc.nextInt();
          out.print("\nDigite o segundo valor:");
          int d = sc.nextInt();
          out.format("A subtração dos números digitados é: %.2f\n", m.subtrair(c, d));
          break;
        
        case 3:
          out.print("Digite o primeiro valor:");
          int e = sc.nextInt();
          out.print("\nDigite o segundo valor:");
          int f = sc.nextInt();
          out.format("A multiplicação dos números digitados é: %.2f\n", m.multiplicar(e, f));
          break;
        
        case 4:
          out.print("Digite o primeiro valor:");
          int g = sc.nextInt();
          out.print("\nDigite o segundo valor:");
          int h = sc.nextInt();
          if (h == 0) {
            out.println("Não é possível dividir por 0");
            break;
          }
          out.format("A divisão dos números digitados é: %.2f\n", m.dividir(g, h));
          break;
        
        case 5:
          out.print("Digite o primeiro valor:");
          int i = sc.nextInt();
          out.print("\nDigite o segundo valor:");
          int j = sc.nextInt();
          out.format("A potência dos números digitados (%d^%d) é: %.4f\n", i, j, m.potencia(i, j));
          break;
        
        case 6:
          out.print("Digite o primeiro valor:");
          int k = sc.nextInt();
          out.print("\nDigite o segundo valor:");
          int l = sc.nextInt();
          out.format("A radiciação dos números digitados é: %.4f\n", m.raiz(k, l));
          break;
        
        case 7:
          out.print("Digite o primeiro valor:");
          int ma = sc.nextInt();
          out.print("\nDigite o segundo valor:");
          int n = sc.nextInt();
          out.format("O logarítmo dos números digitados é: %.4f\n", m.log(ma, n));
          break;
        
        default:
          out.println("Operação inválida. Digite novamente.");
        
      }
    } while (true);
  }
}
import javax.swing.JOptionPane;

public class CasoMenorIgualVinteSubtraiCinco
{
   public static void main(String [] args)
   {
      int n1, n2, soma;
      
      n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro numero: "));
      n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo numero: "));
      
      soma = n1 + n2;
      
      if(soma <= 20)
      {
         System.out.println((soma - 5));
      }
   }
}
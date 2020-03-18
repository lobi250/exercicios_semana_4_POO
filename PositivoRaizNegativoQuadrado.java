import javax.swing.JOptionPane;

public class PositivoRaizNegativoQuadrado
{
   public static void main(String [] args)
   {
      int numero;
      
      numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero: "));
      
      if(numero >= 0)
      {
         System.out.println(Math.sqrt(numero));
      }
      else
      {
         System.out.println(numero * numero);
      }
   }
}
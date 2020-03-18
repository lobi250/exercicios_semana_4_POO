import javax.swing.JOptionPane;

public class EscreverEmOrdemCrescente
{
   public static void main(String [] args)
   {
      int n1, n2, n3;
      
      n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro numero: "));
      n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo numero: "));
      n3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro numero: "));
      
      if(n1 > n2 && n1 > n3) //ENTRA CASO O N1 FOR O MAIOR
      {
         if(n2 > n3) //ENTRA CASO N2 É MAIOR QUE N3
         {
            System.out.println(n3 + " " + n2 + " " + n1);
         }
         else
         {
            System.out.println(n2 + " " + n3 + " " + n1);
         }
      }
      else
      {
         if(n2 > n1 && n2 > n3) //ENTRA CASO O N2 FOR O MAIOR
         {
            if(n3 > n1)
            {
               System.out.println(n1 + " " + n3 + " " + n2);
            }
            else
            {
               System.out.println(n3 + " " + n1 + " " + n2);
            }
         }
         else
         {
            if(n3 > n1 && n3 > n2) //ENTRA CASO O N3 FOR O MAIOR
            {
               if(n2 > n1)
               {
                  System.out.println(n1 + " " + n2 + " " + n3);
               }
               else
               {
                  System.out.println(n2 + " " + n1 + " " + n3);
               }
            }
         }
      }
      
    }
}
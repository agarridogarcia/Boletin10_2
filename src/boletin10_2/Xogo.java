
package boletin10_2;

import javax.swing.JOptionPane;


public class Xogo {
    private int num1, num2,intentos,cont;
    
    public Xogo(){
        
    }
    public int ponNumero(){ //método para pedir o número e que este entre o 1 e 50
       num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entre 1 e 50"));
       while(num1<1 || num1>50)
       num1=Integer.parseInt(JOptionPane.showInputDialog("Mal,Introduce un número entre 1 e 50")); 
       return num1;
    }
    //(int) (Math.random()*50);
    public void adivinaNum (){
        
        //num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entre 1 e 50"));
        intentos=Integer.parseInt(JOptionPane.showInputDialog("Introduce os intentos que ten o xogador 2 para adiviñar o número"));
        
        
         
            for(cont=1;cont<=intentos;cont++){
              num2=(int) (Math.random()*50);
                      //Integer.parseInt(JOptionPane.showInputDialog("Adiviña o número que introduciu o xogador 1"));   
          
            if(num1>num2)
                System.out.println("É maior");
            else if(num1<num2)
                System.out.println("É menor");
            
           else if(num1==num2)
                System.out.println("Adivinaste o número!");
           else
            
                System.out.println("Acabáronseche os intentos, volve a empezar, o número era: " + num1);
            
         }     
            
    }
}


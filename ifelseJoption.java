import javax.swing.JOptionPane;

public class ifelseJoption{

public static void main(String[] args){

    int numero, dato= 5;
	
 numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero correcto"));  

if(numero == dato){ 
	 
   JOptionPane.showMessageDialog(null," EL NUMERO ES CORRECTO"); 
}
else{

JOptionPane.showMessageDialog(null," EL NUMERO ES INCORRECTO"); 

} 

}

}

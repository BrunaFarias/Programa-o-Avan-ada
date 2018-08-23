
import javax.swing.JOptionPane;


public class Eleicao {
    public static  void main(String[] args){
        // Objetos para candidato
		Candidato c1 = new Candidato("Bolsanaro");
		Candidato c2 = new Candidato("Lula");
		Candidato c3 = new Candidato("Marina");
   
    //menu
  int op;
    do  {
     op = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite seu voto: \n1-Bolsanaro\n2-Lula\n3-Marina\n4-Finalizar votação"));
    

			if (op == 1) {

				c1.incrementoVT();
			
			}
			if (op == 2) {

				c2.incrementoVT();
                        }
			
			if (op == 3) {

				c3.incrementoVT();	
			}
		}while(op <4 );

		System.out.println(c1.getNome()+ ": "+c1.getQtdVotos());
		System.out.println(c2.getNome()+ ": "+c2.getQtdVotos());
		System.out.println(c3.getNome()+": "+c3.getQtdVotos());

		
	 }

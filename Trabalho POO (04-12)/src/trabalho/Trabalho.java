/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

/**
 *
 * @author alunodev05
 */
public class Trabalho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Imovel teste = new Imovel();
        
        teste.setNome(InOut.leString("Informe o nome do proprietário do imóvel: "));
        
        teste.setImposto(InOut.leFloat("Informe o valor do imposto: R$"));
        
        teste.setMesesAtraso(InOut.leInt("Informe a quantidade de meses em atraso: "));
        
        teste.calcularMulta();
        
        InOut.MsgDeInformacao("Final", "Proprietário: " + teste.getNome() + 
                                       "\nImposto: R$ " + teste.getImposto() +
                                       "\nMeses em atraso: " + teste.getMesesAtraso() +
                                       "\nMulta: R$ " + teste.getMulta());
        
    }
    

}

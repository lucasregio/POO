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
public class Imovel {
    
    private String nome;
    
    private int mesesAtraso;
    
    private float imposto, multa;

    public Imovel() {
    }

    public Imovel(String nome, float imposto, int mesesAtraso) {
        this.nome = nome;
        this.imposto = imposto;
        this.mesesAtraso = mesesAtraso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }
    
    public int getMesesAtraso() {
        return mesesAtraso;
    }

    public void setMesesAtraso(int mesesAtraso) {
        this.mesesAtraso = mesesAtraso;
    }

    public float getMulta() {
        return multa;
    }

    public void setMulta(float multa) {
        this.multa = multa;
    }

    
    public void calcularMulta() {
        if(mesesAtraso <= 5) {
            multa = (float) (imposto * 1.01);
        }
        else if(mesesAtraso >= 6 && mesesAtraso <= 8){
            multa = (float) (imposto * 1.023);
        }
        else if(mesesAtraso == 9 || mesesAtraso == 10){
            multa = (float) (imposto * 1.03);
        }
        else if(mesesAtraso == 11 || mesesAtraso == 12){
            multa = (float) (imposto * 1.054);
        } 
        else if( mesesAtraso > 12){
            multa = (float) (imposto * 1.1);
        }
        
    }
        
}

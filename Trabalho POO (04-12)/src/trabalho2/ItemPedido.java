/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

/**
 *
 * @author alunodev05
 */
public class ItemPedido {
    
    private String item;
    private int quantidade;
    private float precoUnitario, precoTotal;

    
    public ItemPedido() {
    }

    public ItemPedido(String item, int quantidade, float precoUnitario, float precoTotal) {
        this.item = item;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.precoTotal = precoTotal;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public float getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }
    
    public float calcularPrecoTotal(){        
        precoTotal = this.precoUnitario * this.quantidade;        
        return precoTotal;       
    }
}

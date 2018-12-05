/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

import java.util.Date;
import java.util.Set;

/**
 *
 * @author alunodev05
 */
public class Pedido{
    
    private int pedidoId;
    private Date dataEmissao;
    private float valorTotal; 
    private Set<Cliente> cliente;
    
    public Pedido() {
    }

    public Pedido(int pedidoId, Date dataEmissao, float valorTotal) {
        this.pedidoId = pedidoId;
        this.dataEmissao = dataEmissao;
        this.valorTotal = valorTotal;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public float getValorTotal() {
        return valorTotal;
    }
    
    
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public Set<Cliente> buscarPorCliente(Cliente cli){
        if(!cliente.contains(cli)) {
            InOut.MsgDeInformacao("Busca por Cliente", "Cliente não encontrado");
        }
            
        return cliente;        
    }
    
    public boolean removerPorCliente(Cliente cliente){
        
        return false;        
    }
    
    public boolean atualizarCliente(Cliente cliente){
        return false;
        
    }
    
    public boolean inserirCliente(Cliente cliente){
        return false;
        
    }
    
    public boolean buscarPorItem(ItemPedido itemPedido){
        return false;
        
    }
    
    public boolean removerPorItem(ItemPedido itemPedido){
        return false;
        
    }
    
    public boolean atualizarPorItem(ItemPedido itemPedido){
        return false;
        
    }
    
    public boolean inserirItemPedido(ItemPedido itemPedido){
        return false;
        
    }
}

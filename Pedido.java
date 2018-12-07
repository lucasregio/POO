/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunodev05
 */
public class Pedido {

    private int pedidoId;
    private String dataEmissao;
    private float valorTotal;
    private List<Cliente> clientes;
    private List<ItemPedido> itemPedido;
    

    public Pedido() {
       clientes = new ArrayList();
       itemPedido = new ArrayList();
    }

    public Pedido(int pedidoId, String dataEmissao, float valorTotal) {
       //clientes = new ArrayList();
       //itemPedido = new ArrayList();
       this();
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

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente buscarPorCliente(int id) {
        //List<Cliente> cliList;
        for (int i = 0; i < clientes.size(); i++) {
            if (id == clientes.get(i).getClienteId()) {
                return clientes.get(i);
            }
        }
        return null;
    }

    public boolean removerPorCliente(int id) {

        for (int i = 0; i < clientes.size(); i++) {
            if (id == clientes.get(i).getClienteId()) {
                clientes.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean atualizarCliente(int id) {
        for (int i = 0; i < clientes.size(); i++) {
            if (id == clientes.get(i).getClienteId()) {
                clientes.get(i).setClienteId(InOut.leInt("Digite a nova ID"));
                clientes.get(i).setDesconto(InOut.leFloat("Digite o novo Desconto"));
                clientes.get(i).setNome(InOut.leString("Digite o novo nome"));
                clientes.get(i).setEmail(InOut.leString("Digite o novo e-mail"));
                clientes.get(i).setTelefone(InOut.leString("Digite o novo telefone"));
                return true;
            }
        }
        return false;

    }

    public boolean inserirCliente(Cliente cliente) {
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
            return true;
        }
        return false;
    }

    public boolean buscarPorItem(String item) {
        for(int i = 0; i < itemPedido.size(); i++) {
            if (item.equals(itemPedido.get(i).getItem())) {
                InOut.MsgDeInformacao("Item", item);
                return true;
            }
        
        }
        return false;

    }

    public boolean removerPorItem(String item) {
        for (int i = 0; i < itemPedido.size(); i++) {
            if (item.equals(itemPedido.get(i).getItem())) {
                itemPedido.remove(i);
                InOut.MsgDeInformacao("removerPorItem", "Item " + item + "removido");
                return true;
            }
        }
        return false;
    }

    public boolean atualizarPorItem(String item) {
        for (int i = 0; i < itemPedido.size(); i++) {
            if (item.equals(itemPedido.get(i).getItem())) {
                itemPedido.get(i).setItem(InOut.leString("Digite a nova ID"));
                itemPedido.get(i).setQuantidade(InOut.leInt("Digite o novo Desconto"));
                itemPedido.get(i).setPrecoUnitario(InOut.leFloat("Digite o novo Preco unitario"));
                return true;
            }
        }
        return false;
    }

    public boolean inserirItemPedido(String item) {
//        if (!itemPedido.contains(item)){
//            itemPedido.add(item);
        return true;
        }
    }


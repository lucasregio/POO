/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

import java.util.List;

/**
 *
 * @author alunodev05
 */
public class Cliente extends Usuario{
    private int clienteId;
    private String email;
    private float desconto;


    public Cliente() {
    }

    public Cliente(int clienteId, String email, float desconto, String nome, String telefone) {
        super(nome, telefone);
        this.clienteId = clienteId;
        this.email = email;
        this.desconto = desconto;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

import java.util.Set;

/**
 *
 * @author alunodev05
 */
public class Loja {
    
    Set<String> cursos;
    
    public Loja() {
    }

    public Loja(Set<String> cursos) {
        this.cursos = cursos;
    }

    public Set<String> getCursos() {
        return cursos;
    }

    public void setCursos(Set<String> cursos) {
        this.cursos = cursos;
    }
    
    public static void main(String[] args) {
        Cliente c1;
        c1 = new Cliente(123, "abc@email.com", (float) 5.0, "angelo", "12345667899");
        //c1.setNome("angelo");
        //c1.setTelefone("123456789");
        Pedido p1;
        p1 = new Pedido(1, "01-01-1997", (float) 1.0);
        p1.inserirCliente(c1);
       
        
        System.out.println(p1.buscarPorCliente(c1.getClienteId()).nome);
        
    }
}

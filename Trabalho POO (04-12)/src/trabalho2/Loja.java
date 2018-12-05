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
            
    }
}

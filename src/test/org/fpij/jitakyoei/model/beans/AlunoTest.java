package org.fpij.jitakyoei.model.beans;

import org.junit.jupiter.api.Test;
import org.fpij.jitakyoei.model.CriaObjetoTeste;
import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {
    
    Aluno aluno = CriaObjetoTeste.criaAluno();
    
    @Test
    public void testEquals() {
        Professor professor = CriaObjetoTeste.criaProfessor();
        Entidade entidade = CriaObjetoTeste.criaEntidade();
        Filiado filiado = CriaObjetoTeste.criaFiliado();
        
        aluno.setProfessor(professor);
        aluno.setEntidade(entidade);
        aluno.setFiliado(filiado);
        
        assertEquals(aluno.getProfessor(), professor);
        assertEquals(aluno.getEntidade(), entidade);
        assertEquals(aluno.getFiliado(), filiado);
    }
    
    @Test
    public void testToString() {
    }
    
}

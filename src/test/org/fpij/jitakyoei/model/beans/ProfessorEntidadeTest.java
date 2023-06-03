package org.fpij.jitakyoei.model.beans;

import org.junit.jupiter.api.Test;
import org.fpij.jitakyoei.model.CriaObjetoTeste;
import static org.junit.jupiter.api.Assertions.*;

public class ProfessorEntidadeTest {
    
    ProfessorEntidade professorEntidade = CriaObjetoTeste.criaProfessorEntidade();

    @Test
    public void testEquals() {
        Professor professor = CriaObjetoTeste.criaProfessor();
        Entidade entidade = CriaObjetoTeste.criaEntidade();

        professorEntidade.setProfessor(professor);
        professorEntidade.setEntidade(entidade);

        assertEquals(professorEntidade.getProfessor(), professor);
        assertEquals(professorEntidade.getEntidade(), entidade);
    }
    
    @Test
    public void testToString() {
    }
    
}

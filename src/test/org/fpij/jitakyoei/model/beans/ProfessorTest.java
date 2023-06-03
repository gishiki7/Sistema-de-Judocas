package org.fpij.jitakyoei.model.beans;

import org.junit.jupiter.api.Test;
import org.fpij.jitakyoei.model.CriaObjetoTeste;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;

public class ProfessorTest {
    
    Professor professor = CriaObjetoTeste.criaProfessor();

    @Test
    public void testEquals() {
        Filiado filiado = CriaObjetoTeste.criaFiliado();
        Entidade entidade = CriaObjetoTeste.criaEntidade();
        List<Entidade> entidades = new ArrayList<>();
        entidades.add(entidade);
        
        professor.setEntidades(entidades);
        professor.setFiliado(filiado);
        
        assertEquals(professor.getFiliado(), filiado);
        assertEquals(professor.getEntidades(), entidades);
    }

    @Test
    public void testToString() {
    }
    
}

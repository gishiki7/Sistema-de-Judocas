package org.fpij.jitakyoei.model.beans;

import org.junit.jupiter.api.Test;
import org.fpij.jitakyoei.model.CriaObjetoTeste;
import org.fpij.jitakyoei.util.CorFaixa;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

public class FaixaTest {
    
    Faixa faixa = CriaObjetoTeste.criaFaixa();
    
    @Test
    public void testEquals() {
        CorFaixa cor = CorFaixa.VERDE;
        Date data = new Date();
        
        faixa.setCor(cor);
        faixa.setDataEntrega(data);
        
        assertEquals(faixa.getCor(), cor);
        assertEquals(faixa.getDataEntrega(), data);
    }

    @Test
    public void testToString() {
    }
    
}

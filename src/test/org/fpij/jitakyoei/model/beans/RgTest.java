package org.fpij.jitakyoei.model.beans;

import org.junit.jupiter.api.Test;
import org.fpij.jitakyoei.model.CriaObjetoTeste;
import static org.junit.jupiter.api.Assertions.*;

public class RgTest {
    
    Rg rg = CriaObjetoTeste.criaRg();

    @Test
    public void testEquals() {
        String numero = "19.856.446-3";
        String orgaoExpedidor = "DEF";
        
        rg.setNumero(numero);
        rg.setOrgaoExpedidor(orgaoExpedidor);
        
        assertEquals(numero, rg.getNumero());
        assertEquals(orgaoExpedidor, rg.getOrgaoExpedidor());
    }

    @Test
    public void testToString() {
    }
    
}

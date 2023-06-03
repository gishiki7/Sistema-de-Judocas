package org.fpij.jitakyoei.model.beans;

import org.junit.jupiter.api.Test;
import org.fpij.jitakyoei.model.CriaObjetoTeste;
import static org.junit.jupiter.api.Assertions.*;

public class EnderecoTest {
    
    Endereco endereco = CriaObjetoTeste.criaEndereco();
    
    @Test
    public void testEquals() {
        String rua = "Av. Humberto de Alencar Castelo Branco";
        String numero = "3972-B";
        String bairro = "Assunção";
        String cidade = "São Bernardo do Campo";
        String estado = "São Paulo";
        String cep = "09850-901";
        
        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);
        endereco.setEstado(estado);
        endereco.setCep(cep);
        
        assertEquals(endereco.getRua(), rua);
        assertEquals(endereco.getNumero(), numero);
        assertEquals(endereco.getBairro(), bairro);
        assertEquals(endereco.getCidade(), cidade);
        assertEquals(endereco.getEstado(), estado);
        assertEquals(endereco.getCep(), cep);
    }

    @Test
    public void testToString() {
    }
    
}

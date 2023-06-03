package org.fpij.jitakyoei.model.beans;

import org.junit.jupiter.api.Test;
import org.fpij.jitakyoei.model.CriaObjetoTeste;
import static org.junit.jupiter.api.Assertions.*;

public class EntidadeTest {
    
    Entidade entidade = CriaObjetoTeste.criaEntidade();

    @Test
    public void testEquals() {
        String nome = "FEI";
        String cnpj = "61.023.156/0001-82";
        String telefone1 = "4353-2900";
        String telefone2 = "3274-5200";
        Endereco endereco = CriaObjetoTeste.criaEndereco();
        
        entidade.setNome(nome);
        entidade.setCnpj(cnpj);
        entidade.setTelefone1(telefone1);
        entidade.setTelefone2(telefone2);
        entidade.setEndereco(endereco);
        
        assertEquals(entidade.getNome(), nome);
        assertEquals(entidade.getCnpj(), cnpj);
        assertEquals(entidade.getTelefone1(), telefone1);
        assertEquals(entidade.getTelefone2(), telefone2);
        assertEquals(entidade.getEndereco(), endereco);
    }
    
    @Test
    public void testToString() {
    }
    
}

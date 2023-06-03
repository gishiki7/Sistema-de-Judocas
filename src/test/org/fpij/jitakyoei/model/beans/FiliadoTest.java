package org.fpij.jitakyoei.model.beans;

import org.junit.jupiter.api.Test;
import org.fpij.jitakyoei.model.CriaObjetoTeste;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class FiliadoTest {
    
    Filiado filiado = CriaObjetoTeste.criaFiliado();

    @Test
    public void testEquals() {
        Long id = 255L;
        String nome = "Roberto Santos";
        String registroCbj = "894-061-163.24";
        Date dataNascimento = new Date();
        Date dataCadastro = new Date();
        String telefone1 = "95467-6843";
        String telefone2 = "93240-3215";
        String email = "roberto.santos@gmail.com";
        String cpf = "198.315.098-15";
        String observacoes = "Observacao do Roberto";
        Rg rg = CriaObjetoTeste.criaRg();
        Endereco endereco = CriaObjetoTeste.criaEndereco();
        Faixa faixa = CriaObjetoTeste.criaFaixa();
        List<Faixa> faixas = new ArrayList<>();
        faixas.add(faixa);
        
        filiado.setId(id);
        filiado.setNome(nome);
        filiado.setRegistroCbj(registroCbj);
        filiado.setDataNascimento(dataNascimento);
        filiado.setDataCadastro(dataCadastro);
        filiado.setTelefone1(telefone1);
        filiado.setTelefone2(telefone2);
        filiado.setEmail(email);
        filiado.setCpf(cpf);
        filiado.setObservacoes(observacoes);
        filiado.setRg(rg);
        filiado.setEndereco(endereco);
        filiado.setFaixas(faixas);
        
        assertEquals(filiado.getId(), id);
        assertEquals(filiado.getNome(), nome);
        assertEquals(filiado.getRegistroCbj(), registroCbj);
        assertEquals(filiado.getDataNascimento(), dataNascimento);
        assertEquals(filiado.getDataCadastro(), dataCadastro);
        assertEquals(filiado.getTelefone1(), telefone1);
        assertEquals(filiado.getTelefone2(), telefone2);
        assertEquals(filiado.getEmail(), email);
        assertEquals(filiado.getCpf(), cpf);
        assertEquals(filiado.getObservacoes(), observacoes);
        assertEquals(filiado.getEndereco(), endereco);
        assertEquals(filiado.getRg(), rg);
        assertEquals(filiado.getFaixas(), faixas);
    }
    
    @Test
    public void testToString() {
    }
    
}

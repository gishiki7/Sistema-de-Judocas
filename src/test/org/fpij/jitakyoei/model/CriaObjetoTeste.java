package org.fpij.jitakyoei.model;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.view.AppView;
import org.fpij.jitakyoei.model.beans.*;
import org.fpij.jitakyoei.util.CorFaixa;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class CriaObjetoTeste {
    public static AppView testAppView() {
        return new AppView() {
            @Override
            public void handleModelChange(Object obj) {
            }

            @Override
            public void displayException(Exception e) {
            }

            @Override
            public void registerFacade(AppFacade facade) {
            }
        };
    }
    
    public static Aluno criaAluno() {
        Aluno aluno = new Aluno();
        aluno.setFiliado(CriaObjetoTeste.criaFiliado());
        aluno.setEntidade(CriaObjetoTeste.criaEntidade());
        aluno.setProfessor(CriaObjetoTeste.criaProfessor());
        
        return aluno;
    }
    
    public static Endereco criaEndereco() {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Teste");
        endereco.setNumero("1234");
        endereco.setBairro("Bairro Teste");
        endereco.setCidade("Cidade Teste");
        endereco.setEstado("Estado Teste");
        endereco.setCep("12345-678");
        
        return endereco;
    }
    
    public static Entidade criaEntidade() {
        Entidade entidade = new Entidade();
        entidade.setNome("Teste");
        entidade.setCnpj("12.345.678/0001-90");
        entidade.setTelefone1("91234-5678");
        entidade.setTelefone2("98765-4321");
        entidade.setEndereco(CriaObjetoTeste.criaEndereco());
        return entidade;
    }
    
    public static Faixa criaFaixa() {
        Faixa faixa = new Faixa();
        faixa.setCor(CorFaixa.AZUL);
        faixa.setDataEntrega(new Date());
        
        return faixa;
    }
    
    public static Filiado criaFiliado() {
        Filiado filiado = new Filiado();
        List<Faixa> faixas = new ArrayList<>();
        faixas.add(CriaObjetoTeste.criaFaixa());
        
        filiado.setId(new Random().nextLong());
        filiado.setNome("Teste");
        filiado.setRegistroCbj("123.456.789-00");
        filiado.setDataNascimento(new Date());
        filiado.setDataCadastro(new Date());
        filiado.setTelefone1("91234-5678");
        filiado.setTelefone2("98765-4321");
        filiado.setEmail("teste@teste.com");
        filiado.setCpf("123.456.789-00");
        filiado.setObservacoes("Observação teste");
        filiado.setRg(CriaObjetoTeste.criaRg());
        filiado.setEndereco(CriaObjetoTeste.criaEndereco());
        filiado.setFaixas(faixas);
        
        return filiado;
    }
    
    public static ProfessorEntidade criaProfessorEntidade() {
        ProfessorEntidade professorEntidade = new ProfessorEntidade(
                CriaObjetoTeste.criaProfessor(),
                CriaObjetoTeste.criaEntidade()
        );
        
        return professorEntidade;
    }
    
    public static Professor criaProfessor() {
        Professor professor = new Professor();
        List<Entidade> entidades = new ArrayList<>();
        entidades.add(CriaObjetoTeste.criaEntidade());
        
        professor.setFiliado(CriaObjetoTeste.criaFiliado());
        professor.setEntidades(entidades);
        
        return professor;
    }
    
    public static Rg criaRg() {
        Rg rg = new Rg();
        rg.setNumero("12.345.678-9");
        rg.setOrgaoExpedidor("ABC");
        
        return rg;
    }
    
}

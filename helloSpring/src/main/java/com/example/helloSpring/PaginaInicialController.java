package com.example.helloSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

// Marca a Classe Como um Controlador REST e Trata Seus Métodos Como Endpoints da Aplicação
@RestController
public class PaginaInicialController {

    // Mapeia Métodos de Requisições HTTP GET 
    @GetMapping("/")  // Apenas '/' Defini Que Qualquer Acesso ao Localhost Acionará o Método Abaixo
    public String home(){ 
        return "Bem-vindo à página inicial!";
    }

    @GetMapping("/sobre")
    public String sobre() {
        return "Esta é a primeira API feita com SpringBoot e Java.";
    }

    // Mapeia um Endpoint Onde um Valor é Passado na URL e Usado no Método
    @GetMapping("/aluno/{nome}")  // O Valor Entre Chaves Indica Que Será Passado um Parâmetro na URL
    public String aluno(@PathVariable String nome) {  // O @PathVariable Indica Que o Valor Passado na URL Será Usado Como Parâmetro do Método
        return "Olá, " + nome + "! Bem-vindo(a) à página do aluno.";
    }

    // Rotas da Atividade Prática

    @GetMapping("/curso")
    public String curso() {
        return "Você está na página do curso de Análise e Desenvolvimento de Sistemas.";
    }

    @GetMapping("/disciplina")
    public String disciplina() {
        return "Você está na página da disciplina de Programação Orientada a Objetos.";
    }

    @GetMapping("/mensagem/{msg}")
    public String mensagem(@PathVariable String msg) {
        return "Sistema Informa: " + msg;
    }
}
package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// Classe de Conexão Com o Banco de Dados 
public class Main {
    // Método Principal Estabelecendo a Conexão e Consultando no Banco de Dados
    public static void main(String[] args) { 
        String url = "jdbc:mysql://localhost:3306/escola"; // URL do Banco de Dados
        String user = "root"; // Usuário do Banco de Dados
        String password = ""; // Senha do Banco de Dados

        // Método Try-Catch Para Tratar Possíveis Erros Para Estabelecer Conexão e Fazer Consulta no Banco de Dados
        try { 
            Connection conn = DriverManager.getConnection(url, user, password); // Estabelecendo a Conexão com o Banco de Dados
            System.out.println("Conexão bem-sucedida!");

            Statement stmt = conn.createStatement(); // Representação de uma Declaração SQL Para Executar a Consulta no Banco de Dados
            String sql = "SELECT * FROM alunos"; // Variável String Para Armazenar o Comando de Consulta Que Será Executado no Banco de Dados

            // Variável ResultSet Para Armazenar o Resultado da Consulta Executada
            ResultSet rs = stmt.executeQuery(sql); // Método Statement Para Executuar a Consulta e Armazenar o Resultado 

            // Loop Para Percorrer o Resultado da Consulta e Exibir os Dados dos Alunos
            while (rs.next()) { 
                int id = rs.getInt("id"); // Utilizando o Método ResultSet Para Obter o Valor da Coluna "id" e Armazenar em Uma Nova Variável
                String nome = rs.getString("nome"); // Utilizando o Método ResultSet Para Obter o Valor da Coluna "nome" e Armazenar em Uma Nova Variável
                int idade = rs.getInt("idade"); // Utilizando o Método ResultSet Para Obter o Valor da Coluna "idade" e Armazenar em Uma Nova Variável
                System.out.println(id + " - " + nome + " - " + idade + " anos");
            }

            // Fechando o ResultSet, Statement e Conexão Para Liberar Recursos e Evitar Vazamentos de Memória
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }
}
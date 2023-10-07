package com.prova;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner console = new Scanner(System.in);

    private List<Consulta> consults = new LinkedList<>();

    public Veterinario cadConsulta(Integer id, String nome, String endereco, String telefone) {
        var Veterinario = new Veterinario(id, nome, endereco, telefone);


        private static void CadConsulta () {

            System.out.println("Qual seu ID");
            var id = console.nextLine();

            System.out.println("Qual é o seu nome?");
            var nome = console.nextLine();

            System.out.println("Qual seu endereco");
            var endereco = console.nextLine();

            System.out.println("Consulta Cadastrada com sucesso");
        }
    }
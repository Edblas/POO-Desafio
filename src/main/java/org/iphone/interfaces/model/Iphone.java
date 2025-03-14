package org.iphone.interfaces.model;

import org.iphone.interfaces.AparelhoTelefonico;
import org.iphone.interfaces.NavegadorInternet;
import org.iphone.interfaces.ReprodutorMusical;

// A classe Iphone IMPLEMENTA as interfaces
public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    // Métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: "+ musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " +numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz... ");
    }

    // Métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Página atualizada");
    }
}

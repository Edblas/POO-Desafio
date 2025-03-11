package org.iphone;

import org.iphone.interfaces.model.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Imagine- John Lennon");

        meuIphone.ligar("11999999999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
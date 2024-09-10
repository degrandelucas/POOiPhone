package Smartphone;

import Internet.Navegador;
import Ligacoes.AparelhoTelefonico;
import Musica.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, Navegador{
    public static void main(String[] args) throws Exception {
        System.out.println("Apresentaçoes funções aparelho iPhone");

        iPhone iPhone1 = new iPhone();

        //Teste métodos da interface ReprodutorMusical
        iPhone1.tocar();
        iPhone1.pausar();
        iPhone1.voltarMusica();
        iPhone1.avancarMusica();

        //Teste métodos da interface AparelhoTelefonico
        iPhone1.digitarNumero(1234567890);
        iPhone1.ligar();

        //Teste métodos da interface Navegador
        iPhone1.entrarNavegador();
        iPhone1.acessarURL("lucasdegrande.com");

    }
    
    // Implementação dos métodos da interface ReprodutorMusical
    public void tocar(){
        System.out.println("Tocando música...");
    }
    public void pausar(){
        System.out.println("Pausar música...");
    }
    public void voltarMusica(){
        System.out.println("Faixa anterior...");
    }
    public void avancarMusica(){
        System.out.println("Faixa posterior...");
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    public void digitarNumero(double contatoAgendaCelular){
        System.out.println("Digitando o número do contato: " + contatoAgendaCelular);
    }
    public void ligar(){
        System.out.println("ligando...");

    }

    // Implementação dos métodos da interface Navegador
    public void entrarNavegador(){
        System.out.println("Abrindo navegador...");

    }
    public void acessarURL(String url){
        System.out.println("Acessando url: " + url);

    }
    
}

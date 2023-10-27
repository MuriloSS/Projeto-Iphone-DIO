public class Main {

  public static void main(String[] args) {

  var iphone = new Iphone("Iphone1");

  //tentando usar método abrir site com o telefone desligado
    iphone.abrirSite("www.dio.me/");

    //Ligando telefone
    iphone.ligar();
    //Abrindo site
    iphone.abrirSite("www.dio.me");
    iphone.fecharSite();

    iphone.enviarMensagem();

    iphone.tocar();

    //desligando iphone
    iphone.desligar();

    //tentando usar método abrir site com o telefone desligado
    iphone.fazerChamada();
  }
}
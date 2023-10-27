public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
  private String modelo;
  private int capacidade;

  private boolean statusIphone;

  public Iphone(String modelo) {
    this.modelo = modelo;
    this.capacidade = 100;
    this.statusIphone = false;
  }


  public void ligar(){
      this.statusIphone = true;
    System.out.println("Ligado........\n");
  }
  public void desligar(){ this.statusIphone = false;
    System.out.println("Desligado........\n"); }

  @Override
  public void fazerChamada() {
    if(this.statusIphone){
      System.out.println("Fazendo chamada.....");
    }else{
      System.out.println("Telefone Desligado\n");
    }
  }

  @Override
  public void receberChamada() {
    if(this.statusIphone){
      System.out.println("Recebendo chamada.....");
    }else{
      System.out.println("Telefone Desligado\n");
    }
  }

  @Override
  public void enviarMensagem() {
    if(this.statusIphone){
      System.out.println("Enviando mensagem.....");
    }else{
      System.out.println("Telefone Desligado\n");
    }
  }

  @Override
  public void receberMensagem() {
    if(this.statusIphone){
      System.out.println("Mensagem Recebida");
    }else{
      System.out.println("Telefone Desligado\n");
    }
  }

  @Override
  public void abrirSite(String url) {
    if(this.statusIphone){
      System.out.println("Abrindo Site -> "+url);
    }else{
      System.out.println("Telefone Desligado\n");
    }
  }

  @Override
  public void fecharSite() {
    if(this.statusIphone){
      System.out.println("Fechando Site.....");
    }else{
      System.out.println("Telefone Desligado\n");
    }
  }

  @Override
  public void navegar() {
    if(this.statusIphone){
      System.out.println("Navegando na Internet.....");
    }else{
      System.out.println("Telefone Desligado\n");
    }
  }

  @Override
  public void tocar() {
    if(this.statusIphone){
      System.out.println("Tocando Música.....");
    }else{
      System.out.println("Telefone Desligado\n");
    }
  }

  @Override
  public void pausar() {
    if(this.statusIphone){
      System.out.println("Pausando a Música.....");
    }else{
      System.out.println("Telefone Desligado\n");
    }
  }

  @Override
  public void avancar() {
    if(this.statusIphone){
      System.out.println("Avançando a Música.....");
    }else{
      System.out.println("Telefone Desligado\n");
    }
  }

  @Override
  public void retroceder() {
    if(this.statusIphone){
      System.out.println("Retrocedendo a Música.....");
    }else{
      System.out.println("Telefone Desligado\n");
    }
  }
}

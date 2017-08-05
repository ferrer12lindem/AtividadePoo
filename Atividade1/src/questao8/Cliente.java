package questao8;

public class Cliente extends Pessoa{
	 
	private int codigo;
	private String nome;
	
    public Cliente(){
    	this.codigo = 0;
    	this.nome = "";
    }
    
    public Cliente(String nome, int codigo){
    	this.nome = nome;
    	this.codigo = codigo;
    }
    
    public void imprimeDados(){
    	Cliente p = new Cliente();
    	System.out.println("Nome: "+nome+" Código: "+codigo);
    }
}

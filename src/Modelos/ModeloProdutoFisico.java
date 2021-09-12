package Modelos;

public class ModeloProdutoFisico implements InterfaceModeloProduto{  
    private String titulo;
    private boolean aOrdemFoiCompletada;

    public ModeloProdutoFisico(String titulo){
        setTitulo(titulo);
    }

    //#region Getters e Setters


    public String getTitulo(){
       return this.titulo; 
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public boolean getaOrdemFoiCompletada(){
        return this.aOrdemFoiCompletada;
    }
    //#endregion
  
    public void EnviarProduto(ModeloCliente cliente){
        if(aOrdemFoiCompletada == false){
            System.out.println("Simulando o envio!  "             +
                               "Item: " + this.titulo             +" "+
                               "Para: " + cliente.getNome()       +" "+
                               "Em: "   + cliente.getCidade());
            aOrdemFoiCompletada = true;
        }
    }
}

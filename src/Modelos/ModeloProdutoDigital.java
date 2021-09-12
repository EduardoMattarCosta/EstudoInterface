package Modelos;

public class ModeloProdutoDigital implements InterfaceModeloProduto {
    
    private String titulo;
    private boolean aOrdemFoiCompletada = false;
    private int totalDeDownloadsRestantes = 5;

    public ModeloProdutoDigital(String titulo){
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
        if(aOrdemFoiCompletada && totalDeDownloadsRestantes < 1){
            System.out.println("Simulando o envio do E-mail!  "       +
                               "Item: " + this.titulo             +" "+
                               "Para: " + cliente.getEmail());
            aOrdemFoiCompletada = true;
            totalDeDownloadsRestantes--;

            if(totalDeDownloadsRestantes == 0){
                aOrdemFoiCompletada = true;
                totalDeDownloadsRestantes = 0;
            }
        }
    }
}
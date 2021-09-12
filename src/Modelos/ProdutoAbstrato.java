package Modelos;

public abstract class ProdutoAbstrato{    
    protected String titulo = "";   
    protected boolean aOrdemFoiCompletada = false;

    public String getTitulo(){
        return this.titulo; 
     }
     public void setTitulo(String titulo){
         this.titulo = titulo;
     }
 
     public boolean getaOrdemFoiCompletada(){
         return this.aOrdemFoiCompletada;
     }

    public ProdutoAbstrato(String titulo) {
        this.titulo = titulo;
    }
    
}
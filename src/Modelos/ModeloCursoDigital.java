package Modelos;

public class ModeloCursoDigital extends ProdutoAbstrato implements InterfaceModeloProduto{
    private int totalDeDownloadsRestantes = 5;

    public ModeloCursoDigital(String titulo) {super(titulo);} 

    public void EnviarProduto(ModeloCliente cliente){
        if(aOrdemFoiCompletada == false && totalDeDownloadsRestantes > 0){
            System.out.println("Simulando o envio do E-mail!  "       +
                               "Item: " + this.titulo             +" "+
                               "Para: " + cliente.getEmail());
            totalDeDownloadsRestantes--;

            if(totalDeDownloadsRestantes == 0){
                aOrdemFoiCompletada = true;
                totalDeDownloadsRestantes = 0;
            }
        }
    }    
}
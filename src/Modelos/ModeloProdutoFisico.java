package Modelos;

public class ModeloProdutoFisico extends ProdutoAbstrato implements InterfaceModeloProduto{  
  
    public ModeloProdutoFisico(String titulo) {super(titulo);} 
  
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

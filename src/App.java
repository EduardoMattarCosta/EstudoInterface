import java.util.ArrayList;
import java.util.List;

import Modelos.InterfaceModeloProduto;
import Modelos.ModeloCliente;
import Modelos.ModeloProdutoDigital;
import Modelos.ModeloProdutoFisico;

public class App {
    public static void main(String[] args) {
        List<InterfaceModeloProduto> carrinho = PopularListaDeProdutos();
        ModeloCliente cliente = getCliente();

        for (InterfaceModeloProduto prod : carrinho) {
            prod.EnviarProduto(cliente);
        }
    }

    private static ModeloCliente getCliente(){        
        return new ModeloCliente("Eduardo","Mattar","Curitiba","eduardo@mattar.com");   
    }
    
    private static List<InterfaceModeloProduto> PopularListaDeProdutos(){
        List<InterfaceModeloProduto> listaRetorno = new ArrayList<InterfaceModeloProduto>();
       
        listaRetorno.add(new ModeloProdutoFisico("Trilogia Matrix - CVD"));
        listaRetorno.add(new ModeloProdutoFisico("Violão"));
        listaRetorno.add(new ModeloProdutoFisico("Mouse"));
        listaRetorno.add(new ModeloProdutoFisico("Teclado"));
        listaRetorno.add(new ModeloProdutoDigital("Trilogia Matrix - Digital"));

        return listaRetorno;
    }
}

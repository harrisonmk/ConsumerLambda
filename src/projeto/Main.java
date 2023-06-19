package projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import modelo.Produto;
import util.PrecoUpdate;

public class Main {

    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Tv", 900.00));
        lista.add(new Produto("Mouse", 50.00));
        lista.add(new Produto("Tablet", 350.50));
        lista.add(new Produto("HD Case", 80.90));
        
        double fator = 1.1;
        
       /* Consumer<Produto> consu = p -> {
           p.setPreco(p.getPreco() * fator);
        }; */
        
        //Consumer<Produto> consu = p -> p.setPreco(p.getPreco() * fator);
        
       // lista.forEach(new PrecoUpdate());
       //lista.forEach(Produto::staticPrecoProduto);
       //lista.forEach(Produto::naoStaticProdutoUpdate);
       lista.forEach(p -> p.setPreco(p.getPreco() * fator));
        
        lista.forEach(System.out::println);

    }

}

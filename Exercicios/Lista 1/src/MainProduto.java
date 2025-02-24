import exe3.Produto;
public class MainProduto {
    public static void main(String[] args) {
        Produto obj1 = new Produto(1, "Produto 1", 10, 100);
        obj1.comprar(5);
        obj1.vender(15);
        obj1.subir(10);
        obj1.descer(200);
        obj1.exibeDetalhes();

        Produto obj2 = new Produto();
        obj2.exibeDetalhes();

    }
}

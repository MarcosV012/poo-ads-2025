import exe4.Rio;

public class MainRio {
    public static void main(String[] args) {
        Rio obj1 = new Rio("Rio de Janeiro", 40, false);
        obj1.chover(10);
        obj1.ensolarar(20);
        obj1.limpar(); 
        obj1.sujar();
        obj1.exibeDetalhes();

        Rio obj2 = new Rio();
        obj2.exibeDetalhes();
    }
}

package questao3;

public class Main {
    public static void main(String[] args) {
        iBebida pedido1 = new Espresso();
        pedido1 = new LeiteDecorator(pedido1);
        imprimir(1, pedido1);

        iBebida pedido2 = new Cha();
        pedido2 = new CaldaDecorator(pedido2);
        pedido2 = new ChantillyDecorator(pedido2);
        imprimir(2, pedido2);

        iBebida pedido3 = new Espresso();
        pedido3 = new ChantillyDecorator(pedido3);
        pedido3 = new ChantillyDecorator(pedido3);
        pedido3 = new LeiteDecorator(pedido3);
        imprimir(3, pedido3);

        iBebida pedido4 = new Cha();
        imprimir(4, pedido4);
    }

    private static void imprimir(int numero, iBebida pedido) {
        System.out.println("Pedido " + numero + ": " + pedido.Descricao());
        System.out.printf("Custo   : R$ %.2f%n%n", pedido.Preco());
    }
}

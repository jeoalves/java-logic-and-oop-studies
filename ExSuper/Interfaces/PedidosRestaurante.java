package Interfaces;

public interface PedidosRestaurante {
    void adicionarItem(String item, double preco);
    void calcularTotal();
} 

class Pedido implements PedidosRestaurante{
    String[] item;
    double[] preco;
    int contador = 0;
    double valorTotal = 0;

    public Pedido(){
        item = new String [10];
        preco = new double[10];

    }

    public void adicionarItem(String item, double preco){
        this.item[contador] = item;
        this.preco[contador] = preco;
        contador++;
    };

    public void calcularTotal(){
        for(int i = 0; i <= contador; i++){
            valorTotal += preco[i];
        }
         
    };

    public static void main(String [] args){
        Pedido pedido1 = new Pedido();
        pedido1.adicionarItem("Batata frita ", 25.00);
        pedido1.adicionarItem("Refrigerante ", 10.00);
        pedido1.adicionarItem("Hamburguer ", 50.00);
        pedido1.calcularTotal();

        System.out.println("Valor total do pedido: " + pedido1.valorTotal);
    }
}

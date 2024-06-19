package edu.tiago.designpatterns.factorymethod;

public class TesteProduto {

    public static void main(String[] args) {
        Produto produtoFisico = new ProdutoFisico();
        produtoFisico.setPossuiDimensoesFisicas(true);

        Produto produtoDigital = new ProdutoDigital();
        produtoDigital.setPossuiDimensoesFisicas(false);
    }
}

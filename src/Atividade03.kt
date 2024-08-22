// =================== PRINTS ==========================================================================================

import java.text.DecimalFormat



// =================== CÓDIGOS ==========================================================================================

fun main(args: Array<String>) {

    var produto: String
    var precoProduto: Double
    var qtddProdutosComp: Int
    var taxaProdutos: Double
    var taxaLucro: Double

    var saudacao: String

    produto = "Camiseta Furia"
    precoProduto = 350.0
    qtddProdutosComp = 1
    taxaProdutos = 1.5
    taxaLucro = 15.0

    var valSemImposto = calcValSemImposto(precoProduto, qtddProdutosComp)

    var valComImposto = calcValImposto(valSemImposto, taxaProdutos)

    var valTotal = calcValTotal(valSemImposto, taxaLucro, valComImposto)

    saudacao = ("Produto: $produto, seu valor é de R$$valComImposto, seu valor de venda sugerido é de R$valTotal")


    // Formatação de valores
    val dec = DecimalFormat("#.00")
    val valTotalFormatado = dec.format(valTotal)


// =================== CLASSES ==========================================================================================



// =================== PRINTS ==========================================================================================


    println("Produto: $produto")
    println("Preco do Produto: $precoProduto")
    println("Quantidade de produtos comprados: $qtddProdutosComp")
    println("Taxa dos produtos: $taxaProdutos")
    println("Taxa de lucro: $taxaLucro")
    println("Valor total: $valTotal")
    println("Valor sem imposto:  $valSemImposto")
    println("Valor com imposto R$ ${valComImposto}")
    println("Valor desejado do produto R$ ${valTotalFormatado}")
    println()
    println(saudacao)
}


// =================== FUNÇÕES =========================================================================================


fun calcValSemImposto(var1: Double, var2: Int): Double {
    return (var1 * var2)
}

fun calcValImposto(var1: Double, var2: Double): Double {

    return (var1 * var2)
}

fun calValComImposto(var1: Double, var2: Double): Double {
    return (var1 + var2)
}


fun calcValTotal(var1: Double, var2: Double, var3: Double): Double {
    return ((var1 * (var2 / 100)) + var3)
}
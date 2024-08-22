// =================== IMPORTS ==========================================================================================

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
    taxaProdutos = 0.15
    taxaLucro = 0.15


    var valSemImposto = calcValSemImposto(precoProduto, qtddProdutosComp)

    var valImposto = calcValImposto(valSemImposto, taxaProdutos)

    var valComImposto = calValComImposto(valSemImposto, valImposto)

    var precoVendaNecessario = calcPrecoVenda(valComImposto, taxaLucro)

    // Formatação de valores
    val dec = DecimalFormat("#.00")
    val valComImpostoFormatado = dec.format(valComImposto)
    val valTotalFormatado = dec.format(precoVendaNecessario)

    saudacao = ("Produto: $produto, seu valor é de R$$valComImpostoFormatado, seu valor de venda sugerido é de R$$valTotalFormatado")

// =================== CLASSES ==========================================================================================



// =================== PRINTS ==========================================================================================


    println("Produto: $produto")
    println("Preco do Produto: $precoProduto")
    println("Quantidade de produtos comprados: $qtddProdutosComp")
    println("Taxa dos produtos: $taxaProdutos")
    println("Taxa de lucro: $taxaLucro")
    println("Valor total: $precoVendaNecessario")
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

fun calcPrecoVenda(var1: Double, var2: Double): Double {
    return (var1 * (1 + var2))
}
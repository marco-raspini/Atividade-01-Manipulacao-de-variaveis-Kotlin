
fun main(args: Array<String>) {

    var nome1: String
    var idade1: Int
    var salario1: Double
    var mesesTrabalhados: Int
    var produtosComprados: Int
    var porcentagemDesconto: Int

    var saudacao: String


    nome1 = "Marco Antonio"
    idade1 = 22
    salario1 = 2200.0
    mesesTrabalhados = 12
    produtosComprados = 2

    porcentagemDesconto = 2


    var salBruto = calcSalBruto(salario1, mesesTrabalhados)

    var salLiquido = calcSalLiquido(salBruto, porcentagemDesconto)

    saudacao = ("Saudações $nome1 seu salário liquido anual é R$ $salLiquido")



// =================== PRINTS ==========================================================================================


    println("Nome: $nome1")
    println("Idade: $idade1")
    println("Salario total: $salario1")
    println("Meses trabalhados: $mesesTrabalhados")
    println("Produtos comprados: $produtosComprados")
    println("Porcentagem de desconto: $porcentagemDesconto")
    println("Salario anual bruto: R$ ${salBruto}")
    println("Salario anual liquido: R$ ${salLiquido}")
    println()
    println(saudacao)
}


// =================== FUNÇÕES =========================================================================================

fun calcSalBruto(var1: Double, var2: Int): Double {
    return (var1 * var2)
}

fun calcSalLiquido(var1: Double, var2: Int): Double {
    return (var1 / var2)
}
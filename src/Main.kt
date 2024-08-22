var version = 56565

fun main(args: Array<String>){
    println("Hello World")

    var idade = 30

    idade = 51

    var nome: String = "Marco"
    var valor: Double = 5.5
    var peso: Int = 60
    var ePessoa: Boolean = true

    println(idade)
    println(nome)
    println(valor)
    println(peso)
    println(ePessoa)
    println()

    println("Minha idade é $idade e meu peso é $peso")

    val pi = 3.14
    val percentualIcms = 19
    val nomeEmpresa = "Unipar"

    println("Version ${version}")

    mudarVersion(50) //versionChange

    var total = somarValores(10, 20)
        println("Total: $total")
    }


fun mudarVersion(versionchange: Int) {
    version = versionchange
}



fun somarValores(valorA: Int, valorB: Int): Int {

    return valorA + valorB

}
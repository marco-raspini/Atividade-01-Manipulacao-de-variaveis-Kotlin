fun main(args: Array<String>) {

    var idade1: Int
    var altura1: Double
    var nome1: String
    var estudante1: Boolean

    var idade2: Int
    var altura2: Double
    var nome2: String
    var estudante2: Boolean


    idade1 = 22
    altura1 = 1.72
    nome1 = "Marco Antonio"
    estudante1 = true

    idade2 = 19
    altura2 = 1.84
    nome2 = "Mawgyn Tyrell"
    estudante2 = false


    var saudacao = ("Olá $nome1 você atualemente tem $idade1 anos e sua altura é de $altura1.")


// =================== FUNÇÕES =========================================================================================


    fun somaIdades(var1: Int, var2: Int): Int {
        return var1 + var2
    }

    fun dobraAltura(var1: Double): Double {
        return var1 * 2
    }


// =================== PRINTS ==========================================================================================

    println("Nome: $nome1")
    println("Altura: $altura1")
    println("Idade: $idade1")
    println("É estudante: $estudante1")
    println("Soma das idades: ${somaIdades(idade1, idade2)}")
    println("Altura dobrada: ${dobraAltura(altura1)}")
    println(saudacao)

}
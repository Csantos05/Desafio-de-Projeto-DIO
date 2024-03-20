enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario

   
val listaInscritos: MutableList<String> = mutableListOf("Paulo", "Carlos", "José", "Camila")        
val nomes: List<String> = listaInscritos                              

fun addListaInscrito(novoInscrito: String) {                                 
    listaInscritos.add(novoInscrito)
    
}

fun getListaInscrito(): List<String> {                                  
    return nomes
}

fun main() {
                                        
    println("Total de Inscritos: ${getListaInscrito().size}")               
    getListaInscrito().forEach {                                    
        i -> println("Usuário = $i")
    }
                         
}

data class Matricula(var id: Int, var nome: String) 


fun main(){
    
    
val matricula = mutableListOf(
    Matricula(1, "Carlos"),
    Matricula(2, "Matheus"),
    
   
)

matricula.add(Matricula(4, "Davi"))

println(matricula)

}



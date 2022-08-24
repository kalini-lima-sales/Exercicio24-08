package Animal

abstract open class Animal(
    val nome: String,
    val idade: Int
    ) {

    abstract fun dormir()

    open fun emitirSom(){
        println("Emitindo som...")
    }

    open fun correr(){
        println("Correndo...")
    }

}
package Preguiça

import Animal.Animal

class Preguica(
    nome: String, idade: Int)
    : Animal(nome, idade) {

    override fun emitirSom() {
        super.emitirSom()
    }

    fun subirArvore(){
        println("Subindo em árvore...")
    }

    fun nadar(){
        println("Nadando...")
    }

    override fun dormir() {
        println("Dormindo...")
    }

    override fun toString(): String {
        return "Nome: $nome. Idade: $idade."
    }
}
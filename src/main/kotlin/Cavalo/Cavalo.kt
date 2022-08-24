package Cavalo

import Animal.Animal

class Cavalo(
    nome: String, idade: Int)
    : Animal(nome, idade) {

    override fun emitirSom() {
        println("Relinchando...")
    }

    override fun correr() {
        super.correr()
    }

    override fun dormir() {
        println("Dormindo...")
    }

    override fun toString(): String {
        return "Nome: $nome. Idade: $idade."
    }
}
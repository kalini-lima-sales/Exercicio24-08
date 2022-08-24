package Cachorro

import Animal.Animal

class Cachorro(
    nome: String, idade: Int)
    : Animal(nome, idade) {

    override fun emitirSom() {
        println("Latindo...")
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
import Cachorro.Cachorro
import Cavalo.Cavalo
import Preguiça.Preguica

fun main() {

    val cachorro = Cachorro("Krypto, o Supercão", 3)
    println(cachorro)
    cachorro.correr()
    cachorro.emitirSom()
    cachorro.dormir()

    val cavalo = Cavalo("Spirit", 5)
    println(cavalo)
    cavalo.correr()
    cavalo.emitirSom()
    cavalo.dormir()

    val preguica = Preguica("Afonso", 1)
    println(preguica)
    preguica.nadar()
    preguica.subirArvore()
    preguica.emitirSom()
    preguica.dormir()
}
package com.example.strategyexposicion
//QUE ES STRATEGY
/*El Strategy patrón de diseño define una familia de algoritmos y permite su uso
indistinto. Por algoritmo, se refiere a cualquier lógica, ya sea ordenar, buscar o
calcular algún valor a partir de datos.
Strategyprefiere la composición a la herencia. Las estrategias no heredan de ninguna clase específica,
solo implementan una interfaz común. Esto permite una fácil encapsulación de código y reemplazo de
algoritmos sin la sobrecarga de herencia.*/
interface Plataforma{
    fun play()
}
class Musica : Plataforma{
    override fun play() {
        println("lo que sea")
    }
}
class Video : Plataforma{
    override fun play() {
        println("Reproducir Video")
    }
}
class Reels : Plataforma{
    override fun play() {
        println("Reproducir Reels")
    }
}
class Reproductor{
    fun play(plataforma: Plataforma){
        plataforma.play()
    }
}
fun main(){
   /* val reprd=Reproductor()

    reprd.play(Musica())*/
    /*reprd.play(Video())
    reprd.play(Reels())*/
    println("Ingrese un reproductor: ")
    println("1: Musica")
    println("2: Video")
    println("3: Reels")
    var opc= readln().toInt()
    val reprd=Reproductor()
    when(opc){
        1->reprd.play(Musica())
        2->reprd.play(Video())
        3->reprd.play(Reels())
        else->{
            println("toestamal")
        }
    }
}
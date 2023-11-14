package com.example.strategyexposicion

class Music{
    fun play(){
        println("Reproducir musica")
    }
}
class Vide{
    fun play(){
        println("Reproducir Video")
    }
}
class Reel{
    fun play(){
        println("Reproducir Reel")
    }
}
class Reproducto(){
    fun play(plataforma: String){
        when(plataforma){
            "Musica"->Music().play()
            "Video"->Vide().play()
            "Reel"->Reel().play()
        }
    }
}
fun main(){
    val reprod =Reproducto()
    print("Ingrese plataforma: ")
    var plat= readln()
    reprod.play(plat)
}
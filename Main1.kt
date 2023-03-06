fun main(){
    println("Введите число функций")
    val numb = readLine()!!.toInt()
    while (numb<=0){
        println("Функций не  может быть меньше нуля")
    }
    suspend fun ma() = coroutineScope{
        launch{
            for(i in 0..5){
                delay(800L)
                println(numb)
            }
        }
        println("")
    }

}


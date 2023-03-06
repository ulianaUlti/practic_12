import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun f(){
    GlobalScope.launch {
        delay(900)
        println("Ваше число")
    }
    println("ерк")
    runBlocking { delay(1000) }
}
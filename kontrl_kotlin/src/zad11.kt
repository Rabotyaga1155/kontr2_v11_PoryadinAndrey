import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import javax.xml.bind.JAXBElement

fun main()
{
    try {
        var poezd = Poezdka_itog(8,"Челябинск",2,"16:05",4)
        poezd.input()
        println("Сколько раз хотите вывести функцию?")
        var count = readLine()!!.toInt()
        if (count>0)
        {
            count = count -1
            for (i in 0..count)
            {
                GlobalScope.launch {
                    delay(5000L)
                    println(poezd.eda())
                }
            }
            println(poezd.pricezast())
            runBlocking { delay(5000L) }

        }
        else{
            println("Число не может быть равно 0 или меньше")
        }
    }catch (e:Exception){
        println("Неверный ввод")
    }

}
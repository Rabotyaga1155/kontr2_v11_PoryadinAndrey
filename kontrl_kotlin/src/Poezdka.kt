import java.util.*

abstract class Poezdka(var number:Int,var  punkt:String,var days:Int,var Date:String,var timeofst:Int) :Interface{
    override fun input()
    {
        println("Номер поезда - $number")
        println("Пункт назначения - $punkt")
        println("Дни следования - $days")
        println("Время прибытия - $Date")
        println("Время стоянки(в минутах) - $timeofst")
    }


}
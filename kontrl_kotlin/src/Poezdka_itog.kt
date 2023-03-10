class Poezdka_itog( empnumber:Int,var emppunkt:String,var  empdays:Int,var empDate:String,var emptimeofst:Int):Poezdka(empnumber,emppunkt,empdays,empDate,emptimeofst) {

    fun pricezast()
    {
        try {
            var a = emptimeofst *100
            println("Стоимость за стоянку - $a")
        }catch (e:Exception)
        {
            println("Неверный ввод")
        }

    }
    /*
    fun toplivo()
    {
        try {
            var a = empdays *40
            println("На ваш маршрут уйдет $empdays килограмм угля")
        }catch (e:Exception){
            println("Неверный ввод")}
    }
    */


    fun eda()
    {
        try {
            println("Будете ли вы платить за полдник?(да или нет)")
            var a = readLine()!!.toString()
            if (a=="да")
            {
                var b = empdays*4
                println("За путь у вас будет $b приемов пищи")
            }
            if (a=="нет")
            {
                var b = empdays*3
                println("За путь у вас будет $b приемов пищи")
            }

        }catch (e:Exception)
        {
            println("Неверный ввод")
        }

    }




}
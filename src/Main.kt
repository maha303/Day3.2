fun main(){
    val con = mutableMapOf<String, String>()

    for(i in 0..2){
        var country = ""
        var capital = ""
        println("Enter country  :")
        country= readLine()!!

        println("Enter capital  :")
        capital= readLine()!!
        con[country]=capital

    }
    for (i in con){
        println("the capital of ${i.key} : is ${i.value}")
    }

}

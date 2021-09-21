fun main(){
    val con = mutableMapOf("" to "","" to "","" to "")

   var num=0
    while (num<3){
        println("Enter country  :")
        var country = readLine()!!.toString()
        println("Enter capital  :")
        var capital = readLine()!!.toString()
        num++
        con[country]=capital
    }
    for (i in con){
        println(i)
    }

}
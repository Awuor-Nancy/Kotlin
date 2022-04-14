import java.time.temporal.TemporalAmount

fun main() {
    //no 1
var a=CurrentAccount("KCB",20000,"2367862412")
 a.deposit(500.0)
a.withdraw(300.0)
a.details("Mercy","1123567KWR",800.0)

    // no.3



    //no. 4
    getIndex("Banana")

}
// no 1
class CurrentAccount(var accName:String,var accBal:Int,var accNo:String)
open class currentAccount(var account:Double,var name:String,var balance:Int,var withdraw:Int){
fun deposit(amount: Double) {
        account+=amount
        account++
        println(account)

    }
    fun withdraw(amount:Double) {
        account -= balance
        println(amount)
}
class currentAccount(var accName:String,var accBal:Int,var accNo:String,var withdrawals:Int){
}

fun addCash(cash:Int) {


}


// NO.3
data class product(var name:String,var weight:Double,var price:String,var category:String)
fun product(product: product) {
    var groceries= mutableListOf<product>()
    var hygiene= mutableListOf<product>()
    var other= mutableListOf<product>()
    when(product.category) {
        "groceries" -> groceries.add(product)
        "hygiene" -> hygiene.add(product)
        else -> other.add(product)
    }
    println(groceries)
    println(hygiene)
    println(other)
}
// no 4
fun getIndex(word:String):String{
    var word=""
    for(Char in word) {
        if (word.indexOf(Char) % 2==0)
            word+=Char
    }
    return word
}

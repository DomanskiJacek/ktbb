
import java.lang.System.console

// show how hof works


fun StartB(){
    var total = 0
    var count = 10
    while (count <= 10) {
        total += count
        count += 1
    }
    println (total)
//    console.log(total) // this is java
}

// this function is called in Main.kt
fun Test_hofA(){
    println ("Test_hofA start, then function StartA")
    println("todo: double round, string split and similiar (or rather more useful string functions)")
    StartA()
}

fun StartA() {
    val funFF = makeFirstFun(3)
    println("var funFF = makeFirstFun(3); funFF(2): ${funFF(2)}")
    // another way of defining the function
    val funMul2 = { par1: Int-> par1*2}
    val funDiscount = { par1:Double ->  par1*0.95}
    val currentPrices = arrayOf(101.5, 115.0, 198.9)

    applyDis(currentPrices, funDiscount)


}


fun makeFirstFun (baseNum : Int): (Int)->Int = {num2 -> baseNum*100 + num2*10 }

fun applyDis (curPr : Array<Double>, funNewPrice: (Double) -> Double){
    curPr.forEach { println("Current $it, new price ${funNewPrice(it)}") }
}
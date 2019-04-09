
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
    StartA()
}

fun StartA() {
    val funFF = makeFirstFun(3)
    println("var funFF = makeFirstFun(3); funFF(2): ${funFF(2)}")
}


fun makeFirstFun (baseNum : Int): (Int)->Int = {num2 -> baseNum*100 + num2*10 }
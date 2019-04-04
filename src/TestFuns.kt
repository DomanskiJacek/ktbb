
fun TestOutLineCont(par1:String, par2:String):String {
    return "$par1^^^$par2"
}

fun MoreNums (par:Int) : Pair<Int,Int> {
    return Pair(par+1, par+2)
}

fun sumNums (inputRange:IntRange) : Int {
    var sum : Int = 0
    inputRange.forEach { atom -> sum+=atom }
    return sum
}

fun sumNums (vararg inPars:Int) : Int {
    var sum : Int = 0
    inPars.forEach { atom -> sum+=atom }
    return sum
}

tailrec fun factorial(inPar: Int) : Int{
    when(inPar){
        null,0 -> return 1
        else  -> return  inPar * factorial(inPar-1)
    }
//    if (inPar<=0){
//        return 1
//    }
//    else {
//        return factorial(inPar-1)
//    }
}

fun TestFuns(){
    println ("TestFuns start")
    fun TestOneLineCont(par1:String, par2:String) = "$par1-and-$par2"

    var par1 = "aaa"
    var par2 = "bbb"
    println("par1:$par1 ; par2:$par2 ; fun: ${TestOneLineCont(par1,par2)}")
    println("TestOutLineCont: ${TestOutLineCont(par2 = par1, par1 = par2)}")

    fun Add0 (par1:Int) : Unit  { println("Add0 : $par1")}
    fun Add1 (par1:Int) : Unit = println("Add1 : ${par1+1}")

    var (num1, num2) = MoreNums(1)
    println("1 and MoreNums results: $num1 and $num2")

    fun MooreNums(iNum : Int) : Pair<Int,Int> = Pair(iNum+3,iNum+4)
    var (num11,num12) = MooreNums(1)
    println("1 and MooreNums one line fun, results: $num11 and $num12")
    //(num11,num12) = MooreNums(9)
    println("1 and MooreNums one line fun, results: $num11 and $num12")

    var res = sumNums (1..10)
    println("sum, inputRange, 1..10    res: $res")

    res = sumNums (1,2,3,4,5,6,7,8,9,10,11,12,13)
    println("sum, vararg inParis, 1 to 13    res: $res")

    val funSumB = {num1:Double, num2:Double  -> num1+num2}
    println("funSumB 1.1 2.2 -> ${funSumB(1.1, 2.2)}")

    // val tailrec funSumRecursion = {inPar:Int -> if (inPar<0) { 1 } else {funSumRecursion(inPar-1)}}

    println("factorial 5 : ${factorial(5)}")



}
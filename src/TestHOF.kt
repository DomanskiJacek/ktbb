

fun Add2(num: Int) : Int{
    return num + 2
}

fun RepeatAction(num: Int, funA: Int){
    println("RepeatAction : loops $num times")
    for (ii in 0 .. num) {
        print ("$ii : ${funA(ii)};")
    }
}

fun TestHOF () {
    println("TestHOF Higher-Order Functions")
    var funToPass = Add2(1)
    RepeatAction(3, funToPass)
}
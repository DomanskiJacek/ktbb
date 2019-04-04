// it is 34min of https://www.youtube.com/watch?v=H_oGi8uuDpA
fun TestConditionals(args: Array<String>){
    println("TestConditionals with args")

    var iTest:Int? = 101
    try {
        println("try, args[0]=${args[0]} ")
        iTest = args[0].toIntOrNull()
    } catch(ie : Exception){
        println("Error, args[0]=${args[0]} ")
        iTest= 115
    }

    if (iTest == null) iTest=1001
    // if iTest is Int? and iTest
    // Error:(16, 14) Kotlin: Operator call corresponds to a dot-qualified call 'iTest.compareTo(100)' which is not allowed on a nullable receiver 'iTest'.

    if (iTest>100){
        print("iTest=$iTest is > than 100")
    } else if (iTest>200){
        print("iTest=$iTest is > than 200")
    } else{
        print("iTest=$iTest is small")
    }

    println ("\n========when=========")
    when(iTest){
        null,0,1,2,3 ->  println("iTest=$iTest is null,0,1,2,3 ")
        else -> println("iTest=$iTest in part else of when ")
    }



}
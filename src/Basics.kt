
fun Basics() {
    println ("start file")
    val info = "this is unchangeable, immutable variable"
    var infovar = "this is changeable, mutable variable"
    var testInt : Int = 10

    // info += "aaa"     val cannot be reassigned
    infovar += "; appended"

    println ("val info: $info")      // string interpolation
    println ("var infovar: $infovar")
    println ("testInt : $testInt")
    testInt = Int.MAX_VALUE
    println ("testInt : $testInt")
    // other types to Long Short Byte Double Float Boolean

    var test1 : Double = 111111111111111111.0    //
    var test2 : Double = 111111111111111111.0
    var test3 : Double = test1+test2
    println("test1: two Doubles and a sum : $test1 + $test2 = $test3 ");   // double: precision of 15 digits
    // ij switch lines shift+alt+down(up)

    if (test1 is Double ){
        print ("test1 is Double, the condition fulfilled")
    }
    test1=123.4; test2=0.5
    println ("\nuse string interpolation: $test1 + $test2 = ${test1+test2}")

    for(ia:Int in 65..77){              // can declare int ii in for statement ?
        print("$ia : ${ia.toChar()} | ")
    }
    /////////////////// string section
    println()
    var sTest1 : String = "atest string"
    var sTest2 : String = "btest string2"
    println ("sTest1 : $sTest1, length: ${sTest1.length}, equals sTest2 $sTest2 ${sTest1.equals(sTest2)}, compare: ${sTest1.compareTo(sTest2)} ")

    println("get(1), [1] : ${sTest1.get(1)}, ${sTest1[1]}")
    println()
    for(ia:Int in 0..(sTest1.length-1)){
        print("$ia:${sTest1[ia]} ")
    }
    println()

    // some more to test: subSequence, contains,
    println ("the string: $sTest1 and subSequence(startindex=1,endindex=5) ${sTest1.subSequence(1,5)}")
    println("check if contains stri : ${sTest1.contains("stri")}")
    println("where est starts: ${sTest1.indexOf("est",0, true)}")

}
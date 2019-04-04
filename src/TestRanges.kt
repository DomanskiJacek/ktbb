
fun TestRanges(){
    val rOne = 1..7

    println("var rOne = 1..7")
    for (i:Int in rOne) {
        print("i:$i;")
    }
    println("\nrOne.forEach, rOne ")
    rOne.forEach { print("elem: $it; ") }; println()    // it-> removed because redundant

    print("rOne.reversed()     :  ")
    rOne.reversed().forEach{ it -> print("r:$it; ")}; print("\n")


    var alpha = ('A'..'M').step(2)                // when "A".."F" then compilation error

    for( any in alpha){
        print("any:$any; ")
    }
    println("above A..M step 2")
    val chartocheck = 'C'
    println("check if $chartocheck is in alpha: ${chartocheck in alpha}")

    print("rTenDown.downTo .step: ")
    val rTenDown = 10.downTo(1).step(2)
    rTenDown.forEach{ it -> print("$it; ")}
    print("\n")

}
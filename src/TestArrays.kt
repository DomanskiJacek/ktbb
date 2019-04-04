fun TestArrays(){
    var mArray = arrayOf(1,2,3,111,"ala ma kota", "test", 3.14)
    // show whats in mArray:
    println ("number of elements: ${mArray.size }")
    print ("elements in mArray: ")
    for(ele in mArray)  print("$ele, ")                 // for: no braces shape

    println("\niterate the Array using forEach: ")
    mArray.forEach {
        print("it: $it, ")
    }
    println ("try if forEach can contain full Unit, aa.taken.from.it")
    (1..5).forEach{
        var aa = it
        print(": $aa;")
    }
    println("copyOfRange:")
    for (atom in mArray.copyOfRange(4, 6)) {
        print("any:$atom;")
    }

    println("Array, constructed while initialization")
    var sArray = Array(5, {elem->"elem$elem"} )
    sArray.forEach { it -> print("e:$it;") }

    var iArray : Array<Int> = arrayOf(1,2,3)


}

fun TestLoop(){
    println ("TestLoop start")
    var iw:Int=0

    while(iw<=7){
        iw++
        if (iw==5) continue
        print("iw:$iw;")
    }

    var rnTest = (1..20).step(3)
    for (ii in rnTest.withIndex()){
        print("ii.index:${ii.index} ii.value:${ii.value} ; ")

    }

    println()
    var arrTest = arrayOf("first", "second", "third")
    for (ii in arrTest.indices){
        print("ii:$ii and value: ${arrTest[ii]}; ")
    }
    println ("\nwork with arrTest.withIndex")
    for((index,value) in arrTest.withIndex() ){
        print("index:$index, value:$value; ")
    }
}
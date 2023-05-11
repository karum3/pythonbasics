class Delusion{
    //datamember
    private var nambari:Int=6
    //number function
    fun calc():Int{
        return nambari * nambari
    }
}

fun main(args: Array<String>) {
    //This is an object
    val myobject=Delusion()
    println(myobject.calc())
}
class Students(val name:String, var gender:String, val age:Int){

}

fun main(args: Array<String>) {
    val myobject=Students(name = "Jeremy", gender = "boy", age = 18)
    val obj2=Students(name = "Jasmine", gender = "girl", age = 18)
    println("The student's name is ${obj2.name} and they are a ${obj2.age} year-old ${obj2.gender}.")
    println("The student's name is ${myobject.name} and he is a ${myobject.age} year-old ${myobject.gender}. ")
}
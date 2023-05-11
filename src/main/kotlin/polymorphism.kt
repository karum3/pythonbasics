open class Shapes{
    open fun draw(){
        println("Drawing shapes")
    }

}
class Circle:Shapes(){
    override fun draw() {
        println("Drawing a circle")
    }

}
class Square:Shapes(){
    override fun draw() {
        println("Drawing a square")
    }

}
class Triangle:Shapes(){
    override fun draw() {
        println("Drawing a triangle")
    }

}

fun main(args: Array<String>) {
    val shapes:Array<Shapes> = arrayOf(Circle(), Square(), Triangle())
    for (shape in shapes){
        shape.draw()
    }
}
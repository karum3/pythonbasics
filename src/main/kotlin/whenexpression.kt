fun main(args: Array<String>) {
    var mycharacter = 'U'

    when(mycharacter){
        'A'-> println("A is a vowel.")
        'E'-> println("E is a vowel.")
        'I'-> println("I is a vowel.")
        'O'-> println("O is a vowel.")
        'U'-> println("U is a vowel.")

        else -> println(" $mycharacter is a consonant.")

    }
}
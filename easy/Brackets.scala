package easy

import scala.collection.mutable.Stack

object Brackets {
  def brackets(): Unit ={
    val expression:String = "{([]){}()}"
    var stack = Stack[Char]()

    for (letter <- expression) {
      if (letter == '{' || letter == '(' || letter == '[') {
        stack.push(letter)
      }
      else if (letter == '}' || letter == ')' || letter == ']') {
        if(stack.isEmpty){
          println(false)
          return
        }
        val saved = stack.pop()

        if((letter == '}' && saved != '{') || (letter == ')' && saved != '(') || (letter == ']' && saved != '[') ) {
          println(false)
          return
        }
      }
    }
    println(true)
  }
}

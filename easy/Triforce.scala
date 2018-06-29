package easy

//May the triforce be with you!
object Triforce {
  def run(n:Int): Unit ={
    var rightCounter:Int = 2 * n
    var leftCounter:Int = rightCounter - 1

    //vypis horneho trojuholnika
    for(row <- 0 until n) {
      for (column <- 0 until rightCounter) {
        if (row == 0 && column == 0) print(".")
        else if (leftCounter > column) print(" ")
        else print("*")
      }
      println()
      leftCounter -= 1
      rightCounter += 1
    }

    var offset = 0

    for(row <- 0 until n){
      offset += 2
      for(column <- 0 until rightCounter){
        if(column < leftCounter || (column >= leftCounter + offset - 1 && column <= rightCounter - offset)) print(" ")
        else print("*")
      }
      println()
      leftCounter -= 1
      rightCounter += 1
    }
  }
}

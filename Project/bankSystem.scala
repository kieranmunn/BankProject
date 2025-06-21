object bankSystem  {
  var ballance: Int = 0

  def main(args: Array[String]): Unit = {
    println("Hello, Scala!")
    println(deposit(50))
    println(ballence(1))
    println(withdraw(50))
    println(ballence(1))
  }
  def ballence(id:Int): String={
  s"Your ballence is $$${ballance}"
  }
  def withdraw(amount : Int): String ={
    ballance -= amount
    s"You withdrawn $$${amount}"

  }
  def deposit(amount : Int): String ={
    ballance += amount
    s"You deposited $$${amount}"
  }
  }
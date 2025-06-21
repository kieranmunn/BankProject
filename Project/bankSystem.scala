object bankSystem  {
  var ballance: Int = 0

  def main(args: Array[String]): Unit = {
    println("Hello, Scala!")
    println(deposit(50,1))
    println(ballence(1))
    println(withdraw(50,1))
    println(ballence(1))
    println(withdraw(50,1))
  }
  def ballence(id:Int): String={
  s"Your ballence is $$${ballance}"
  }
  def withdraw(amount : Int, id:Int): String ={
    if (ballance>= amount){
    ballance -= amount
    s"You withdrawn $$${amount}"
    }else{
      s"insufficient funds"
    }

  }
  def deposit(amount : Int, id:Int): String ={
    if(amount>0){
    ballance += amount
    s"You deposited $$${amount}"
    }else{
      s"Funds need to be posative"
    }
  }
  }
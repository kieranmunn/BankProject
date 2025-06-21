error id: file:///C:/Users/kiera/OneDrive/Documents/git/BankProject/Project/bankSystem.scala:scala/Predef.String#
file:///C:/Users/kiera/OneDrive/Documents/git/BankProject/Project/bankSystem.scala
empty definition using pc, found symbol in pc: scala/Predef.String#
semanticdb not found
empty definition using fallback
non-local guesses:
	 -String#
	 -scala/Predef.String#
offset: 285
uri: file:///C:/Users/kiera/OneDrive/Documents/git/BankProject/Project/bankSystem.scala
text:
```scala
object bankSystem  {
  var ballance: Int = 0

  def main(args: Array[String]): Unit = {
    println("Hello, Scala!")
    println(deposit(50))
    println(ballence(1))
  }
  def ballence(id:Int): String={
  s"Your ballence is $$${ballance}"
  }
  def withdraw(amount : Int): @@String ={
    

  }
  def deposit(amount : Int): String ={
    ballance += amount
    s"You deposited $$${amount}"
  }
  }
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Predef.String#
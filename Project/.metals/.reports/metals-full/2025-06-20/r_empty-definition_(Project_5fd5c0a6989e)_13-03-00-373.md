error id: file:///C:/Users/kiera/OneDrive/Documents/git/BankProject/Project/bankSystemTest.scala:assertEquals.
file:///C:/Users/kiera/OneDrive/Documents/git/BankProject/Project/bankSystemTest.scala
empty definition using pc, found symbol in pc: assertEquals.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -org/junit/jupiter/api/Assertions.BankSystem.assertEquals.
	 -org/junit/jupiter/api/Assertions.BankSystem.assertEquals#
	 -org/junit/jupiter/api/Assertions.BankSystem.assertEquals().
	 -BankSystem.assertEquals.
	 -BankSystem.assertEquals#
	 -BankSystem.assertEquals().
	 -scala/Predef.BankSystem.assertEquals.
	 -scala/Predef.BankSystem.assertEquals#
	 -scala/Predef.BankSystem.assertEquals().
offset: 348
uri: file:///C:/Users/kiera/OneDrive/Documents/git/BankProject/Project/bankSystemTest.scala
text:
```scala
//> using dep org.junit.jupiter:junit-jupiter-api:5.10.2
//> using dep org.junit.jupiter:junit-jupiter-engine:5.10.2
//> using test-framework junit

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class BankSystemTest {
  @Test def callDepsit(): Unit = {
    val account = BankAccount("Alice", 100)
    val re@@sult = BankSystem.deposit(account, 50)
    assertEquals(150.0, result.balance)
  }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: assertEquals.
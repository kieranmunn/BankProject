error id: file:///C:/Users/kiera/OneDrive/Documents/git/BankProject/Project/bankSystemTest.scala:`<none>`.
file:///C:/Users/kiera/OneDrive/Documents/git/BankProject/Project/bankSystemTest.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 333
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
    val account = BankAccount("Alice", 1@@00)
    val result = BankSystem.deposit(account, 50)
    assertEquals(150.0, result.balance)
  }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.
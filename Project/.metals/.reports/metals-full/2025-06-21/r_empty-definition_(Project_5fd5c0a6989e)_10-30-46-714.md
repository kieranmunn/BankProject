error id: file:///C:/Users/kiera/OneDrive/Documents/git/BankProject/Project/bankSystemTest.scala:
file:///C:/Users/kiera/OneDrive/Documents/git/BankProject/Project/bankSystemTest.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 189
uri: file:///C:/Users/kiera/OneDrive/Documents/git/BankProject/Project/bankSystemTest.scala
text:
```scala
//> using dep org.junit.jupiter:junit-jupiter-api:5.13.1
//> using dep org.junit.jupiter:junit-jupiter-engine:5.13.1
//> using test-framework org.junit.platform:junit-platform-console:1.1@@0.2

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

class BankSystemTest {

  @Test def callDeposit(): Unit = {
    val result = bankSystem.deposit(10)
    assertEquals("You deposited $10", result)
  }

  @Test def callWithdraw(): Unit = {
    val result = bankSystem.deposit(10)
    assertTrue(result.contains("deposited"))
  }

  @Test def callBallence(): Unit = {
    val result = bankSystem.ballence(1)
    assertTrue(result.contains("Your ballence is"))
  }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 
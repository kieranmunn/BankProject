error id: file:///C:/Users/kiera/OneDrive/Documents/git/BankProject/Project/bankSystemTest.scala:deposit.
file:///C:/Users/kiera/OneDrive/Documents/git/BankProject/Project/bankSystemTest.scala
empty definition using pc, found symbol in pc: deposit.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -org/junit/jupiter/api/Assertions.BankSystem.deposit.
	 -org/junit/jupiter/api/Assertions.BankSystem.deposit#
	 -org/junit/jupiter/api/Assertions.BankSystem.deposit().
	 -BankSystem.deposit.
	 -BankSystem.deposit#
	 -BankSystem.deposit().
	 -scala/Predef.BankSystem.deposit.
	 -scala/Predef.BankSystem.deposit#
	 -scala/Predef.BankSystem.deposit().
offset: 330
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
   
    val result = BankSystem.depo@@sit()
  }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: deposit.
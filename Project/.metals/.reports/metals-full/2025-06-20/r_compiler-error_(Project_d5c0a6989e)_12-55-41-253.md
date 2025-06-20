file:///C:/Users/kiera/OneDrive/Documents/git/BankProject/Project/bankSystemTest.scala
### java.lang.IndexOutOfBoundsException: 1

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 318
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
    val dep - BankSystem.@@
    assertEquals(150.0, result.balance)
  }
}
```



#### Error stacktrace:

```
scala.collection.LinearSeqOps.apply(LinearSeq.scala:131)
	scala.collection.LinearSeqOps.apply$(LinearSeq.scala:128)
	scala.collection.immutable.List.apply(List.scala:79)
	dotty.tools.pc.InterCompletionType$.inferType(InferExpectedType.scala:98)
	dotty.tools.pc.InterCompletionType$.inferType(InferExpectedType.scala:66)
	dotty.tools.pc.completions.Completions.advancedCompletions(Completions.scala:523)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:122)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:139)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:150)
```
#### Short summary: 

java.lang.IndexOutOfBoundsException: 1
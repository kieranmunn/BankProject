//> using dep "org.scalameta::munit:0.7.29"

class BankSystemTest extends munit.FunSuite {

  // Create an instance of your bankSystem class
  //val bankSystem = new bankSystem() // Make sure this matches your actual class name

  test("callDeposit") {
    val result = bankSystem.deposit(10)
    assertEquals("You deposited $10", result)
  }

  test("callWithdraw") {
    // First deposit some money, then withdraw
    bankSystem.deposit(20) // Setup some balance first
    val result = bankSystem.withdraw(10) // Assuming you have a withdraw method
    // Adjust the assertion based on what your withdraw method actually returns
    //assert(result.contains("withdraw")) // Update this based on actual return value
  }

  test("callBalance") { // Fixed spelling from "ballence" to "balance"
   // val result = bankSystem.balance() // Assuming this method exists and takes no parameters
    // Or if it takes a parameter: bankSystem.balance(1)
   // assert(result.contains("Your balance is")) // Fixed spelling
  }
}
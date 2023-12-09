fun main(){

//    val person2 = Person("Ivan", 20, gender = "Male")
//    person2.displayInfo()
//    val employee = Employee ("Ivana", 21, "Female", "768", position ="Director")
//    employee.displayInfo()

//    val circle=Circle(radius = 5.0)
//    println(circle.area())
//    val rectangle1=Rectangle(a=4.0,b=5)
//    println(rectangle1.area())
//    val triangle1=Triangle(a=6.0,b=12.0,c=13.0)
//    println(triangle1.area())


    val savingsAccount = SavingsAccount(100.0)
    val currentAccount = CurrentAccount(1300.0)
    savingsAccount.deposit(100.0)

    currentAccount.deposit(1000.0)
    currentAccount.withdraw(500.0)
    savingsAccount.withdraw(100.0)
    currentAccount.accountStatus()
    savingsAccount.accountStatus()

}

abstract class Account(balance: Any?) {
    var balance=0.0
    abstract fun deposit(amount:Double)
    abstract  fun withdraw(amount:Double)
    abstract  fun accountStatus()
}

class SavingsAccount(balance:Double): Account(balance) {


    override fun deposit(amount: Double) {
        balance += amount
        this.balance += amount
        println("Deposited $amount. New balance: $balance")

    }

    override fun withdraw(amount: Double) {
        println("Withdrawal not allowed for Savings Account.")
    }

    override fun accountStatus() {
        println("Savings Account - Balance: $balance")
    }

}
class CurrentAccount(balance: Double) : Account(balance){
    override fun deposit(amount: Double) {
        balance += amount
        this.balance += amount
        println("Deposited $amount. New balance: $balance")

    }

    override fun withdraw(amount: Double) {
        if (balance >= amount) {
            this.balance -= amount
            println("Withdrawn $amount. New balance: $balance")
        } else {
            println("Insufficient funds.")
        }
    }

    override fun accountStatus() {
        println("Current Account - Balance: $balance")
    }
}


//
//abstract class Shape{
//    abstract fun area():Double
//    abstract fun perimeter():Double
//
//}
//
//class Circle(val radius:Double):Shape(){
//    override fun area(): Double {
//        return Math.PI*radius*radius
//    }
//
//    override fun perimeter(): Double {
//        return 2*radius*Math.PI
//    }
//}
//class Rectangle(val a:Double, val b:Int):Shape() {
//    override fun area(): Double {
//        return a*b
//    }
//
//    override fun perimeter(): Double {
//        return 2*a+2*b
//    }
//}
//
//class Triangle(val a:Double, val b:Double, val c:Double):Shape() {
//    override fun area(): Double {
//        val s=(a+b+c)/2
//        return sqrt(s*(s-a)*(s-b)*(s-c))
//    }
//    override fun perimeter(): Double {
//        return a+b+c
//    }
//}

//class Employee(name: String, age: Int,  gender:String, val employeeId:String, val position: String):Person(name,age,gender){
//
//    override fun displayInfo() {
//        super.displayInfo()
//        super.gender="Female"
//        print("employeeId: $employeeId, position: $position")
//    }
//}
//class Car(model:String, year: Int):Vehicle(model, year){
//    override fun start(){
//        println("Car $model is starting")
//    }
//}
//
//class Scooter(model:String, year: Int):Vehicle(model, year){
//
//    override fun start() {
//        println("Scooter $model is starting")
//    }
//}
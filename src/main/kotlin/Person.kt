open class Person(val name: String,val age: Int,var gender:String) {


    open fun displayInfo(){
        println("Name: $name, age: $age, gender:$gender")
    }
}
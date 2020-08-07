fun setUser(name: String, hobby: String , age: Int) = "My name is $name, I like $hobby, and I'm $age years old"
fun printUser(name: String): Unit {
    print("My name is $name")
}
fun main() {
    val user = setUser("Peter Nathanael Munandar",  hobby =  "Basketball" , age = 17 )
    println(user)
}
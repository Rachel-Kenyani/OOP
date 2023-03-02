fun main(){
var trait=Human("May",20,65.5)
trait.eat(1)
    println(trait.weight)

trait.speak("I am a software developer.")

trait.birthday()

var details=User("Murray","Dicheru","murraydicheru@gmail.com","+254 710515773","alutacont123")
println(details.phoneNumber)
println(details.email)
}
class Human(var name:String,var age:Int,var weight:Double) {
    fun eat(foodWeight: Int) {
        var food="I am eating $foodWeight kgs of food"
        println(food)
        weight+=foodWeight}

    fun speak(speech: String) {
        println(speech)}

    fun birthday() {
        var addition=age+1
         println(addition)}
}

data class User(var firstName:String, var lastname:String,var email:String,var phoneNumber:String,var password:String)



























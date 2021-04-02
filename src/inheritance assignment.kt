fun main() {
    var car=Car("Subaru","Legacy","Navy Blue",6)
    car.carry(7)
    car.identity()
    println(car.calculateParkingFees(6))
    var bus=Bus("Toyota","Nissan","Black",40)
    bus.carry(60)
    bus.identity()
    println(bus.maxTripFare(80.50))
    println(bus.calculateParkingFees(5))

}

open class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        var overCapacity=people-capacity
        if (people<=capacity){
            println("Carrying $people passengers")
        }
        else{
            println("Over capacity by $overCapacity")
        }
    }
    fun identity(){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours:Int): Int{
        var parkingFees=hours*20
        return parkingFees
    }
}
class Bus(make:String,model:String,color:String,capacity:Int): Car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        var maxFare=fare*capacity
        return maxFare
    }
    override fun calculateParkingFees(hours: Int): Int {
        return hours*capacity
    }

    }





object Q3 extends App{

    case class Car(name: String, price: Double)

    class CarUUID(car: Car) {
        def uuid: String = s"car uuid = ${car.name} - ${car.name.hashCode}"
    }

    object CarExtensions {
        implicit def uuid(car: Car): CarUUID = new CarUUID(car)
    }

    import CarExtensions._

    val bmw3 = Car("bmw 3 series", 20000)
    val bmw5 = Car("bmw 5 series", 50000)
    val vwPassat = Car("vw passat", 10000)
    val vwGolf = Car("vw golf", 12000)
    val mazda3 = Car("mazda 3", 15000)

    val cars = List(bmw3, bmw5, vwPassat, vwGolf, mazda3)
    cars.foreach(car => println(car.uuid))

}
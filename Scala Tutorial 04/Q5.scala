object Q5 extends App{

    import scala.io.StdIn.readLine


    def toUpper(s: String): String = {
        s.toUpperCase() //string interpolator
    }

    def toLower(s: String): String = {
        s.toLowerCase()
    }

    def formatNames(name: String)(func: String => String): String = {
        func(name)
    }

    while(true){
        println("Enter a String to convert the case: ")
        var name = readLine()
        println("Upper case: " + formatNames(name)(toUpper(_)))
        println("Lower case: " + formatNames(name)(toLower(_)))
    }
}
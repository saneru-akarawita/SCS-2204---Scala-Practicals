object Q1 extends App{

    import scala.io.StdIn.readFloat;
    import scala.math._;

    def areaDisk(r:Double):Double=Pi*r*r;

    println("Enter the Radius :");
    var rad = scala.io.StdIn.readDouble();

    println("The Area of the Disk is :" + areaDisk(rad));

}
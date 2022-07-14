object Q5 extends App{

    def easypace(dis:Float):Float=dis*8;

    def tempo(dis:Float):Float=dis*7;

    def tot(a:Float,b:Float,c:Float):Float=easypace(a)+tempo(b)+easypace(c);

    println("Total Running Time : "+ tot(2,3,2)+ " min");
}
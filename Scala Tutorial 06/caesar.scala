import scala.io.StdIn._

object caesar {
    
    def main(args: Array[String]):Unit={
        
     val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"


     print("Enter the Word : ")
     var word=readLine()

     print("Enter Shifted key : ")
     var shift=readInt()
    
     print("Enter 'E' for Encryption and 'D' for Decryption : ")
     val key:Char=readChar().toUpper

     val Encrypt =(c:Char,shift:Int,a:String)=> a((a.indexOf(c.toUpper)+shift)%26)

     val Decrypt =(c:Char,shift:Int,a:String)=> a((a.indexOf(c.toUpper)-shift)%26)


      val cipher =(algo:(Char,Int,String)=>Char,word:String,a:String,shift:Int)=> word.map(algo(_,shift,a));
      
      val c= if(key=='E') cipher(Encrypt,word,alphabet,shift) else cipher(Decrypt,word,alphabet,shift)

      println("result : "+c);


    }

}
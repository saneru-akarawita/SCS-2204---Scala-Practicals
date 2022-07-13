object Q6a extends App{

    def grade(avgmarks:Float):Any={
        if(avgmarks>69.0)
            println("Very Good");
        else if(avgmarks>54.0)
            println("Good");
        else if(avgmarks>39.0)
            println("Pass");
        else
            println("Fail");
    }

    grade(45);
}

object Q6a extends App{

    def grade(avgmarks:Float):Any={
        if(avgmarks>39.0){
            if(avgmarks>54.0){
                if(avgmarks>69.0){
                    println("Very Good");    
                }
                else{
                    println("Good");
                }
            }
            else{
                println("Pass");
            }
        }
        else{
            println("Fail");
        }
               
    }
     
    grade(55);
}

object Q6c extends App{

    def grade(marks:Float):Any=if(marks>39.0) (if(marks>54.0) (if(marks>69.0) "Very Good" else "Good") else "Pass") else "Fail";

    println(grade(16));
}
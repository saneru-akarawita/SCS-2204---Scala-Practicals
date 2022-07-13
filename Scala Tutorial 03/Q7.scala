object Q7 extends App{

    def DetMOnth(month:Int):Any={

        if(month==12 || month ==1 || month ==2)
            println("Season = Winter");
        
        else if(month==3 || month ==4 || month ==5)
            println("Season = Spring");
        
        else if(month==6 || month ==7 || month ==8)
            println("Season = Summer");
        
        else if(month==9 || month ==10 || month ==11)
            println("Season = Autumn");

        else
            println("Bogus Month");
    }

    DetMOnth(12);
    DetMOnth(4);
    DetMOnth(6);
    DetMOnth(11);
    DetMOnth(22);
}
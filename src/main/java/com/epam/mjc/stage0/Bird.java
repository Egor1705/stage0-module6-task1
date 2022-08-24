package com.epam.mjc.stage0;

public class Bird  extends Animal{

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Bird(){

    }
    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super("blue", 2, false);


    }



    @Override
    public String getDescription() {
       // return super.getDescription()+" Moreover, it has 2 wings and can fly.";
        String fur = "";
        String paw = "";
        if(this.hasFur==true){
            fur = "a";
        }
        else{
            fur = "no";
        }
        if(this.numberOfPaws==1){
            paw = "paw";
        }
        else{
            paw = "paws";
        }
        return "This animal is mostly "+ this.color + ". " +
                "It has "+this.numberOfPaws+" "+paw+" and " +
                ""+ fur+" fur.Moreover, it has 2 wings and can fly.";
    }
}

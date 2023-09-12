package CompositionChallenge;

public class Main {
    public static void main(String[] args){

        //creating 4 walls
        Wall wall1 = new Wall("West");//here we created an object from Wall class and passed the direction parameter
        Wall wall2 = new Wall("East");//here we created an object from Wall class and passed the direction parameter
        Wall wall3 = new Wall("South");//here we created an object from Wall class and passed the direction parameter
        Wall wall4 = new Wall("North");//here we created an object from Wall class and passed the direction parameter

        //creating ceiling
        Ceiling ceiling = new Ceiling(12,55);
        //creating bed
        Bed bed = new Bed("Modern",4,3,2,1);
        //creating lamp
        Lamp lamp = new Lamp("Classic",false,75);

        //creating bedroom by passing all these objects as parameters
        Bedroom bedroom = new Bedroom("Rakesh",wall1,wall2,wall3,wall4,ceiling,bed,lamp);

        //testing methods in Bedroom Class
        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }
}

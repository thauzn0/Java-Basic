package LinkedListChallenge;

import java.util.LinkedList;
record Place(String name, int distance){
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}
public class LLChallenge {

    public static void main(String[] args){
        LinkedList<Place> placesToVisit = new LinkedList<>();
        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placesToVisit, adelaide);
        System.out.println(placesToVisit);

    }

    private static void addPlace(LinkedList<Place> list, Place place){

        if(list.contains(place)){
            System.out.println("FOund duplicate:" + place);
            return;
        }

        list.add(place);

    }

}

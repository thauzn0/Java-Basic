package LinkedListChallenge;

import java.util.LinkedList;
import java.util.ListIterator;

public class ModernLinkedList {


    public static void main(String[] args){

        //LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        //removeElements(placesToVisit);
        //System.out.println(placesToVisit);

        printItinerary2(placesToVisit);


    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Hobart");
        list.offer("Melbourne");
        // Queue methods
        list.offerFirst("Brisbane");
        list.offerLast("Toowomba");
        // Stack methods
        list.push("Alice Springs");
    }

    private static void removeElements(LinkedList<String> list){
        list.remove(4);
        list.remove("Brisbane");
        System.out.println(list);
        String s1 = list.remove();
        System.out.println(s1 + "was removed");

        String s2 = list.removeFirst();
        System.out.println(s2 + "was removed");

        String s3  = list.removeLast();
        System.out.println("was removed");

        // Queue / deque poll methods
        String p1 = list.poll();//removes first element
        String p2 = list.pollFirst();//removes first element
        String p3 = list.pollLast();

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop(); // removes first element
        System.out.println(p4 + "Was removed");
    }

    private static void gettingElements(LinkedList<String> list){
        System.out.println("Retrieved elements = " + list.get(4));

        System.out.println("First element = " + list.getFirst());

        System.out.println("Last element = " + list.getLast());

        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));

        System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne"));

        // Queue retrieval methods
        System.out.println(list.element());
        // Stack retrieval methods
        System.out.println(list.peekFirst());
        System.out.println(list.peek()); // same with peekFirst();
        System.out.println(list.peekLast());

    }

    public static void printItinerary(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        for(int i = 0; i < list.size(); i++) System.out.println(list.get(i) + "to " + list.get(i + 1));



        System.out.println("Trip ends at " + list.getLast());

    }

    public static void printItinerary2(LinkedList<String> list){
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator();

        while(iterator.hasNext()){
            var town = iterator.next();
            System.out.println("--> From:" + previousTown
            + " To " + town
            );
            previousTown = town;
        }

    }

}

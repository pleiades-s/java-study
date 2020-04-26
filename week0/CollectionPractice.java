// https://www.javatpoint.com/collections-in-java

import java.util.*;

class ArrayListPractice{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        Iterator<String> itr = list.iterator();

        while(itr.hasNext()){ // hasNext(): It returns true if the iterator has more elements otherwise it returns false.
            System.out.println(itr.next()); // next(): It returns the element and moves the cursor pointer to the next element.
        }
    }
}

class LinkedListPractice{
    public static void main(String args[]){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
        linkedList.add("four");

        Iterator<String> itr = linkedList.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

class VectorPractice{ // ArrayList shows better performance than Vector
    public static void main(String args[]){
        Vector<String> v = new Vector<String>();
        v.add("one");
        v.add("two");
        v.add("three");
        v.add("four");

        Iterator<String> itr = v.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

class StackPractice{
    public static void main(String args[]){
        Stack<String> stack = new Stack<String>();

        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");

        stack.pop();

        Iterator<String> itr = stack.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

class PriorityQueuePractice{
    public static void main(String args[]){
        PriorityQueue<String> queue = new PriorityQueue<String>();

        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");

        System.out.println("head: "+ queue.element());
        System.out.println("head: "+ queue.peek());

        Iterator<String> itr = queue.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        queue.remove();
        queue.poll();

        System.out.println("After removing two elements:");
        Iterator<String> itr2 = queue.iterator();

        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}

class ArrayDequePractice{
    public static void main(String[] args){

        Deque<String> deque = new ArrayDeque<String>();
        deque.add("one");
        deque.add("two");
        deque.add("three");
        deque.add("four");

        for (String str : deque){
            System.out.println(str);
        }
    }
}

class HashSetPractice{
    public static void main(String[] args){

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        
        HashSet<String> hashSet = new HashSet<String>(arrayList); // HashSet can make a list a set
        hashSet.add("one"); // will be ignored bc it's a set
        Iterator<String> itr = hashSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }    
    }
}

class LinkedHashSetPractice{
    public static void main(String args[]){
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("one");
        linkedHashSet.add("two");
        linkedHashSet.add("three");
        linkedHashSet.add("one");

        Iterator<String> itr = linkedHashSet.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

class TreeSetPractice{
    public static void main(String[] args){
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("one");
        treeSet.add("two");
        treeSet.add("three");
        treeSet.add("one");

        Iterator<String> itr = treeSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
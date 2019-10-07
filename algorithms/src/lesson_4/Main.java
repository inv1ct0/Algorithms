package lesson_4;

public class Main {
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(14);

        System.out.println("1 dequeue: " + queue.dequeue() + "\n2 dequeue: " + queue.dequeue() + "\n3 dequeue: " + queue.dequeue());

//        MyQueueLinked<String> mll = new MyQueueLinked<>();
//
//        mll.add("Katia");
//        mll.add("Maria");
//
//        System.out.println(mll);
//
//        mll.remove("Katia");
//        System.out.println(mll);
//
//        System.out.println(mll.removeFirst());
//        System.out.println(mll);
//        System.out.println(mll.removeLast());
//        System.out.println(mll);
//
//        mll.poll();
//        System.out.println(mll);
//
//        for (String s : mll) {
//            System.out.print(s + " : ");
//        }
//
//        System.out.println();
//        for (String s : mll) {
//            System.out.print(s + " ");
//        }

//        MyLinkedList<Integer> stack = new MyLinkedList<>();
//        MyLinkedStack<Integer> stack = new MyLinkedStack<>();

//        System.out.println(mll.remove("Petia"));
//        System.out.println(mll);
//        System.out.println(mll.remove("Katia"));
//        System.out.println(mll);
//
//        System.out.println(mll.contains("Katia"));

    }
}

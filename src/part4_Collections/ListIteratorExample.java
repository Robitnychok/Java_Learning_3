package part4_Collections;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {

        String s = "madam";
        List<Character> list = new ArrayList<>();

        for (char ch : s.toCharArray()){
            list.add(ch);
        }
        System.out.println(list);

        ListIterator <Character> iteratorFromTheBegining = list.listIterator();
        ListIterator <Character> iteratorFromTheEnd = list.listIterator(list.size());

        boolean isPalindrome = true;
        while(iteratorFromTheBegining.hasNext() && iteratorFromTheEnd.hasPrevious()){
            if( iteratorFromTheBegining.next() != iteratorFromTheEnd.previous()){
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not polindrome");
        }


    }
}

package COLLECTIONS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LISTINTERFACE {


//    list
//every item in an list is a objects is also represents the index number

    // arraylist
   //  linked list

//    add(index, object)
//    addAll(index,collection)
//    remove(index)
//    get(index) used to getobject and return
//    set(index, obj) used to replace the object in exiting one




    // ARRAY List

    //    add(index, object)
//    addAll(index,collection)
//    remove(index)
//    get(index) used to getobject and return
//    set(index, obj) used to replace the object in exiting one
//   CONTAINS()
//   ISEMPTY()


//    COLLECTIONS.SORT(ARRAYlIST);
//    Collections.SHUFFLE(ARRAYLIST)

    public static void main(String[] args) {

        // Declare an arraylist
        //        ArrayList al = new ArrayList<>();
        //        ArrayList<Integer> al = new ArrayList<>();


//        List al =new ArrayList();
   ArrayList al = new ArrayList();

   // add new elements in an array list
        al.add(100);
        al.add("Dhanushkumar");
        al.add(15.5);
        al.add('A');
        al.add(true);

        System.out.println(al);
//        [100, Dhanushkumar, 15.5, A, true]

        System.out.println("-----------------------------------------------------------------------");
        // to check size

        System.out.println("Number of elements in arraylist : "+ al.size());
//        Number of elements in arraylist : 5

        System.out.println("-----------------------------------------------------------------------");

        // remove
//     al.remove(1);
     al.remove("Dhanushkumar")
;
        System.out.println(al);
        //[100, 15.5, A, true]

        System.out.println("-----------------------------------------------------------------------");


        // insert the element

        al.add(1,"sanjay");
        System.out.println(al);
        //[100, sanjay, 15.5, A, true]

        System.out.println("-----------------------------------------------------------------------");


        //retreive a specific element in an arraylist
        al.get(3);
        System.out.println(al.get(1));
// sanjay

        // change the value inan arraylist
        // replace

        al.set(1,"Dhanushkumar");
        System.out.println(al);

//        [100, Dhanushkumar, 15.5, A, true]


//        search an array i present or not
// return true or false
        System.out.println(  al.contains("Dhanushkumar"));




    }





}

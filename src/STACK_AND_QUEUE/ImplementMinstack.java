//package STACK_AND_QUEUE;
//
//import java.util.*;
//
//public class ImplementMinstack {
//
//    public static void main(String[] args) {
//
//    }
//
//    Stack < Long > st = new Stack < Long > ();
//    Long mini;
//
//
//
//    /** initialize your data structure here. */
//    public long MinStack() {
//        mini = Long.MAX_VALUE;
//    }
//
//    public void push(int value) {
//        Long val = Long.valueOf(value);
//        if (st.isEmpty()) {
//            mini = val;
//            st.push(val);
//        } else {
//            if (val < mini) {
//                st.push(2 * val - mini);
//                mini = val;
//            } else {
//                st.push(val);
//            }
//        }
//    }
//
//    public void pop() {
//        if (st.isEmpty()) return;
//
//        Long val = st.pop();
//        if (val < mini) {
//            mini = 2 * mini - val;
//        }
//    }
//
//    public int top() {
//        Long val = st.peek();
//        if (val < mini) {
//            return mini.intValue();
//        }
//        return val.intValue();
//    }
//
//    public int getMin() {
//        return mini.intValue();
//    }
//}

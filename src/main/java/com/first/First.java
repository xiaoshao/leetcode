package com.first;

public class First {

    public static void main(String[] args) {

//        ListNode listNode = new ListNode(9);
//        listNode.next = new ListNode(9);
//
//        ListNode listNode1 =addTwoNumbers(new ListNode(1), listNode);
//        for(ListNode list = listNode1; list != null; list =list.next){
//            System.out.println(list.val);
//        }
//        System.out.println(firstBadVersion(2126753390));


        System.out.println(String.format("%-10s", " "));
    }

    public static int firstBadVersion(int n) {
        int beginning = 1;
        int end = n;
        while (beginning + 1 < end) {
            if (isBadVersion(beginning)) {
                return beginning;
            }

            int mid = beginning + (end - beginning) / 2;

            if (isBadVersion(mid)) {
                end = mid;
            } else {
                beginning = mid + 1;
            }
            System.out.println("beginning" + beginning + "end" + end);
        }

        if (isBadVersion(beginning)) {
            return beginning;
        }

        return end;
    }

    public static boolean isBadVersion(int version) {
        return version >= 1702766719;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        public String toString(){
            StringBuilder sb = new StringBuilder(val);
            ListNode next = this.next;
            while (next != null){
                sb.append(":::  next" + next.toString());
                next = next.next;
            }

            return sb.toString();
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headNode = null;
        ListNode listNode = null;
        int carry = 0;
        while(l1 != null || l2 != null){

            int el1 = l1 == null? 0: l1.val;
            int el2 = l2 == null? 0: l2.val;

            int summary = el1 + el2 + carry;
            carry = summary / 10;

            if(listNode != null){
                listNode.next = new ListNode(summary % 10);
                listNode = listNode.next;
            }else{
                listNode = new ListNode(summary % 10);
                headNode = listNode;
            }

            l1 = l1 != null? l1.next: null;
            l2 = l2 != null? l2.next: null;
        }

        if(carry > 0) {
            listNode.next = new ListNode(carry);
        }

        return headNode;
    }
}

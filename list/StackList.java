package list;

import java.util.Stack;

public class StackList {
    int a=1;
    StackList (int a){
        this.a= a;

    }
    public static void main(String args[]){
        Stack<String> stacklist = new Stack<>();
        stacklist.push("vishal");
        stacklist.push("badhan");
        stacklist.push("03");
        // for(int i = 0 ; i< stacklist.size() ; i++)
        // {
        //   //  stacklist.peek();
        //     System.out.println(stacklist.peek());
        //     stacklist.pop();

        // }
        int j=0 ;
        while(stacklist.isEmpty() == false) {
            System.out.println(stacklist.peek());
            stacklist.pop();
            j++;
        }
        // Stack<StackList> stacklist1 = new Stack<>();
        // StackList stacklist2 = new StackList(24);
        // stacklist1.push(stacklist2);

        // StackList peekvalue = stacklist1.peek();
        // System.out.println(peekvalue.a);
        
        
        
        
    }
    
}

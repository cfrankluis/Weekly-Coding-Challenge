package week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem_2 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;
        
        List<Integer> nodeVals= new ArrayList<>();
        for(ListNode list : lists){
            ListNode listTracker = list;
            while(listTracker != null){
                nodeVals.add(listTracker.val);
                listTracker = listTracker.next;
            }            
        }
        
        if(nodeVals.size() == 0)
            return null;
        
        Collections.sort(nodeVals);
        
        List<ListNode> result = new ArrayList<>();
        for(int val : nodeVals){
            result.add(new ListNode(val));
        }
        
        for(int i=0; i<result.size()-1; i++){
            result.get(i).next = result.get(i+1);
        }
        
        return result.get(0);
    }
}

package leetCode;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls933 {
    //
    private Queue<Integer> requests;
    public NumberOfRecentCalls933() {
        this.requests = new LinkedList<>();
    }

    public int ping(int t) {
        requests.add(t);
        while (requests.peek() < t - 3000) {
            requests.poll();
        }
        return requests.size();
    }
}

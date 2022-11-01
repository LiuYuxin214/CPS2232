package MidtermExamReview;

import java.util.PriorityQueue;

public class PQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(24);
        pq.offer(65);
        pq.offer(81);
        pq.offer(12);
        pq.offer(89);
        pq.offer(21);
        for (int i = 0; i < 6; i++) {
            System.out.println(pq.poll());
        }

    }
}

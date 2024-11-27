package com.example.priorityqueueapp.application.domain;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * dequeue operation 에 사용.
 * @param <T>
 */
public class KWayMergeAlgorithm<T extends Task> {
    public List<T> merge(PriorityQueue<T> minHeap, List<T>... sortedArrays) {
        while(!minHeap.isEmpty()) {
            T current = minHeap.poll();
            result.add(current);
        }
    }



}

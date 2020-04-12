package com.codewithata.weektwo;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> stonesQueue=new PriorityQueue<>(Collections.reverseOrder());

        for (int stone:stones)
            stonesQueue.add(stone);

        while (stonesQueue.size()>1){
            int y=stonesQueue.poll();
            int x=stonesQueue.poll();

            if(y>x)
                stonesQueue.offer(y-x);
        }

        return stonesQueue.isEmpty()?0:stonesQueue.poll();
    }
}

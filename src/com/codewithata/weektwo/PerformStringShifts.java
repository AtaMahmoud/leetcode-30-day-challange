package com.codewithata.weektwo;

public class PerformStringShifts {
    public String stringShift(String s, int[][] shift) {
        int numberOfShifts = 0;
        for (int i = 0; i < shift.length; i++) {
            if (shift[i][0] == 0)
                numberOfShifts -= shift[i][1];
            else
                numberOfShifts += shift[i][1];
        }
        boolean shouldRotateLeft = (numberOfShifts < 0);
        numberOfShifts=Math.abs(numberOfShifts);
        numberOfShifts%=numberOfShifts;

        if(shouldRotateLeft)
            s=rotateLeft(s,numberOfShifts);
        else
            s=rotateLeft(s,s.length()-numberOfShifts);

        return s;
    }

    private String rotateLeft(String s, int numberOfShifts) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s.substring(numberOfShifts));
        stringBuilder.append(s.substring(0, numberOfShifts));
        return stringBuilder.toString();
    }
}

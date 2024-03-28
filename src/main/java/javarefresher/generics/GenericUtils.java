package javarefresher.generics;

import java.util.List;

public class GenericUtils<T extends Number & Comparable<T>> {
    public T findMaxInList(List<T> inputList){
        T maxSoFar = inputList.get(0);
        for (T curr : inputList){
            if (curr.compareTo(maxSoFar) > 0) maxSoFar = curr;
        }
        return maxSoFar;
    }
}

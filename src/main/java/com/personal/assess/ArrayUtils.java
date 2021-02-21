package com.personal.assess;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Pramod Negi
 * @version 1.0
 * @date 20 Feb 2021
 */
public final class ArrayUtils<E> {

    /**
     * This mathod returns the Elements of @param mainArray that are not present in @param subArray.
     *
     * @param mainArray
     * @param subArray
     * @return
     */
    public List<E> filterAbsent(E[] mainArray, E[] subArray) {
        Set<E> subArraySet = toSet(subArray);
        List<E> absentElements = Arrays.stream(mainArray).filter(e -> subArraySet.add(e) == true).collect(Collectors.toList());
        return absentElements;
    }

    private Set<E> toSet(E[] subArray) {
        if (subArray == null || subArray.length == 0) {
            return new HashSet<E>();
        }
        return Arrays.stream(subArray).collect(Collectors.toSet());
    }
}

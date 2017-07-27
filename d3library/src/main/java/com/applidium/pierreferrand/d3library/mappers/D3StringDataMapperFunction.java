package com.applidium.pierreferrand.d3library.mappers;

/**
 * Maps a String to each value of an array.
 */
public interface D3StringDataMapperFunction<T> {
    /**
     * @param object The object to consider.
     * @param position The position of the object.
     * @param data The array of data.
     */
    String compute(T object, int position, T[] data);
}

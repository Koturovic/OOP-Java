package zadatak_vector;

import java.util.Arrays;

public class Vector<T> {
    private T[] elements;
    private int capacity;
    private int size;
    private int growthFactor;

    public Vector(int capacity, int growthFactor){
        if(capacity<=0){
            throw new IllegalArgumentException("Kapacitet mora biti pozitivan");

        }
        if(growthFactor<=0){
            throw new IllegalArgumentException("Fakor rasta mora biti pozitivan");
        }
        this.capacity = capacity;
        this.growthFactor = growthFactor;
        this.size = 0;
        this.elements = (T[]) new Object[capacity];
    }
    public void add(T element){
        if(size == capacity){
            resize();
        }
        elements[size++] = element;
    }

    public Vector<T> reverse(){
        Vector<T> reversed = new Vector<>(capacity,growthFactor);
        for(int i = size-1;i>0 ;i--){
            reversed.add(elements[i]);
        }
        return reversed;
    }

    public void insert(int index, T element){
        if(index<0 || index>size){
            throw new ArrayIndexOutOfBoundsException("Netacan indeex");
        }
        if(size == capacity){
            resize();
        }

        elements[index] = element;
        size++;
    }
    private void resize(){
        capacity+=growthFactor;
        elements = Arrays.copyOf(elements, capacity);
    }

    public Vector<T> merge(Vector<T> other){
        int newCapacity = this.size + other.size;
        Vector<T> spojen = new Vector<>(newCapacity, this.growthFactor);
        for(int i = 0; i< this.size; i++){
            spojen.add(this.elements[i]);
        }
        for(int i = 0; i< other.size; i++){
            spojen.add(other.elements[i]);
        }
        return spojen;
    }
}

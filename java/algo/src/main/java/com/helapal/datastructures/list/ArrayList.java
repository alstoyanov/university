package com.helapal.datastructures.list;

import com.helapal.datastructures.api.List;

public class ArrayList<T> implements List<T>{
    private T[][] items;
    private int size;
    private int baseArraySize;
    private int maxArrayCount;

    public ArrayList() {
        this(100, 100);
    }

    @SuppressWarnings("unchecked")
    public ArrayList(int baseArraySize, int maxArrayCount) {
        this.items = (T[][]) new Object[maxArrayCount][baseArraySize];
        this.size = 0;
        this.baseArraySize = baseArraySize;
        this.maxArrayCount = maxArrayCount;
    }
       
    @Override
    public void add(T elem) {
        if(size / baseArraySize >= maxArrayCount) {
            resize();
        }
        
        items[size / baseArraySize][size % baseArraySize] = elem;
        size++;
    }

    private void resize() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'resize'");
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int possition, T elem) {
        // All elements after the possition should be shifted right first
        if (possition > size + 1) {
            throw new RuntimeException("Index for add should be less then current size of the array");
        }

        if(size + 1 > maxArrayCount * baseArraySize) {
            resize();
        }

        for (int i = size ; i > possition ; i--) {
            items[(i + 1) / baseArraySize][(i + 1) % baseArraySize] =
                items[i / baseArraySize][i % baseArraySize];
        }
        items[possition / baseArraySize][possition % baseArraySize] = elem;
    }

    @Override
    public T get(int possition) {
        return items[possition / baseArraySize][possition % baseArraySize];
    }

    @Override
    public T delete(int possition) {

        if (possition > size) {
            throw new RuntimeException("Index for delete should be less then current size of the array");
        }

        T result = get(possition);

        for(int i = possition ; i < size ; i++) {
            //TODO shift left
        }

        return result;
    }

}

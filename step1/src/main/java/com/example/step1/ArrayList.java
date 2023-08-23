package com.example.step1;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
public  class ArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable{

        @Override
        public ArrayList<E> clone() {
            try {
                return (ArrayList) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}

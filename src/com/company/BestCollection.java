package com.company;

import java.util.*;

/**
 *
 * My realisation its one example of collections api. This class based on array but with specifics moments.
 * @author Владислав
 * @version 1.0
 */
public class BestCollection<Integer> implements List<Integer> {
    private int[] elementsOfData;

    public BestCollection() {
        elementsOfData = new int[10];
    }

    @Override
    public int size() {
        return elementsOfData.length;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int element : elementsOfData) {
            if (element == 0) return true;
        }
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {


        return new Iterator<Integer>() {
            int cursor; // cursor for array.
            int lastRet = -1; // index of last element returned; -1 if no such
            @Override
            public boolean hasNext() {


                return cursor != elementsOfData.length;
            }

            @Override
            public Integer next() {
                int i = cursor;
                if (i >= elementsOfData.length)
                    throw new NoSuchElementException();
                int[] elementData = BestCollection.this.elementsOfData;
                if (i >= elementData.length)
                    throw new ConcurrentModificationException();
                cursor = i + 1;
                int inte = elementData[lastRet =i];
                Number n = inte;
                Integer integer = (Integer) n;
                return integer;
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Integer get(int index) {
        return null;
    }

    public boolean removeWithIndex(int index) {
        if (index < elementsOfData.length) {
            decreaseElements(elementsOfData[index]);
            elementsOfData[index] = 0;

            return true;
        } else return false;

    }

    public boolean removeFirst() {
        int x = elementsOfData[0];
        decreaseElements(x);
        elementsOfData[0] = 0;

        return true;
    }

    public boolean removeLast() {
        int x = elementsOfData[elementsOfData.length - 1];
        decreaseElements(x);
        elementsOfData[elementsOfData.length - 1] = 0;
        return true;
    }

    @Override
    public Integer remove(int value) {
        for (int i = 0; i < elementsOfData.length; i++) {
            if (elementsOfData[i] == value) {
                decreaseElements(value);
                elementsOfData[i] = 0;

            } else continue;
        }
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public void add(int index, Integer element) {
        Number n = (Number) element;
        int el = n.intValue();
        increaseElements(el);
        if (index < elementsOfData.length)
            elementsOfData[index] = el;
        else {
            newLenghtOfArray(elementsOfData);
            elementsOfData[index] = el;
        }


    }

    @Override
    public Integer set(int index, Integer element) {
        return null;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    /**
     * The method for adding if first place elements to my collection.
     *
     * @param value what we wanna add.
     * @return int element what was here.
     */

    public int addFirst(int value) {
        int firstElementWhatWasHere = elementsOfData[0];
        increaseElements(value);
        elementsOfData[0] = value;

        return firstElementWhatWasHere;
    }

    public int addLast(int value) {
        int lastElementWhatWasHere = elementsOfData[elementsOfData.length - 1];
        increaseElements(value);
        elementsOfData[elementsOfData.length - 1] = value;


        return lastElementWhatWasHere;
    }

    @Override
    public boolean add(Integer value) {
Number num = (Number) value;
int in = num.intValue();
if (in<=0) try {
    throw new NullParamToMethodAddException("field is fold", in);

} catch (NullParamToMethodAddException e) {

    e.getMessage();
    return false;


}
        for (int i = 0; i < elementsOfData.length; i++) {
            int index;
            if (elementsOfData[i] == 0) {
                Number n = (Number) value;
                index = n.intValue();

                elementsOfData[i] = index;
                increaseElements(index);
                elementsOfData = newLenghtOfArray(elementsOfData);

                return true;
            } else {
                elementsOfData = newLenghtOfArray(elementsOfData);
                Number n = (Number) value;
                index = n.intValue();
                increaseElements(index);
                elementsOfData[elementsOfData.length-1] = index;
                return true;
            }

        }
        return false;
    }


    /**
     * Method for resizing of based array.
     *
     * @param array what me wanna create bigger
     * @return bigger array
     */
    private int[] newLenghtOfArray(int[] array) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    /**
     * Void method for present all elements of my BestCollection.
     */
    public void getMyContainer() {
        for (int i : elementsOfData) System.out.print(i + " ");

    }

    /**
     * Method for increasing elements od collection.
     * @param value how much  increas
     */
    private void increaseElements(int value) {
        for (int i = 0; i < elementsOfData.length; i++) {
            int el = elementsOfData[i];
            el += value;
            elementsOfData[i] = el;
        }

    }
    /**
     * Method for decreasing elements od collection.
     * @param value how much  decrease/
     */
    private void decreaseElements(int value) {
        for (int i = 0; i < elementsOfData.length; i++) {
            int el = elementsOfData[i];
            el -= value;
            elementsOfData[i] = el;
        }
    }

}

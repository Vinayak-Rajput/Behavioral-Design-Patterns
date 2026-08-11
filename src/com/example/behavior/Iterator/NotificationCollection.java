package com.example.behavior.Iterator;

public class NotificationCollection implements Container<String> {

    private String[] notifications;
    private int noOfItems =0;

    public NotificationCollection(int capacity) {
        this.notifications = new String[capacity];
    }
    public void addItem(String str){
        if(noOfItems < notifications.length){
            notifications[noOfItems++]= str;
        }
    }
    @Override
    public Iterator<String> createIterator() {
        return new NotificationIterator();
    }

    public class NotificationIterator implements Iterator<String>{
        private int index=0;

        @Override
        public boolean hasNext() {
            return index < noOfItems;
        }

        @Override
        public String next() {
            if(this.hasNext()){
                return notifications[index++];
            }
            return null;
        }
    }
}

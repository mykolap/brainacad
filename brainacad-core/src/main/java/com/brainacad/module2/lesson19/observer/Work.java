package com.brainacad.module2.lesson19.observer;

/**
 * Created by Alex on 12/11/2016.
 */
public class Work {
    public static void main(String[] args) {
        //create subject
        MyTopic topic = new MyTopic();
        //create observers
        Observer obj1 = new MyTopicSubscriber("Obj1");
        Observer obj2 = new MyTopicSubscriber("Obj2");
        Observer obj3 = new MyTopicSubscriber("Obj3");
        //register observers to the subject
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);
        //attach observer to subject
        //now send message to subject
        topic.postMessage("New Message");
    }
}

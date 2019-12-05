# Welcome to ImmutableQueue Repository!

## What is this?
This repository contains the interfaces and implementation class for simulating how an immutable queue works, fully in Java Programming Language. Basically, immutable queue allows you to create a queue in the more efficient and secure way since you are not allowed to modify the queue after create it for the first time. The only way to modify them is by create a new queue with the changes (either remove or add new element).

## Main functionality
If you would like to use my implementation of immutable queue, there are several methods you can use, as follows:
 1. Create an empty Immutable queue
	 ```java
	Queue<T> newQueue = ImmutableQueue.getEmptyQueue();
	 ```
 2. Insert new element to the queue
	 ```java
	newQueue = newQueue.enQueue(t);
	 ```
	 where `t` represents the element you want to insert.
 3. Remove an element from the queue
	 ```java
	newQueue = newQueue.deQueue();
	 ```
 4. Check if the queue is empty
	 ```java
	bool isEmpty = newQueue.isEmpty();
	 ```
	 it will return `true` if the queue is empty. Otherwise, it will return false.
 5. Get the first element of the queue
	 ```java
	T head = newQueue.head();
	 ```

## How to run this?
Since the project is built using maven build tool, you can first build the project using the command `mvn clean install`. To run the test, simply run the command `mvn clean test` and it will run all the written test for you
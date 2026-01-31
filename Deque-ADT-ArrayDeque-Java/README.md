# Implementation of the Deque ADT (ArrayDeque — Java)

## Overview
A Java implementation of the Deque ADT (double-ended queue) that supports inserting and removing elements from both the front and the rear. The deque is implemented using a fixed-size circular array, providing efficient operations and flexible usage.

## What a Deque Supports
A deque (double-ended queue) allows:
- Add to front
- Add to rear
- Remove from front
- Remove from rear

## Implementation Details
### Data structure
- Backed by an array `data[]`
- Uses two indices:
  - `f` = front index
  - `r` = rear index (next available slot)
- Tracks current element count with `size`
- Uses modulo arithmetic to wrap indices (circular behavior)

### Capacity behavior
- Default capacity = 1000
- Supports custom capacity via constructor
- When full, insertion throws `IllegalStateException("Deque is full")`

### Empty behavior
- `removeFirst()` / `removeLast()` return `null` if empty
- `first()` / `last()` return `null` if empty

## Supported Operations
- `size()` → returns number of elements
- `isEmpty()` → checks if deque has no elements
- `isFull()` → checks if deque reached capacity
- `addFirst(e)` → insert at front (circular decrement of `f`)
- `addLast(e)` → insert at rear (circular increment of `r`)
- `removeFirst()` → remove from front (circular increment of `f`)
- `removeLast()` → remove from rear (circular decrement of `r`)
- `first()` → peek front without removing
- `last()` → peek rear without removing

## Test & Evaluation (Sample Run)
The provided test program validates:
- Empty checks and size at start
- Adding elements to the front (verifying `first()` and `last()`)
- Adding elements to the rear until full capacity
- Attempting to add when full (exception message)
- Removing from front and rear
- Checking status when one element remains
- Removing last element until empty
- Removing from an empty deque (returns `null`)

## How to Run
Project uses `package project;` in both classes, so files must be placed like this:
- `project/ArrayDeque.java`
- `project/test.java`

Compile and run:
- `javac project/*.java`
- `java project.test`

## Files
- `Implementation of the Deque ADT.pdf` — project slides + sample output
- `ArrayDeque.java` — circular-array deque implementation
- `test.java` — test driver that demonstrates expected behavior

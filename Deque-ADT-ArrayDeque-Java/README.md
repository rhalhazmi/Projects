# Implementation of the Deque ADT (ArrayDeque — Java)

## Overview
A Java implementation of the **Deque ADT (double-ended queue)** that supports inserting and removing elements from **both the front and the rear**. The deque is implemented using a **fixed-size circular array**, providing efficient operations and flexible usage. :contentReference[oaicite:0]{index=0}

## What a Deque Supports
A deque (double-ended queue) allows:
- Add to front
- Add to rear
- Remove from front
- Remove from rear :contentReference[oaicite:1]{index=1}

## Implementation Details
### Data structure
- Backed by an array `data[]`
- Uses two indices:
  - `f` = front index
  - `r` = rear index (next available slot)
- Tracks current element count with `size`
- Uses modulo arithmetic to wrap indices (circular behavior) :contentReference[oaicite:2]{index=2}

### Capacity behavior
- Default capacity = **1000**
- Supports custom capacity via constructor
- When full, insertion throws `IllegalStateException("Deque is full")` :contentReference[oaicite:3]{index=3} :contentReference[oaicite:4]{index=4}

### Empty behavior
- `removeFirst()` / `removeLast()` return `null` if empty
- `first()` / `last()` return `null` if empty :contentReference[oaicite:5]{index=5}

## Supported Operations
- `size()` → returns number of elements :contentReference[oaicite:6]{index=6}
- `isEmpty()` → checks if deque has no elements :contentReference[oaicite:7]{index=7}
- `isFull()` → checks if deque reached capacity :contentReference[oaicite:8]{index=8}
- `addFirst(e)` → insert at front (circular decrement of `f`) :contentReference[oaicite:9]{index=9}
- `addLast(e)` → insert at rear (circular increment of `r`) :contentReference[oaicite:10]{index=10}
- `removeFirst()` → remove from front (circular increment of `f`) :contentReference[oaicite:11]{index=11}
- `removeLast()` → remove from rear (circular decrement of `r`) :contentReference[oaicite:12]{index=12}
- `first()` → peek front without removing :contentReference[oaicite:13]{index=13}
- `last()` → peek rear without removing :contentReference[oaicite:14]{index=14}

## Test & Evaluation (Sample Run)
The provided test program validates:
- Empty checks and size at start
- Adding elements to the front (verifying `first()` and `last()`)
- Adding elements to the rear until full capacity
- Attempting to add when full (exception message)
- Removing from front and rear
- Checking status when one element remains
- Removing last element until empty
- Removing from an empty deque (returns `null`) :contentReference[oaicite:15]{index=15}

## How to Run
Project uses `package project;` in both classes, so files must be placed like this:

- `project/ArrayDeque.java`
- `project/test.java`

Compile and run:
- `javac project/*.java`
- `java project.test` :contentReference[oaicite:16]{index=16}

## Files
- `Implementation of the Deque ADT.pdf` — project slides + sample output :contentReference[oaicite:17]{index=17}
- `ArrayDeque.java` — circular-array deque implementation :contentReference[oaicite:18]{index=18}
- `test.java` — test driver that demonstrates expected behavior :contentReference[oaicite:19]{index=19}

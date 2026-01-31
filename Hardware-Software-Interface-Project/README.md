# Hardware & Software Interface Project — Logic Design + Computer Architecture Benchmarks

## Overview
A two-part project covering:
1) **Digital logic design**: constructing and simplifying a given logic circuit, generating its truth table, and implementing it using TTL chips in Logisim Evolution.  
2) **Computer organization & architecture**: comparing laptop hardware specifications and benchmark results to determine the best device for studying based on measured performance. :contentReference[oaicite:0]{index=0}

## Part 1 — Logical Digital Design (Logisim Evolution)
### Circuit construction
A specified logic circuit is constructed in **Logisim Evolution** and verified through simulation. :contentReference[oaicite:1]{index=1}

### Truth table
The truth table produced for the circuit shows:
- x=0, y=0 → F=1
- x=0, y=1 → F=1
- x=1, y=0 → F=1
- x=1, y=1 → F=1  
This indicates the output is always 1 for all input combinations. :contentReference[oaicite:2]{index=2}

### Boolean expression (SOP)
The Sum of Products (minterms) expression:
- f = X̅Y̅ + X̅Y + XY̅ + XY :contentReference[oaicite:3]{index=3}

### Simplification
The expression is minimized as:
- f = X̅(Y̅+Y) + X(Y̅+Y)
- f = X̅(1) + X(1)
- f = X̅ + X
- f = 1  
Final simplified result: **constant 1**. :contentReference[oaicite:4]{index=4}

### TTL chip implementation (Bonus)
The circuit is implemented using TTL chips in Logisim Evolution with:
- 2 × PIN_IN
- 1 × 7400 TTL chip
- 1 × 7408 TTL chip
- 1 × PIN_OUT + VCC + GND :contentReference[oaicite:5]{index=5}

## Part 2 — Organization & Architecture (Laptop Benchmark Comparison)
### Hardware/spec comparison
A comparison table summarizes each group member’s laptop:
- CPU model/topology (cores/threads), base/max frequency
- Cache sizes (L1/L2/L3)
- RAM size/type/frequency
- Operating system and motherboard/model info :contentReference[oaicite:6]{index=6}

### Benchmark results
Benchmarks include:
- Single-core: File Compression + PDF Renderer
- Multi-core: File Compression + PDF Renderer  
Scores and throughput are listed for each laptop. :contentReference[oaicite:7]{index=7}

### Best laptop (based on results)
Based on the benchmark comparison, the project concludes that the **Lenovo 82Y0** laptop achieved the highest single-core and multi-core results, making it the best choice for study workloads requiring strong multitasking and fast processing. :contentReference[oaicite:8]{index=8}

## What was learned (Reflection)
Key takeaways include time management, teamwork, understanding computer components, logic gates, and electrical/digital circuits. :contentReference[oaicite:9]{index=9}

## Files
- `Hardware and Software Interface Project.pdf` — full report (logic circuit tasks + benchmark comparison + reflection) :contentReference[oaicite:10]{index=10}
- `Main.circ` — Logisim Evolution circuit design file
- `Bonus.circ` — TTL-chip implementation circuit file

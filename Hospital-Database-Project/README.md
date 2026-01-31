# Hospital Database Project — Relational Design & SQL Implementation

## Overview
A relational database project that models core hospital operations and supports efficient storage, retrieval, and management of hospital data. The system focuses on backend database design and SQL implementation (no user interface), providing a foundation for hospital workflows such as patient registration, appointment scheduling, treatment tracking, and room management. :contentReference[oaicite:0]{index=0}

## Problem Statement
Hospitals manage large amounts of data for patients, doctors, appointments, treatments, and room allocations. Without an efficient system, data errors and delays can impact patient care and resource management. The objective is to design and implement a robust relational database that preserves data integrity, enables easy access, and supports hospital operations through reliable queries and updates. :contentReference[oaicite:1]{index=1}

## System Scope
Supported operations include:
- Registering and managing patient records
- Managing doctor records and specializations
- Scheduling and tracking appointments
- Recording treatments (diagnosis + medication)
- Managing room availability and assignments
- Running queries for reporting/decision support :contentReference[oaicite:2]{index=2}

## Database Design
### Entities
The database includes five main entities:
- **Patient** (PatientID, FirstName, LastName, Gender, DateOfBirth, RoomID)
- **Doctor** (DoctorID, FirstName, LastName, Specialization, Phone)
- **Room** (RoomID, RoomType, Floor, Capacity, Status)
- **Appointment** (AppointmentID, PatientID, DoctorID, AppointmentDate, Reason)
- **Treatment** (TreatmentID, PatientID, DoctorID, Diagnosis, Medication) :contentReference[oaicite:3]{index=3}

### Relationships (Business Rules)
- A patient can book one or more appointments with doctors.
- Every appointment links exactly one registered patient to one registered doctor.
- Treatments are provided by a doctor to a patient; every treatment must link to an existing patient and doctor.
- Rooms have availability status, capacity, and can be assigned to patients. :contentReference[oaicite:4]{index=4}

### Modeling & Diagrams
- ER modeling is represented using **Chen’s notation** and **UML**.
- The ER model is mapped into a relational schema.
- Normalization steps are applied to reduce redundancy and keep data consistent. :contentReference[oaicite:5]{index=5}

## Implementation (SQL)
### Schema and Tables
- Creates a database schema (hospital database).
- Creates relational tables with **primary keys** and **foreign keys** to enforce integrity.
- Inserts sample data into all tables.
- Includes DML operations: INSERT, SELECT, UPDATE, DELETE. :contentReference[oaicite:6]{index=6}

### Query Coverage
Queries include:
- Filters using **WHERE**
- Aggregation using **GROUP BY**
- Sorting using **ORDER BY**
- Nested queries using **subqueries**
- Multi-table retrieval using **JOIN**
- Group-level filtering using **HAVING** :contentReference[oaicite:7]{index=7}

## Testing
SQL scripts are validated through execution of:
- Table creation + constraints
- Sample data insertion
- Correctness of joins/subqueries
- Update and delete behavior with safe WHERE clauses
- Outputs for analytics-style queries (counts, grouping, ordering) :contentReference[oaicite:8]{index=8}

## Limitations
- Focused on core hospital modules; does not include billing, staff scheduling, or full medical history.
- Uses static sample data with limited rows (not large-scale real hospital volume).
- No authentication/role-based access control included (database-only scope). :contentReference[oaicite:9]{index=9}

## Future Improvements
- Expand the model for billing, prescriptions, staff assignments, and medical history.
- Add a GUI or migrate to a web application for easier staff interaction.
- Add validation rules, authentication, and role-based access control.
- Optimize for large datasets and higher concurrency. :contentReference[oaicite:10]{index=10}

## Files
- `Hospital Database Project.pdf` — full report (problem, ER/UML, relational schema, normalization, SQL scripts, and query outputs)

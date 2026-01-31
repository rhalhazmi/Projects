# Task Manager Program (Bash CLI)

A lightweight command-line **task manager** built using a single Bash script. Tasks are stored in plain text files and managed through a menu-based interface. The tool supports adding tasks with due dates, viewing pending tasks sorted by date, marking tasks as complete, counting pending/completed tasks, and displaying the current date/time. Version control with Git is used to track changes.

## Features
- Add tasks with a **due date**
- View **pending tasks** sorted by due date
- Mark a task as **complete** (moves it to completed tasks)
- Count **pending vs completed** tasks
- Show **current date and time**
- Basic error handling for invalid inputs and empty task lists
- Motivational messages when tasks are completed

## Design & Implementation
- **Language:** Bash (single script: `ToDoList.sh`)
- **Storage:**
  - `pending_tasks.txt` — incomplete tasks
  - `completed_tasks.txt` — completed tasks
- **Utilities used:** `sort`, `sed`, `grep`, `nl`, `wc`
- **Workflow:** changes are committed to Git for tracking and collaboration

## Testing
Interactive functional testing covered:
- Adding tasks with different due dates
- Viewing sorted task lists
- Completing tasks and validating file movement
- Counting tasks after updates
- Date/time display accuracy
- Error handling for invalid function/task numbers
- Behavior with empty `.txt` files (no tasks)

## Limitations
- No support for editing tasks once added
- Plain-text storage (no advanced data structures)
- No graphical user interface (CLI only)

## Future Improvements
- Task prioritization
- Search and filtering for large task lists
- Calendar integration
- Better CLI UX (e.g., color-coded output, customizable motivational messages)

## Files
- `Task Manager Program Project.pdf` — full project report
- `ToDoList.sh` — Bash task manager program (main script)
- `pending_tasks.txt` — created/updated at runtime to store pending tasks
- `completed_tasks.txt` — created/updated at runtime to store completed tasks


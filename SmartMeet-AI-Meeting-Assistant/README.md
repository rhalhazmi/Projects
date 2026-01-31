# SmartMeet — AI-Powered Meeting Assistant (Requirements & Design)

## Overview
SmartMeet is an AI-powered meeting assistant concept designed to **record meetings**, **highlight important points automatically**, detect **problems mentioned in the discussion**, and generate **suggested solutions** and **improvements for future meetings**. The system also generates a structured meeting summary and supports saving/deleting meetings for future access. :contentReference[oaicite:0]{index=0}

## Business Purpose
An application that records meetings, highlights key points automatically, and provides suggestions to improve meeting management and productivity. :contentReference[oaicite:1]{index=1}

## Business Requirements
- Record the meeting
- Highlight important points
- Identify problems mentioned in the meeting
- Suggest solutions for the problems
- Suggest improvements for meeting management
- Provide a meeting summary
- Save Meeting ID for future access
- Delete meeting :contentReference[oaicite:2]{index=2}

## Key Stakeholders
- Users: use the app regularly, provide feedback, report issues
- Developers: build and maintain the app, improve voice analysis accuracy, fix problems
- Technical team: handle technical issues
- Investors: provide funding :contentReference[oaicite:3]{index=3}

## Software Type
- AI-powered meeting assistant application (similar to real-time transcription + summaries)
- Database Management System (DBMS)
- Authentication & authorization software (example mentioned: Firebase Authentication) :contentReference[oaicite:4]{index=4}

## Functional Requirements (FR)
- FR-001: User Registration (name, email, phone, password, optional student ID)
- FR-002: User Login (authenticate with email/username + password)
- FR-003: Record the meeting (audio/video, meeting ID)
- FR-004: Highlight important points (NLP-based key idea detection + timestamps)
- FR-005: Problem identification (list problems discussed for a given meeting ID)
- FR-006: Solution suggestion (suggest solutions for identified problems)
- FR-007: Meeting improvement suggestions (AI recommendations + templates)
- FR-008: Meeting summary (title/date/participants, key points, decisions, action items, stats; export PDF/text/email)
- FR-009: Save Meeting ID for future access (store mapping in user profile)
- FR-010: Delete meeting (delete recording/transcript/summary; authorization checks) :contentReference[oaicite:5]{index=5}

## Non-Functional Requirements (NFR)
- Performance:
  - Generate summary within **2 minutes** after meeting ends
  - Show key points and suggestions in **< 5 seconds** when requested
- Accuracy:
  - Identify main discussion points with **≥ 90% accuracy** compared to human evaluation
- Security & Privacy:
  - Encrypt stored recordings and files
  - Do not keep original recordings after summary generation unless user agrees
  - Support permanent data deletion on request
- Usability:
  - Available in **Arabic and English** :contentReference[oaicite:6]{index=6}

## System Requirements (High Level)
- User Interface:
  - Web-based UI for recording, live transcription, key points with timestamps, solutions, and summaries
  - Settings for language, keyword preferences, and notifications
  - Designed to work on computer and mobile
- Software Interface:
  - Database for recordings/summaries/key points
  - Authentication API for secure login (email/password)
- Hardware Interface:
  - Phones/tablets/laptops + server infrastructure (example: AWS/Firebase) + internet connectivity
- Communication:
  - HTTPS, SMTP for email :contentReference[oaicite:7]{index=7}

## Diagrams Included (Documentation)
- Use case diagram (user + AI interactions)
- Context diagram (stakeholders and external services)
- Software architectural diagram using **Pipe-and-Filter** style for meeting analysis/highlighting flow :contentReference[oaicite:8]{index=8}

## Files
- `SmartMeet project.pdf` — requirements + modeling + architecture documentation

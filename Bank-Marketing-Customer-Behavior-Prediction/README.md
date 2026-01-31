# Customer Behavior Prediction in Bank Marketing — SVM (SMO) in Weka

## Overview
A machine learning project that predicts whether a bank customer will respond “yes” or “no” to a marketing offer using the Bank Marketing Dataset (Portuguese banking institution). The workflow focuses on building a classification model to help a bank target customers more likely to accept an offer, reducing time and marketing cost.

## Goal
Build a predictive model that helps the bank understand customer behavior and prioritize outreach toward customers more likely to accept the offer.

## Dataset
- Source: UCI Machine Learning Repository — Bank Marketing Dataset
- Size: 45,211 instances
- Attributes: 13 (after cleaning)
- Target: `y` (term deposit subscription: yes/no)
- Examples of features: age, job, marital, education, balance, housing, loan, poutcome, pdays, campaign, previous

## Data Preparation
- Downloaded CSV dataset
- Removed unnecessary columns: duration, contact, day, default
- Saved into Excel and converted to `.arff` format using Weka
- Applied normalization

## Algorithm Used
### SMO (Sequential Minimal Optimization) — SVM training in Weka
- SMO is used to train a Support Vector Machine by finding a separating boundary (hyperplane) between the two classes (“yes” vs “no”).
- Multiple algorithms were tested; SMO produced the best results.

## Evaluation & Results
Two validation methods were used:

### 1) 10-Fold Cross-Validation
- Accuracy: 89.29%
- Correct predictions: 40,367
- Incorrect predictions: 4,844
- Confusion matrix highlights:
  - 39,389 “No” predicted correctly
  - 978 “Yes” predicted correctly
- Observation: strong overall performance but weaker prediction on the minority “Yes” class.

### 2) 70/30 Percentage Split
- Accuracy: 88.93%
- Correct predictions: 12,062
- Incorrect predictions: 1,501
- Confusion matrix highlights:
  - 11,770 “No” predicted correctly
  - 292 “Yes” predicted correctly
- Observation: similar behavior — better at predicting “No” than “Yes”.

### Visualization (Weka Histogram)
Weka’s histogram shows higher confidence and volume in “No” predictions and fewer/less confident “Yes” predictions, reflecting class imbalance.

## Challenges Faced
- SMO runtime is high, especially during cross-validation, due to the large dataset (~45k rows).
- Class imbalance causes the model to predict “No” more often than “Yes”, reducing minority-class performance.

## Improving the Model (Resample Technique)
To address imbalance, Weka’s resample filter (bias = 1) was applied to balance the class distribution, then SMO was re-run:
- “Yes” recall improved from 0.180 to 0.489
- “Yes” F-measure improved from 0.280 to 0.592
- Overall accuracy dropped from ~89% to ~66%, which is expected when prioritizing minority-class detection.

## Future Work
- Try lightweight algorithms (e.g., Logistic Regression) for large datasets
- Test other balancing methods (e.g., SMOTE)
- Apply feature selection to reduce dimensionality and improve efficiency
- Explore ensemble methods for higher accuracy

## Files
- `Customer Behavior prediction in bank marketing.pdf` — full report (dataset, preprocessing, SMO model, validation results, resampling improvement, conclusions)

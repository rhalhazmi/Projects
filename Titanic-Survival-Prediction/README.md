# Titanic Passenger Dataset Analysis — EDA + Survival Prediction Models

## Overview
A data analysis and machine learning project that explores the Titanic passenger dataset and builds predictive models to estimate the likelihood of survival. The workflow covers exploratory data analysis (EDA), data cleaning, feature engineering, model training, and performance comparison across multiple classifiers. :contentReference[oaicite:0]{index=0}

## Objectives
- Perform exploratory data analysis to uncover survival patterns
- Preprocess and clean the dataset for modeling
- Build machine learning models to predict survival
- Evaluate model performance and compare results :contentReference[oaicite:1]{index=1}

## Dataset
- Dataset size: **891 rows** and **12 columns**
- Target label: `Survived`
- Key features:
  - `Pclass`, `Sex`, `Age`, `SibSp`, `Parch`, `Fare`, `Embarked`
  - Other columns in the raw data include `Name`, `Ticket`, `Cabin`, `PassengerId` :contentReference[oaicite:2]{index=2}

## Exploratory Data Analysis (EDA)
### Survival distribution
- **38.4%** of passengers survived. :contentReference[oaicite:3]{index=3}

### Missing data handling
- `Age`: **177** missing values → filled using **median imputation**
- `Cabin`: **687** missing values → dropped due to high missingness
- `Embarked`: **2** missing values → filled using the **mode** :contentReference[oaicite:4]{index=4}

### Feature insights
- `Pclass` shows a strong relationship with survival (lower class passengers had lower survival rates).
- `Fare` is right-skewed, with most fares below 50. :contentReference[oaicite:5]{index=5}

### Bivariate analysis
- Scatterplots and correlation analysis highlight `Pclass`, `Age`, and `Fare` as strong predictors of survival. :contentReference[oaicite:6]{index=6}

## Feature Engineering & Preprocessing
- Standardized numerical features (`Age`, `Fare`) using **StandardScaler**
- Encoded categorical variables:
  - `Sex` using label encoding
  - `Embarked` using one-hot encoding (dummy variables)
- Dropped irrelevant columns: `Name`, `Ticket`, `PassengerId` :contentReference[oaicite:7]{index=7}

## Modeling
### Models trained
- Logistic Regression (baseline)
- Support Vector Machine (SVM) with RBF kernel
- k-Nearest Neighbors (k = 5)
- Decision Tree
- Random Forest (100 estimators)
- Naive Bayes (Gaussian) :contentReference[oaicite:8]{index=8}

### Evaluation metrics
- Accuracy
- Precision
- Recall
- F1-score :contentReference[oaicite:9]{index=9}

## Results (Model Comparison)
| Model | Accuracy | Precision | Recall | F1-Score |
|------|----------|-----------|--------|----------|
| Logistic Regression | 80.1% | 77.3% | 72.5% | 74.8% |
| SVM | 78.5% | 75.1% | 70.2% | 72.5% |
| KNN | 77.3% | 72.8% | 69.3% | 71.0% |
| Decision Tree | 76.4% | 73.2% | 68.7% | 70.9% |
| Random Forest | 82.7% | 80.5% | 76.8% | 78.6% |
| Naive Bayes | 72.9% | 70.4% | 65.2% | 67.7% | :contentReference[oaicite:10]{index=10}

### Best model
- **Random Forest** achieved the highest performance across metrics, indicating strong handling of feature interactions and reduced overfitting compared to simpler models. :contentReference[oaicite:11]{index=11}

## Key Insights
- Passenger class (`Pclass`), age (`Age`), and fare (`Fare`) are critical factors in survival prediction.
- Careful handling of missing values (especially `Age` and `Cabin`) is important to reduce bias. :contentReference[oaicite:12]{index=12}

## Files
- `Titanic Passenger Dataset Analysis report.pdf` — full project report (EDA, preprocessing, modeling, results)
- `Titanic Passenger Dataset Analysis code.ipynb` — notebook implementation (data cleaning, feature engineering, training, evaluation)

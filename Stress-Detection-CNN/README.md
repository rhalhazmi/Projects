# Stress Detection Using Face Analysis (CNN)

Built a binary stress classifier from facial expressions by re-labeling FER-2013 into **Stress** (angry, disgust, fear) vs **No-Stress** (happy, neutral). Trained a CNN with data augmentation and evaluated the model on a separate test set.

## Evaluation (Test Set)
- Accuracy: 0.7894 (78.94%)
- Precision: 0.7738
- Recall: 0.6880
- F1-score: 0.7284
- ROC-AUC: 0.8783
- Confusion Matrix: computed using true labels vs predicted labels

## Tech Stack
Python, TensorFlow/Keras, NumPy, Pandas, Matplotlib, scikit-learn

## Files
- `ML_project_code.ipynb` — training + evaluation notebook
- `ML_project_report.pdf` — full project report


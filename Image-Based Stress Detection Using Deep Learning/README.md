# Stress Detection CNN (FER-2013) — Binary Classification

## Overview
A deep learning pipeline for **binary stress detection from facial expressions** using a **Convolutional Neural Network (CNN)**. Facial images are classified into:
- **Stress**: angry, disgust, fear  
- **No Stress**: happy, neutral  

This design targets real-time / near real-time prediction for use in wellness monitoring and stress-awareness applications.

## Problem Definition
Emotion recognition is often multi-class, but stress detection is more useful as a **binary decision** in practical monitoring systems. The dataset is regrouped to create clearer boundaries between the two classes.

### Why “sad” and “surprise” were excluded
- **Sad** can appear in many contexts that are not stress-related.
- **Surprise** can be positive or negative (pleasant vs shock/fear-like).
Including them can confuse the stress vs no-stress boundary.

## Dataset
- **Source**: FER-2013
- **Input format**: images resized to **48×48** and converted to **grayscale**
- **Classes**:
  - `stress` (angry, disgust, fear)
  - `no_stress` (happy, neutral)
- **Label mapping**:
  - `no_stress = 0`
  - `stress = 1`

## Pipeline Summary
### 1) Data acquisition
Dataset is downloaded via the **Kaggle API**, then extracted and prepared.

### 2) Data restructuring
A binary folder structure is created for training/testing:
- `train/stress`, `train/no_stress`
- `test/stress`, `test/no_stress`

Images are copied into the new structure based on their original emotion folders.

### 3) Preprocessing + augmentation
Implemented using **Keras ImageDataGenerator**:
- Normalization: `rescale=1./255`
- Training augmentation:
  - rotation_range = 15
  - width_shift_range = 0.1
  - height_shift_range = 0.1
  - horizontal_flip = True
- Validation split: 20% of the training set

## Model Architecture (CNN)
A Sequential CNN for binary classification:
- Conv2D(32, 3×3, ReLU, padding="same") → MaxPool(2×2)
- Conv2D(64, 3×3, ReLU, padding="same") → MaxPool(2×2)
- Conv2D(128, 3×3, ReLU, padding="same") → MaxPool(2×2)
- Flatten → Dense(128, ReLU) → Dropout(0.5)
- Dense(1, Sigmoid)

Output interpretation:
- `p > 0.5` → Stress
- `p ≤ 0.5` → No Stress

**Training setup**
- Optimizer: Adam
- Loss: Binary cross-entropy
- Metric: Accuracy
- Epochs: 20

## Evaluation (Test Set Results)
Predicted probabilities are thresholded at 0.5 to produce class labels, then evaluated using standard classification metrics:

- **Accuracy**: 0.7894 (78.94%)
- **Precision**: 0.7738
- **Recall**: 0.6880
- **F1-score**: 0.7284
- **ROC AUC**: 0.8783
- **Confusion Matrix**: computed using true labels vs predicted labels

## Error Analysis (Qualitative)
The report includes examples of:
- Misclassified stress → no_stress
- Misclassified no_stress → stress
- Correct predictions for both classes

## Comparison (Earlier Phase vs Current System)
An earlier video-based approach (key-frame extraction + MobileNetV2 transfer learning) achieved ~68% validation accuracy. The image-based CNN approach reaches ~79.4% accuracy with lower computational cost and better suitability for standard hardware.

## Notes on Practical Use
- This is **stress inference from grouped emotions**, not a medical diagnosis.
- Performance can be affected by lighting, pose, occlusion (glasses/hair), demographics, and dataset label noise.

## Limitations
- Stress labels are approximated through grouped emotions rather than direct clinical stress annotations.
- FER-2013 includes noisy labels and real-world variability that can reduce generalization.
- Some emotion overlap can confuse boundaries (e.g., anger/disgust or fear-like expressions).

## Future Improvements
- Use datasets with more realistic stress/anxiety labels and more diverse participants.
- Tune the decision threshold (not only 0.5) to improve recall when missing stress cases is costly.
- Test lightweight transfer learning backbones for higher accuracy while keeping real-time feasibility.

## Files
- `ML_project_code.ipynb` — training + evaluation notebook
- `ML_project_report.pdf` — full project report

# InteriorVision: Classification and Generation of Interior Design Images

## Overview

InteriorVision is a deep learning project that combines image classification and image generation for interior design images.

The project consists of two complementary tracks:

* **Discriminative Track:** Multi-task CNN based on ResNet50 for room type and interior style classification.
* **Generative Track:** Stable Diffusion with Low-Rank Adaptation (LoRA) for text-to-image interior design generation.

The objective is to build a unified system capable of both understanding interior design images and generating new interior scenes from textual descriptions.

---

## Dataset

Dataset: **Interior Design Images & Metadata (Kaggle)**

### Room Categories

* Bathroom
* Bedroom
* Kitchen
* Living Room

### Design Styles

* Boho
* Industrial
* Minimalist
* Modern
* Scandinavian

### Dataset Statistics

| Split      | Before Cleaning | After Cleaning |
| ---------- | --------------- | -------------- |
| Train      | 2,648           | 2,556          |
| Validation | 663             | 639            |
| Test       | 828             | 805            |
| Total      | 4,139           | 4,000          |

---

## Data Preprocessing

The preprocessing pipeline included:

* Dataset inspection and validation
* Image path correction
* Removal of missing or invalid images
* Automatic text prompt generation from metadata
* RGB conversion
* Image resizing
* Normalization
* Cleaned CSV generation for reproducible experiments

Example generated prompt:

```text
Modern bedroom interior
```

---

# CNN Classification Track

## Baseline Model

* ResNet50 (Transfer Learning)
* Multi-task classification
* Room type prediction
* Interior style prediction

## Improvements

* Data Augmentation

  * Random Horizontal Flip
  * Random Rotation
  * Color Jitter
  * Random Resized Crop
* Full Backbone Fine-Tuning
* Dropout Regularization
* Batch Normalization
* Label Smoothing
* Learning Rate Scheduling
* Weight Decay

---

## CNN Results

### Room Type Classification

| Model    | Accuracy |
| -------- | -------- |
| Baseline | 68%      |
| Improved | 74%      |

### Style Classification

| Model    | Accuracy |
| -------- | -------- |
| Baseline | 54%      |
| Improved | 59%      |

---

# Stable Diffusion Generation Track

## Baseline Model

* Stable Diffusion
* Text-to-image generation
* Interior design prompt conditioning

## LoRA Improvements

### Improvement 1

Expanded LoRA rank:

* r = 16
* alpha = 32

### Improvement 2

Cosine Annealing Learning Rate Scheduler

### Improvement 3

Extended training budget:

* 5000 training steps

### Improvement 4

Enhanced prompt engineering

Baseline prompt:

```text
Modern bedroom interior
```

Improved prompt:

```text
A high quality photo of a modern bedroom interior design, detailed, realistic
```

### Improvement 5

Expanded attention module targeting:

```python
["to_q", "to_v", "to_k", "to_out.0"]
```

---

## Evaluation

The generative model was evaluated using:

* CLIP Score
* Visual inspection
* CNN-based validation of generated images

### Average CLIP Scores

| Model                       | Average CLIP Score |
| --------------------------- | ------------------ |
| Base Stable Diffusion       | 0.3231             |
| Fine-Tuned Stable Diffusion | 0.3170             |

---

## Technologies Used

* Python
* PyTorch
* TorchVision
* Hugging Face Diffusers
* Transformers
* PEFT (LoRA)
* Stable Diffusion
* ResNet50
* NumPy
* Pandas
* Matplotlib
* Scikit-learn
* Google Colab

---

## Project Structure

```text
├── DL_Project.ipynb
├── report.pdf
├── dataset/
├── generated_images/
├── results/
└── README.md
```

---

## Authors

* Retaj Alhazmi
* Maria Mamdooh
* Ghala Shahir
* Ghadeer Sami
* Rawan Qader

Umm Al-Qura University

Department of Artificial Intelligence

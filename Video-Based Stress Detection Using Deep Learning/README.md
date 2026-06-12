# Datasets

## 1. DAiSEE Dataset

### Full Name
Dataset for Affective States in E-Environments (DAiSEE)

### Description
DAiSEE is a video-based affective computing dataset designed to analyze students' emotional and engagement states during online learning sessions.

### Affective States Available
- Engagement
- Boredom
- Confusion
- Frustration

### Stress Label Used in This Project
The Frustration label was used as an indicator of stress.

#### Original Labels
| Label | Meaning |
|---------|----------|
| 0 | Very Low Frustration |
| 1 | Low Frustration |
| 2 | High Frustration |
| 3 | Very High Frustration |

### Binary Stress Mapping

#### CNN+LSTM Experiment
| Original Label | Class |
|---------------|--------|
| 0 | Not Stressed |
| 1 | Not Stressed |
| 2 | Stressed |
| 3 | Stressed |

#### MATLAB-VGG16 Experiment
| Original Label | Class |
|---------------|--------|
| 0 | Not Stressed |
| 1 | Stressed |
| 2 | Stressed |
| 3 | Stressed |

### Data Type
- Video Clips
- RGB Frames

### Preprocessing
- Video Loading
- Frame Extraction
- Face Detection
- Resize to 224×224
- RGB Conversion
- Normalization

### Experiments Using DAiSEE
- CNN + LSTM
- MATLAB-Based VGG16

---

## 2. RAVDESS Dataset

### Full Name
Ryerson Audio-Visual Database of Emotional Speech and Song (RAVDESS)

### Description
RAVDESS is a widely used audio-visual emotion recognition dataset containing professional actors performing emotional expressions under controlled recording conditions.

### Participants
- 24 Professional Actors
- 12 Male
- 12 Female

### Emotions Available
- Neutral
- Calm
- Happy
- Sad
- Angry
- Fearful
- Disgust
- Surprise

### Stress Mapping Used in This Project

#### Stressed
- Angry
- Fearful
- Sad

#### Not Stressed
- Calm
- Happy

#### Excluded
- Neutral
- Disgust
- Surprise

### Dataset Statistics
- Total Videos Used: 1920
- Training Videos: 1536
- Testing Videos: 384

### Frame Configuration

#### Final VGG16 Solution
- 10 Frames per Video
- 224×224 Resolution

#### MobileNetV2 + GRU
- 15 Frames per Video
- 128×128 Resolution

### Preprocessing
- OpenCV Video Loading
- Frame Extraction
- Resize
- RGB Conversion
- Normalization

### Experiments Using RAVDESS
- MobileNetV2 + GRU
- Final VGG16 Solution

package Model.WorkoutManagement;

public class HypertrophyExercise implements ExerciseIntensitySetter {
    @Override
    public int setNSets() {
        return 4; // 4 sets for hypertrophy
    }

    @Override
    public int setNReps() {
        return 8; // 8-12 reps for hypertrophy
    }
}
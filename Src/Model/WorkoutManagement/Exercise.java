package Model.WorkoutManagement;

public class Exercise {
    private int id;
    private String name;
    private String description;
    private String equipment;
    private int n_sets;
    private int n_reps;
    private int weight;

    private ExerciseIntensitySetter strategy;


    // (4Plan)
    public Exercise(int id,String name, String description, String equipment, ExerciseIntensitySetter strategy){
        this.id = id;
        this.name=name;
        this.description=description;
        this.equipment=equipment;
        this.n_sets=strategy.setNSets();
        this.n_reps=strategy.setNReps();
       // this.weight = null;   //  essendo weight un int invece che integer è settato di base=0
        this.strategy=strategy;
    }
    // (4Record)
    public Exercise(int id ,String name,String description, String equipment, int n_sets, int n_reps, int weight,ExerciseIntensitySetter strategy) {
        this.id = id;
        this.name = name;
        this.equipment = equipment;
        this.n_sets = n_sets;
        this.n_reps = n_reps;
        this.weight = weight;
        this.description = description;
        this.strategy = strategy;
    }
    public void setStrategy(ExerciseIntensitySetter strategy){
        this.strategy=strategy;
    }

    public void configureIntensity(){
        this.n_sets=strategy.setNSets();
        this.n_reps=strategy.setNReps();

    }


    public int getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public int getN_sets() {
        return n_sets;
    }

    public void setN_sets(int n_sets) {
        this.n_sets = n_sets;
    }

    public int getN_reps() {
        return n_reps;
    }

    public void setN_reps(int n_reps) {
        this.n_reps = n_reps;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public ExerciseIntensitySetter getStrategy() {
        return strategy;
    }
}

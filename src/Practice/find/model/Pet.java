package Practice.find.model;

public class Pet {
    private String name;
    private int reward;

    public Pet() {
    }

    public Pet(String name, int reward) {
        this.name = name;
        this.reward = reward;
    }

    public int stray(){
        return 0;
    }


    public int run(){
        return 0;
    }

    public int flying(){
        return 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }
}

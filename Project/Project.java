
public class Project{
    private String name;
    private String description;
    private double initialCost;
    

    //Constructors
    public Project(){
        this.name = "blank";
        this.description = "blank";
        this.initialCost = 100;
    }

    public Project(String name){
        this.name = name;
        this.description = "blank";
        this.initialCost = 100;
    }

    public Project(String name, String description){
        this.name = name;
        this.description = description;
        this.initialCost = 100;
    }

    public Project(String name, String description, double initialCost){
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setInitialCost(double initialCost){
        this.initialCost = initialCost;
    }
    //Getters
    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public double getInitialCost(){
        return initialCost;
    }

    //Methods
    public String elevatorPitch(){
        return name +" (" + initialCost + "): " + description;
    }
}


import java.util.ArrayList;

public class Portfolio{
    private ArrayList<Project> projects = new ArrayList<Project>();

    //Setters
    public void addProjects(Project project){
        this.projects.add(project);
    }

    //Getters
    public ArrayList<Project> getProjects(){
        return projects;
    }

    //Methods
    public double getPortfolioCost(){
        double cost = 0;

        for(Project project: projects){
            cost += project.getInitialCost();
        }

        return cost;
    }

    public void showPortfolio(){
        for(Project project: projects){
            System.out.println(project.elevatorPitch());
        }

        System.out.println("Total Cost: " + getPortfolioCost());
    }
}
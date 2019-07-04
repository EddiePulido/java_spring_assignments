
public class ProjectTest{
    public static void main(String[] args){
        Project project1 = new Project();
        Project project2 = new Project("name2");
        Project project3 = new Project("name3", "description3");
        Project project4 = new Project("name4", "description4",500);

        Portfolio portfolio = new Portfolio();

        portfolio.addProjects(project1);
        portfolio.addProjects(project2);
        portfolio.addProjects(project3);
        portfolio.addProjects(project4);

        portfolio.showPortfolio();

        project1.setName("name1");
        project2.setDescription("Description2");
        project3.setInitialCost(300);
        project4.setName("TestName");

        portfolio.showPortfolio();
    }
}

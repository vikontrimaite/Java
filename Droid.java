// https://www.codecademy.com/courses/learn-java/projects/build-a-droid
// Build A Droid
// dorid can perfom a task and shows its battery level

public class Droid {
  String name;
  int batteryLevel;

  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }

  public void performTask(String task) {
    System.out.println("Currently " + name + " is performing this task: " + task);
    batteryLevel = batteryLevel - 10;
    System.out.println("The new battery level is " + batteryLevel);
  } 

  public void energyReport() {
    System.out.println("The battery level is " + batteryLevel);
  }

  public String toString() {
    return "New droid's name is " + name;
  }

   public static void main(String[] args) {
     Droid codey = new Droid("Codey");
     Droid meliss = new Droid("Meliss");
     System.out.println(codey);
     System.out.println(meliss);

codey.energyReport();
codey.performTask("planting");
codey.performTask("singing");
codey.performTask("learning");
codey.energyReport();
meliss.energyReport();
meliss.performTask("planting");

   }
}
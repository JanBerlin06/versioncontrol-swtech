public class Person {
    
    String name = " ";
    int alter = 0;

    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAlter() {
        return alter;
    }
    public void setAlter(int alter) {
        this.alter = alter;
    }
    @Override
    public String toString() {
        return "Person [name: " + name + ", alter: " + alter + "]";
    }

    
}

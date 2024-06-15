public class Person {
    
    String name = " ";
    int alter = 0;
    String geschlecht = "";



    public Person(String name, int alter, String geschlecht) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
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



    public String getGeschlecht() {
        return geschlecht;
    }



    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }
  


    @Override
    public String toString() {
        return "Person [name = " + name + ", alter = " + alter + ", Geschlecht = " + geschlecht + "]";
    }
    
}

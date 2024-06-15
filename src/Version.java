public class Version {
    
    double version = 0;
    String name = "meine APP";



    public Version(double version, String name) {
        this.version = version;
        this.name = name;
    }


    public double getVersion() {
        return version;
    }
    public void setVersion(float version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Objekt Version [version: " + version + ", name: " + name + "]";
    }

    
    
}

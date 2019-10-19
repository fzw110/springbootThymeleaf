package springbootwei.com.pojo;

public class Myself {
    private int id;
    private String  name;
    private  int age;
    private  String adress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Myself(){
        super();
    }

    @Override
    public String toString() {
        return "Myself{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                '}';
    }
}

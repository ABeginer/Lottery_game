package ThirdProblem;

public class Person {
    private String name, address;

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String getString(){
        String combine = getName() + getAddress();
        return combine;

    }
    

}

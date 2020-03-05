package ie.gmit;

public class Passenger {
    private String title = "";
    private String name = "";
    private String ID = "";
    private String phone = "";
    private int age = 0;


    public Passenger(String title, String name, String id, String phone, int age) {
        setTitle(title);
        setName(name);
        setID(id);
        setPhone(phone);
        setAge(age);
    }

    public void setTitle(String title) {
        if (title == "Mr" || title == "Mrs" || title == "Ms")
            this.title = title;
        else
            throw new IllegalArgumentException("Invalid title provided");
    }

    public void setName(String name) {
        if(name.length() < 3)
            throw new IllegalArgumentException("Name must have a minimum of 3 characters");
        else
            this.name = name;
    }

    public void setID(String id) {
        if(id.length() < 10)
            throw new IllegalArgumentException("ID must have a minimum of 10 characters");
        else
            this.ID = id;
    }

    public void setPhone(String phone) {
        if(phone.length() < 10)
            throw new IllegalArgumentException("Phone number must have a minimum of 10 characters");
        else
            this.phone = phone;
    }

    public void setAge(int age) {
        if(age <= 16)
            throw new IllegalArgumentException("Passenger must be older than 16 to fly");
        else
            this.age = age;
    }

    public String getTitle() { return title; }

    public String getName() { return name; }

    public String getID() { return ID; }

    public String getPhone() { return phone; }

    public int getAge() { return age; }
}

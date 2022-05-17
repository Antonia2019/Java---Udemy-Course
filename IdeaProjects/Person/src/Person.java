public class Person {

    private String firstName;
    private String lastName;
    private int age;


    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int a) {

        if (a < 0 || a > 100){
            age = 0;
        } else {
        age = a;
        }
    }

    public boolean isTeen(){
        return age > 12 && age < 20;
    }

    public String getFullName(){
        String empty = "";
        if(firstName.isEmpty() && lastName.isEmpty()){
            return empty;
        }else if(firstName.isEmpty() && !lastName.isEmpty()){
            return lastName;
        }else if(!firstName.isEmpty() && lastName.isEmpty()){
            return firstName;
        }
        return (firstName+" "+lastName);
    }

}

package _DONE.FIXME_GetFullName;

public class Dinglemouse {

    private String firstName;
    private String lastName;

    Dinglemouse(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        if ((this.firstName.equals("")) || (this.lastName.equals("")))
            return firstName + lastName;
        return firstName + " " + lastName;
    }

}
class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        } else {
            this.firstName = "";
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        } else {
            this.lastName = "";
        }
    }

    public String getFullName() {


        if (lastName.length() > 0 && firstName.length() > 0) {
            return firstName + " " + lastName;
        } else if (lastName.length() > 0 && firstName.length() == 0) {
            return lastName;
        } else if (lastName.length() == 0 && firstName.length() > 0) {
            return firstName;
        } else {
            return "Unknown";
        }

    }
}


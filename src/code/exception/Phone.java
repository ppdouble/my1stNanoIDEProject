package code.exception;

public class Phone {
    private final String phoneType;
    private final String phoneNumber;

    public Phone (String phoneType, String phoneNumber) {
        super();
        if (null == phoneType || null == phoneNumber) {
            throw new IllegalArgumentException("The type and number cannot be null");
        }
        this.phoneType = phoneType;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneType () {
        return phoneType;
    }

    public String getPhoneNumber () {
        return phoneNumber;
    }

    @Override
    public String toString () {
        return phoneType + " " + phoneNumber;
    }
}

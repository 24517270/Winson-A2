public class Visitor extends Person {
    private final String membershipID;
    private final String membershipType;

    @Override
    public String toString() {
        return "Visitor{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", age=" + getAge() +
                ", membershipID='" + membershipID + '\'' +
                ", membershipType='" + membershipType + '\'' +
                '}';
    }

    // Default constructor
    public Visitor() {
        super();
        this.membershipID = "Unknown";
        this.membershipType = "Unknown";
    }

    // Constructor with name only
    public Visitor(String name) {
        super(name, "Unknown", 0);
        this.membershipID = "Unknown";
        this.membershipType = "Unknown";
    }

    // Constructor with all parameters
    public Visitor(String name, String address, int age, String membershipID, String membershipType) {
        super(name, address, age);
        this.membershipID = membershipID;
        this.membershipType = membershipType;
    }

    // Getters for membershipID and membershipType
    public String getMembershipID() {
        return membershipID;
    }

    public String getMembershipType() {
        return membershipType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Visitor)) return false;
        Visitor visitor = (Visitor) o;
        return super.equals(visitor) &&
                membershipID.equals(visitor.membershipID) &&
                membershipType.equals(visitor.membershipType);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + membershipID.hashCode();
        result = 31 * result + membershipType.hashCode();
        return result;
    }
}
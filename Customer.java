import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Customer {
    private Long id;
    private String name;
    private String mobileNumber;
    private Date birthdate;
    private Double averageSpendAmount;
    private Double totalAmount;
    private Date dateEnrolled;
    private Double rating;

    // Default constructor
    public Customer() {
    }

    // Parameterized constructor
    public Customer(Long id, String name, String mobileNumber, Date birthdate,
                    Double averageSpendAmount, Double totalAmount, Date dateEnrolled, Double rating) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.birthdate = birthdate;
        this.averageSpendAmount = averageSpendAmount;
        this.totalAmount = totalAmount;
        this.dateEnrolled = dateEnrolled;
        this.rating = rating;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public Date getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    public Double getAverageSpendAmount() {
        return averageSpendAmount;
    }
    public void setAverageSpendAmount(Double averageSpendAmount) {
        this.averageSpendAmount = averageSpendAmount;
    }
    public Double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public Date getDateEnrolled() {
        return dateEnrolled;
    }
    public void setDateEnrolled(Date dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }
    public Double getRating() {
        return rating;
    }
    public void setRating(Double rating) {
        this.rating = rating;
    }

    // Override equals() to compare all fields
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Customer)) return false;
        Customer c = (Customer) obj;
        return Objects.equals(id, c.id) &&
               Objects.equals(name, c.name) &&
               Objects.equals(mobileNumber, c.mobileNumber) &&
               Objects.equals(birthdate, c.birthdate) &&
               Objects.equals(averageSpendAmount, c.averageSpendAmount) &&
               Objects.equals(totalAmount, c.totalAmount) &&
               Objects.equals(dateEnrolled, c.dateEnrolled) &&
               Objects.equals(rating, c.rating);
    }

    // Custom print method
    public void printDetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Id:" + id);
        System.out.println("Name:" + name);
        System.out.println("Mobile Number:" + mobileNumber);
        System.out.println("Date of Birth:" + sdf.format(birthdate));
        System.out.println("Average spent amount:" + averageSpendAmount);
        System.out.println("Total amount:" + totalAmount);
        System.out.println("Date Enrolled:" + sdf.format(dateEnrolled));
        System.out.println("Rating:" + rating);
    }
}

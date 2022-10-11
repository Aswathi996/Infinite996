

import java.util.Scanner;

class Person {
    String Name;
    String DateOfBirth;
    String Gender;
    String MobileNumber;
    String BloodGroup;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public String getBloodGroup() {
        return BloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        BloodGroup = bloodGroup;
    }

}

class Doner extends Person {
    String BloodBankName;
    String DonorType;
    String DonationDate;

    public String getBloodBankName() {
        return BloodBankName;
    }

    public void setBloodBankName(String bloodBankName) {
        BloodBankName = bloodBankName;
    }

    public String getDonorType() {
        return DonorType;
    }

    public void setDonorType(String donorType) {
        DonorType = donorType;
    }

    public String getDonationDate() {
        return DonationDate;
    }

    public void setDonationDate(String donationDate) {
        DonationDate = donationDate;
    }

    void displayDonationDetails() {
        System.out.println("Donation Details");
        System.out.println(" name" + getName());
        System.out.println("DateOfBirth" + getDateOfBirth());
        System.out.println("Gender" + getGender());
        System.out.println("MobileNumber" + getMobileNumber());
        System.out.println("BloodGroup" + getBloodGroup());
        System.out.println("DonationDate" + getDonationDate());
        System.out.println("BloodBankName" + getBloodBankName());
        System.out.println("DonorType" + getDonorType())

    }
}



public class TEST2 {
    public static void main(String[] args) {
        Doner Doner = new Doner();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String Name = sc.next();
        System.out.println("Enter Date Of Birth");
        String DOB = sc.next();
        System.out.println("Enter Gender");
        String Gen = sc.next();
        System.out.println("Enter Mobile Number");
        String MOB = sc.next();
        System.out.println("Enter Blood Group");
        String BG = sc.next();
        System.out.println("Enter Blood Bank Name");
        String BANKNAME = sc.next();
        System.out.println("Enter Donor Type");
        String DType = sc.next();
        System.out.println("Enter Donation Date");
        String DonDate = sc.next();
    }
}

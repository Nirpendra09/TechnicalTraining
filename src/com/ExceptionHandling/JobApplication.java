package com.ExceptionHandling;
import java.util.regex.*;

class InvalidException extends Exception {
    public InvalidException(String str) {
        super(str);
    }
}
public class JobApplication {
    String ApplicantName;
    String ApplicantEmail;
    String ApplicantPhone;
    String ApplicantAadhaar;
    String ApplicantDrivingLicense;

    public JobApplication(String ApplicantName, String ApplicantEmail, String ApplicantPhone,
                          String ApplicantAadhaar, String ApplicantDrivingLicense) {
        this.ApplicantName = ApplicantName;
        this.ApplicantEmail = ApplicantEmail;
        this.ApplicantPhone = ApplicantPhone;
        this.ApplicantAadhaar = ApplicantAadhaar;
        this.ApplicantDrivingLicense = ApplicantDrivingLicense;
        try {
            if (isValid()) {
                System.out.println("Application Successful");
            }
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        JobApplication jobApplication = new JobApplication(
                "Rajesh",
                "rajesh@gmail.com",
                "9888888888",
                "2234 5678 9012",
                "RJ-1320120123456");
    }

    public boolean isValid() throws InvalidException {
        if (!isValidName(ApplicantName)) {
            throw new InvalidException("Invalid Name");
        }
        if (!isValidEmail(ApplicantEmail)) {
            throw new InvalidException("Invalid Email");
        }
        if (!isValidPhone(ApplicantPhone)) {
            throw new InvalidException("Invalid Phone");
        }
        if (!isValidAadhaarNumber(ApplicantAadhaar)) {
            throw new InvalidException("Aadhaar Number is Invalid");
        }
        if (!isValidDrivingLicenseNumber(ApplicantDrivingLicense)) {
            throw new InvalidException("Driving License Number is Invalid");
        }
        return true;
    }

    public boolean isValidName(String ApplicantName) {
        Pattern p = Pattern.compile("[a-zA-Z]{3,}");
        Matcher m = p.matcher(ApplicantName);
        return m.matches();
    }

    public boolean isValidEmail(String ApplicantEmail) {
        Pattern p = Pattern.compile("[a-zA-Z0-9]{3,}@[a-zA-Z0-9]{3,}.[a-zA-Z0-9]{3,}");
        Matcher m = p.matcher(ApplicantEmail);
        return m.matches();
    }

    public boolean isValidPhone(String ApplicantPhone) {
        Pattern p = Pattern.compile("[0-9]{10}");
        Matcher m = p.matcher(ApplicantPhone);
        return m.matches();
    }

    public boolean isValidAadhaarNumber(String str) {
        String regex = "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";

        Pattern p = Pattern.compile(regex);

        if (str == null) {
            return false;
        }

        Matcher m = p.matcher(str);

        return m.matches();
    }

    public boolean isValidDrivingLicenseNumber(String str) {
        String regex = "^(([A-Z]{2}[0-9]{2})" + "( )|([A-Z]{2}-[0-9]"
                + "{2}))((19|20)[0-9]" + "[0-9])[0-9]{7}$";

        Pattern p = Pattern.compile(regex);

        if (str == null) {
            return false;
        }
        Matcher m = p.matcher(str);

        return m.matches();
    }
}

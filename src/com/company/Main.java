package com.company;

public class Main {

    public static void main(String[] args) {

        String patientName = "Stacey Manson";
        boolean hasInsurance = false;
        double temp = 102.2;
        int numVisits = 5;
        float coPay = 300.97f;
        String nextAppointment = "January 12, 2021";
        String contactNum = "555-555-5555";
        
        System.out.println("Patient Details:");
        System.out.println("Name: " + patientName);
        System.out.println("Patient has insurance: " + hasInsurance);
        System.out.println("Body temperature: " + temp);
        System.out.println("Number of visits: " + numVisits);
        System.out.println("Copay Amount: " + coPay);
        System.out.println("Next Appointment Date: " + nextAppointment);
        System.out.println("Contact Number: " + contactNum);
            }
    }

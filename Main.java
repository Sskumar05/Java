import java.util.*;

class Person {
	int id;
	String name;
	int age;
	String gender;
}

class Patient extends Person {
	String disease;

	public Patient(int id, String name, int age, String gender, String disease) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.disease = disease;
	}
}

class Doctor extends Person {
	String specialization;

	public Doctor(int id, String name, int age, String gender, String specialization) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.specialization = specialization;
	}
}

class Appointment {

	int appointmentId;
	int patientId;
	int doctorId;
	String phoneNo;
	String location;
	String date;

	public Appointment(int appointmentId, int patientId, int doctorId, String phoneNo, String location, String date) {
		this.appointmentId = appointmentId;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.phoneNo = phoneNo;
		this.location = location;
		this.date = date;
	}
}

public class Main {

	static Scanner sc = new Scanner(System.in);
	static List<Patient> patients = new ArrayList<>();
	static List<Doctor> doctors = new ArrayList<>();
	static List<Appointment> appointments = new ArrayList<>();

	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("\n-----------------------HOSPITAL MANAGEMENT SYSTEM-----------------------");
			System.out.println("1. Add Patient");
			System.out.println("2. Add Doctor");
			System.out.println("3. Add Appointment");
			System.out.println("4. View Patient Details");
			System.out.println("5. View Doctor Details");
			System.out.println("6. View Appointment Details");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1 -> addPatient();
			case 2 -> addDoctor();
			case 3 -> addAppointment();
			case 4 -> viewPatients();
			case 5 -> viewDoctors();
			case 6 -> viewAppointments();
			case 7 -> System.out.println("Exiting... Thank you!");
				default -> System.out.println("Invalid choice!");
			}
		} while (choice != 7);
	}

	static void addPatient() {
		System.out.print("Enter Patient ID: ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Gender: ");
		String gender = sc.nextLine();

		System.out.print("Enter Disease: ");
		String disease = sc.nextLine();

		Patient p = new Patient(id, name, age, gender, disease);
		patients.add(p);
		System.out.println("Patient added successfully!");
	}

	static void addDoctor() {
		System.out.print("Enter Doctor ID: ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Gender: ");
		String gender = sc.nextLine();

		System.out.print("Enter Specialization: ");
		String specialization = sc.nextLine();

		Doctor d = new Doctor(id, name, age, gender, specialization);
		doctors.add(d);
		System.out.println("Doctor added successfully!");
	}

	static void addAppointment() {
		System.out.print("Enter Appointment ID: ");
		int appointmentId = sc.nextInt();

		System.out.print("Enter Patient ID: ");
		int patientId = sc.nextInt();

		System.out.print("Enter Doctor ID: ");
		int doctorId = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Phone Number: ");
		String phoneNo = sc.nextLine();

		System.out.print("Enter Location: ");
		String location = sc.nextLine();

		System.out.print("Enter Date (dd-mm-yyyy): ");
		String date = sc.nextLine();

		Appointment a = new Appointment(appointmentId, patientId, doctorId, phoneNo, location, date);
		appointments.add(a);
		System.out.println("Appointment added successfully!");
	}

	static void viewPatients() {
		System.out.println("\n--- Patient Details ---");
		for (Patient p : patients) {
			System.out.println("ID: " + p.id + ", Name: " + p.name + ", Age: " + p.age + ", Gender: " + p.gender + ", Disease: " + p.disease);
		}
	}

	static void viewDoctors() {
		System.out.println("\n--- Doctor Details ---");
		for (Doctor d : doctors) {
			System.out.println("ID: " + d.id + ", Name: " + d.name + ", Age: " + d.age + ", Gender: " + d.gender + ", Specialization: " + d.specialization);
		}
	}

	static void viewAppointments() {
		System.out.println("\n--- Appointment Details ---");
		for (Appointment a : appointments) {
			System.out.println("Appointment ID: " + a.appointmentId + ", Patient ID: " + a.patientId + ", Doctor ID: " + a.doctorId +
			                   ", Phone: " + a.phoneNo + ", Location: " + a.location + ", Date: " + a.date);
		}
	}
}

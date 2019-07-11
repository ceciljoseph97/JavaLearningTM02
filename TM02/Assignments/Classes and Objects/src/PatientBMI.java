/* Design a class that can be used by a health care professional to keep track of a patient’s
 *  vital statistics. The following are the details.
Name of the class - Patient
Member Variables - patientName(String),height(double),width(double)
Member Function - double computeBMI()
The above method should compute the BMI and return the result. The formula for computation of BMI  is
 weight (in kg) ÷ height*height(in metres).
Create an object of the Patient class and check the results.*/
class Patient{
	private String patientName;
	private double height;
	private double weight;
	public double computeBMI() {
		return (weight/(height*height)*703);
	}
	Patient(String patientName,double weight,double height){
		this.patientName=patientName;
		this.height=height;
		this.weight=weight;
		}
}
public class PatientBMI {
	public static void main(String[] args) {
		Patient patient = new Patient("Oliver C Joseph", 100,179 );
		System.out.println(patient.computeBMI());
	}
}

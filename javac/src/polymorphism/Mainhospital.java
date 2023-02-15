class Hospital
{
	void treat()
	{
	System.out.println("Lab is ready for treatment");
	}
}
class Cardiology extends Hospital
{
	void treat()
	{
	System.out.println("Cardiology treatment is going on");
	}
}
class Orthopedic extends Hospital
{
	void treat()
	{
	System.out.println("Orthopodic treatment is going on");
	}
}
class Neurology extends Hospital
{
	void treat()
	{
	System.out.println("Neurology treatment is going on");
	}
}
class Patients
{
	static void disease(Hospital H)
	{
	H.treat();
	}
}
class Mainhospital
{
	public static void main(String[] args)
	{
	Cardiology C= new Cardiology();
	Orthopedic O= new Orthopedic();
	Neurology N= new Neurology();
	Patients.disease(C);
	Patients.disease(O);
	Patients.disease(N);
	}
}

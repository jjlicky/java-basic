class SinivelCap
{
	public void take() {System.out.println("Cure sinivel");}
}

class SneezeCap
{
	public void take() {System.out.println("Cure sneeze");}
}

class SnuffleCap
{
	public void take() {System.out.println("Cure snuffle");}
}

class ColdPatient
{
	public void takeSinivelCap(SinivelCap cap){cap.take();}
	public void takeSneezeCap(SneezeCap cap){cap.take();}
	public void takeSnuffleCap(SnuffleCap cap){cap.take();}
}

class Encapsulation1
{
	public static void main(String[] args)
	{
		ColdPatient snuffer = new ColdPatient();
		snuffer.takeSinivelCap(new SinivelCap());
		snuffer.takeSneezeCap(new SneezeCap());
		snuffer.takeSnuffleCap(new SnuffleCap());
	}
}
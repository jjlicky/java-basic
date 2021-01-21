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

class CONTAC600
{
	SinivelCap sin;
	SneezeCap sne;
	SnuffleCap snu;

	public CONTAC600()
	{
		sin = new SinivelCap();
		sne = new SneezeCap();
		snu = new SnuffleCap();
	}
	public void take()
	{
		sin.take();
		sne.take();
		snu.take();
	}
}

class ColdPatient
{
	public void takeCONTAC600(CONTAC600 cap){cap.take();}
}

class Encapsulation2
{
	public static void main(String[] args)
	{
		ColdPatient snuffer = new ColdPatient();
		snuffer.takeCONTAC600(new CONTAC600());
	}
}
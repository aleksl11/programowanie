

class Trojkat extends Figura implements IFigury{
	float wys=0;
	float podst=0;
	Trojkat(float wys,float podst,String kolor){
		
		this.wys = wys;
		this.podst = podst;
		super.kolor = kolor;
	}
	String opis(){
		return "Trojkat o wymairach: "+wys+" x "+podst;
	}
	void skaluj(float skala){
		wys=wys*skala;
		podst=podst*skala;
	}

	@Override
	public float getPowierzchnia() {
		return wys*podst/2;
	}

	@Override
	public boolean wPolu(Punkt p) {
		return false;
	}
}

class Prostokat extends Figura implements IFigury{
	float wys=0;
	float szer=0;
	
	Prostokat(float wys,float szer,String kolor){
		this.wys = wys;
		this.szer = szer;
		super.kolor = kolor;
	}
	String opis(){
		return "Prostokat o wymairach: "+szer+" x "+wys;
	}
	void skaluj(float skala){
		szer=szer*skala;
		wys=wys*skala;
	}

	@Override
	public float getPowierzchnia() {
		return wys*szer;
	}

	@Override
	public boolean wPolu(Punkt p) {
		return false;
	}
}
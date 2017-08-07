package questao4;

public class Bit {

	private boolean[] bits;
	private int tamArray;
	private boolean bit;

	public Bit(int tamArray) {
		this.tamArray = tamArray;
		this.bits = new boolean[tamArray];
	}

	//
	// public void setBits(boolean[] bits){
	// this.bits = bits;
	// }
	
	public void setBits1(boolean bit){
		this.bit = bit;
	}
	
	public void setBits2(boolean bit){
		this.bit = bit;
	}

	public boolean getAcessaBit(int index) {
		return this.bits[index];
	}

	public void setAcessaBit(boolean bit, int index) {
		this.bits[index] = bit;
	}

	public Bit opeAND(Bit b) throws TamDeBitException { // &&
		Bit resp = new Bit(bits.length);
		if (bits.length != b.getBits().length) {
			for (int k = 0; k < bits.length; k++) {
				bits[k] = bits[k] && b.getBits()[k];
				throw new TamDeBitException("O tamanho do array tá o mesmo\n!");
			}
			for (int k = 0; k < bits.length; k++) {
				resp.getBits()[k] = bits[k] && b.getBits()[k];
			}
		}
		return resp;
	}

	public boolean[] getBits() {
		return this.bits;
	}

	public Bit opeOR(Bit b) throws TamDeBitNaoException { // ||
		Bit resp = new Bit(bits.length);
		if (bits.length != b.getBits().length) {
			for (int k = 0; k < bits.length; k++) {
				bits[k] = bits[k] || b.getBits()[k];
				throw new TamDeBitNaoException("Mesmo tamanho de array\n!");
			}
			for (int k = 0; k < bits.length; k++) {
				resp.getBits()[k] = bits[k] || b.getBits()[k];
			}
		}
		return resp;
	}

	public Bit opeNOT(Bit b) throws TamDeBitSimException {// !
		Bit resp = new Bit(bits.length);
		if (bits.length != b.getBits().length) {
			for (int k = 0; k < bits.length; k++) {
				bits[k] = !(b.getBits()[k]);
				throw new TamDeBitSimException("É o mesmo tamanho!\n");
			}
			for (int k = 0; k < bits.length; k++) {
				resp.getBits()[k] = !(b.getBits()[k]);
			}
		}
		return resp;
	}

	public String toString() {
		String resp = "";
		if (bits.length != 0) {
			for (int k = 0; k < bits.length; k++) {
				resp = "Bit: "+ bits[k];
			}
		} else {
			resp = "Array é nulo!";
		}
		return resp;
	}
}

package questao4;

import java.util.List;

public class Bit {

	private boolean[] bits;
	private int tamArray;

	public Bit(int tamArray) {
		this.tamArray = tamArray;
	}

	// public boolean[] getBits(){
	// return bits;
	// }
	//
	// public void setBits(boolean[] bits){
	// this.bits = bits;
	// }

	public boolean getAcessaBit(int index) throws BitNaoExisteException {
		for(int k=0; k<bits.length; k++){
		if(bits[k] != true && bits[k] != false){
			throw new BitNaoExisteException("Não existe mais bit");			
		    }
		}
		return bits[index];			
    }

	public void setAcessaBit(boolean bit, int index) {
		this.bits[index] = bit;
	}
	
	public boolean opeAND(boolean index){ // &&
		for(int k=0; k<bits.length; k++){
			if(bits[k] == true && bits[k-1] == false){
			    return false;	
			}
		}
		return true;
	}
	
	public boolean opeOR(boolean bites){ // ||
		return false;

	}
	
	public boolean opeNOT(boolean bites){// !
		return false;
	}

	public String toString() {
		return "Array de bits: " + bits;
	}
}

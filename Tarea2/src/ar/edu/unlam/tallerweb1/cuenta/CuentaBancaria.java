package ar.edu.unlam.tallerweb1.cuenta;

public class CuentaBancaria {
	
	
	private double saldo;
	
	public CuentaBancaria(double saldo){
		
		this.saldo=saldo;
		
	}

	public double consultarSaldo(){
		
    	return saldo;
					
	}
	
	public void depositarSaldo(double monto){

		this.saldo = monto+this.saldo;   
	}
	
	public boolean extraer( double monto){
		
		if (puedoExtraer(monto)){
			
			this.saldo= monto-this.saldo;
			return true;
		}
			
		return false;
	}
	
	private boolean puedoExtraer(double monto)
	
	{ 
				
		return (monto>0 && monto<= this.saldo);
		
	} 
			

}

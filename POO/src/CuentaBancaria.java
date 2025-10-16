package ejercicio09;
//clase cuenta bancaria 

public class CuentaBancaria {

	// atributos 

	private String cbu;
	private double saldo;
	private Persona titular;
	private TipoCuenta tipo;




	// constructor

	public CuentaBancaria(String cbu, double Saldo, Persona titular , TipoCuenta tipo) {

		this.tipo = tipo;
		this.titular = titular;
		this.saldo = 0.0;
		this.cbu = generarCbu();





	}

	//metodo 


	public double obtenerSaldo() {

		return saldo;


	}
	public void depositar(double monto) {

		if(monto > 0) {

			saldo += monto;


		}



	}
	public boolean extraer(double monto) {

		if(monto > 0 && saldo >= monto) {

			saldo -= monto ;

			return true;


		}

		return false;

	}

	public String generarCbu() {








	}






}




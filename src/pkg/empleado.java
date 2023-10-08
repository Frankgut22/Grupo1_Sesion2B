package pkg;

public class empleado {
	
	public enum TipoEmpleado {Vendedor, Encargado, Otro};


	public float calculoNominaBruta(TipoEmpleado tipo, float ventaMes, float horaExtra) {
		float salarioBase=0, prima=0, extras=0;
		final int PRECIO_HE=30;
		
		//determinar salario base
		if(tipo==TipoEmpleado.Vendedor) 
			salarioBase=2000;
			else if(tipo==TipoEmpleado.Encargado)
				salarioBase=2500;
			else 
				salarioBase=1500;
		
		if(ventaMes>=1500)
			prima=200;
			else if(ventaMes>=1000)
				prima=100;
			else
				prima=ventaMes;
		extras=horaExtra*PRECIO_HE;
		
		return salarioBase+ prima+ extras;
	}
	
	
	public float calculNominaNeta(float nominaBruta) {
		float retencion=0;
		if(nominaBruta>2500)
			retencion=0.18f*nominaBruta;
		if	(nominaBruta>2100)
			 retencion=0.15f*nominaBruta;
		return retencion;
	}
	
}

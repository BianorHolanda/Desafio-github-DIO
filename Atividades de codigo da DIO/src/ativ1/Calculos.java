package ativ1;
//m�todos para a Calculadora
public class Calculos {
	public static void soma(double n1,double n2) {
		double resultado= n1+n2;
		System.out.println("a soma de "+n1+ " mais "+ n2+ " �: " +resultado);
	}
	public static void subtracao(double n1,double n2) {
		double resultado= n1-n2;
		System.out.println("a subtra��o de "+ n1+" menos "+n2+" �: "+resultado);
	}
	public static void multiplicacao(double n1,double n2) {
		double resultado= n1*n2;
		System.out.println("a multiplica��o de "+ n1+" e "+n2+" �: "+resultado);
	}
	public static void divisao(double n1,double n2) {
		double resultado= n1/n2;
		System.out.println("a divis�o de "+ n1+" por "+n2+" �: "+resultado);
	}
	
	//--------------------------------------------------------------------------------------------------
	
	//m�todo para obter uma mensagem com base na hora
	public static void obterMensagem(int hora) {
		switch(hora) {
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
			mensagemBomDia();
			break;
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
			mensagemBoaTarde();
			break;
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
		case 1:
		case 2:
		case 3:
		case 4:
			mensagemBoaNoite();
			break;
			default:
				System.out.println("Hora inv�lida");
		}
	}
	//m�todos utilizados no metodo obterHora
	private static void mensagemBoaNoite() {
		System.out.println("Boa noite");
		
	}
	private static void mensagemBoaTarde() {
		System.out.println("Boa tarde");
		
	}
	private static void mensagemBomDia() {
		System.out.println("Bom dia");
	}
	//-----------------------------------------------------------------------------------------------------------------
	
	public static void CalculoDoEmprestimo(double valor,int parcelas) {
		if(parcelas==2) {
			double valorFinal=valor+(valor*getTaxaTacaDuasParcelas());
			System.out.println("O valor final para o empr�stimo de duas parcelas ser�: "+valorFinal);
		}else if(parcelas==3) {
			double valorFinal=valor+(valor*getTaxaTresParcelas());
			System.out.println("O valor final para o empr�stimo de tr�s parcelas ser�: "+valorFinal);
		}else {
			System.out.println("Quantidade de parcelas n�o aceita");
		}
	}
	
	private static double getTaxaTacaDuasParcelas() {
		// TODO Auto-generated method stub
		return 0.3;
	}
	private static double getTaxaTresParcelas() {
		// TODO Auto-generated method stub
		return 0.45;
	}
	private static int getTresParcelas() {
		// TODO Auto-generated method stub
		return 3;
	}
	private static int getDuasParcelas() {
		// TODO Auto-generated method stub
		return 2;
	}
	//------------------------------------------------------------------------------------------------------------------
	//m�todo main
	public static void main(String[] args) {
		//Calculadora
		System.out.println("Exerc�cio Calculadora");
		
		Calculos.soma(5, 7);
		Calculos.subtracao(10, 5);
		Calculos.multiplicacao(4, 7);
		Calculos.divisao(50, 20);
		
		//Mensagem
		System.out.println("Ecerc�cio Mensagem");
		Calculos.obterMensagem(15);
		Calculos.obterMensagem(7);
		Calculos.obterMensagem(20);
		
		//Empr�stimo
		System.out.println("Exerc�cio Empr�stimo");
		Calculos.CalculoDoEmprestimo(1000, getDuasParcelas());
		Calculos.CalculoDoEmprestimo(1000, getTresParcelas());
		Calculos.CalculoDoEmprestimo(1000, 5);
	}

}

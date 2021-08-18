package controller;

public class ControllerInverte {

	public ControllerInverte() {
		super();
	}
	
	public String inverter(String string, int index) {
		//condi��o de parada quando o indice for igual a );
		if (index == 0) {
			return "";
		} else { 
			return string.substring(index - 1, index) + inverter(string, index - 1);
		}
	}
}

/*
	
	Para construir a string invertida, � necess�rio obter um caractere por vez a partir do fim da cadeia.
	Para conquistar isso usando String.substring, � necess�rio obter a pen�ltima posi��o e a �ltima em cada itera��o, 
	ex: "casa".substring(2,3) => a.
	Se decrementarmos o index a cada itera��o, podemos empilhar at� que cheguemos ao index 0, onde concatenaremos 
	um caractere nulo.
*/
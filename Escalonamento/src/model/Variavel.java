package model;

public class Variavel {

	public boolean[] white;
	public boolean[] read;
	public String[] atualizacao;
	
	public Variavel() {
		
		for(int i=0;i<10;i++)	
			white[i]=false;	
	
		for(int i=0;i<10;i++)	
			read[i]=false;	
	}
}
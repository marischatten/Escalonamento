package model;

public class verificaEscalonamento {


////w1(x) w1(y) r2(u) w2(x) r2(y) w2(y) c2 w1(z) c1
	
	public static void main(String[] args) {
		
		int resultado;	
		int time=1;
		
		Verifica verifica =new Verifica();
			
		Transacao t1 = new Transacao();
		Transacao t2 = new Transacao();
		
		Variavel x = new Variavel();
		Variavel y = new Variavel();
		Variavel u = new Variavel();
		Variavel z = new Variavel();
		
		t1.variavel[0]= x;
		t1.variavel[1]= y;
		t1.variavel[2]= u;
		t1.variavel[3]= z;
		
		t2.variavel[0]= x;
		t2.variavel[1]= y;
		t2.variavel[2]= u;
		t2.variavel[3]= z;
		
		//Inserindo historia
		
		t1.variavel[0].white[time]=true;
		time++;
		t1.variavel[1].white[time]=true;
		time++;
		t2.variavel[2].read[time]=true;
		time++;
		t2.variavel[0].read[time]=true;
		time++;
		t2.variavel[1].read[time]=true;
		time++;
		t2.variavel[1].white[time]=true;
		time++;
		t2.commit=true;
		time++;
		t1.variavel[0].white[time]=true;
		time++;
		t1.commit=true;
		time++;
		/*
		//Inserindo log
		t1.variavel[0].read[this.time]=true;
		this.time++;
		t1.variavel[0].atualizacao[0]="X-20";
		this.time++;
		t1.variavel[0].white[this.time]=true;
		this.time++;
		
		t2.variavel[0].read[this.time]=true;
		this.time++;
		t2.variavel[0].atualizacao[0]="X+10";
		this.time++;
		t2.variavel[0].white[this.time]=true;
		this.time++;
		
		t1.variavel[1].read[this.time]=true;
		this.time++;
		t1.variavel[1].atualizacao[0]="Y+20";
		this.time++;
		t1.variavel[1].white[this.time]=true;
		this.time++;
		*/
		//T1
		
		resultado=verifica.verifica(t1,t2);
		if(resultado==1) {
			System.out.println("É serializável!");
		}else {
			System.out.println("Não é serializável!");
		}
		
	
	}
	

	
}

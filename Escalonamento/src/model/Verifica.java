package model;

public class Verifica {
	
	public int time;

	public int verifica(Transacao t1,Transacao t2) {
		
		this.time=0;
		while(this.time==10) {
			
			if(t1.variavel[0].read[this.time]==true) {
				if(!(t1.variavel[0].white[this.time+1]==true)) {
					return 0;
				}
			}
			this.time++;
		}
	
		this.time=0;
		while(this.time==10) {
			
			if(t1.variavel[1].read[this.time]==true) {
				if(!(t1.variavel[1].white[this.time+1]==true)) {
					return 0;
				}
			}
			this.time++;
		}
		
		this.time=0;
		while(this.time==10) {
			
			if(t1.variavel[2].read[this.time]==true) {
				if(!(t1.variavel[2].white[this.time+1]==true)) {
					return 0;
				}
			}
			this.time++;
		}
		
		this.time=0;
		while(this.time==10) {
			
			if(t1.variavel[3].read[this.time]==true) {
				if(!(t1.variavel[3].white[this.time+1]==true)) {
					return 0;
				}
			}
			this.time++;
		}
		
		//T2
		
		
		this.time=0;
		while(this.time==10) {
			
			if(t2.variavel[0].read[this.time]==true) {
				if(!(t2.variavel[0].white[this.time+1]==true)) {
					return 0;
				}
			}
			this.time++;
		}
		
		this.time=0;
		while(this.time==10) {
			
			if(t2.variavel[1].read[this.time]==true) {
				if(!(t2.variavel[1].white[this.time+1]==true)) {
					return 0;
				}
			}
			this.time++;
		}
		
		this.time=0;
		while(this.time==10) {
			
			if(t2.variavel[2].read[this.time]==true) {
				if(!(t2.variavel[2].white[this.time+1]==true)) {
					return 0;
				}
			}
			this.time++;
		}
		
		this.time=0;
		while(this.time==10) {
			
			if(t2.variavel[3].read[this.time]==true) {
				if(!(t2.variavel[3].white[this.time+1]==true)) {
					return 0;
				}
			}
			this.time++;
		}
	
		return 1;
	}	
	


}

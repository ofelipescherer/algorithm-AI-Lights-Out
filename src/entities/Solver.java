package entities;

import java.util.Collection;

import entities.structures.StackQueueInterface;

public class Solver {

	 State inicialState;
	 StackQueueInterface stackQueueInterface;
	
	 
	 public Solver(State aInicialState, StackQueueInterface aStackQueueInterface) {
		 this.inicialState = aInicialState;
		 this.stackQueueInterface = aStackQueueInterface;
		 this.stackQueueInterface.push(this.inicialState);
	 }
	
	 public State solve() {
		 
		 while(stackQueueInterface.size()>0) {

			 State s = stackQueueInterface.pop();
			 System.out.println("TESTANDO ESTADO");
			 System.out.println(s);
			 if(s.isObjective()) {
				 System.out.println("-------------ENCONTROU SOLUCAO----------");
				 System.out.println(s);
				 
				 return s;
			 }
			 Collection<State> filhos = s.makeChildren();
			 for(State filho: filhos) {
				 stackQueueInterface.push(filho);
			 }
			 

		 }
		 
		 System.out.println("nao encontrou solucao");
		 
		 return null;
	 }
}

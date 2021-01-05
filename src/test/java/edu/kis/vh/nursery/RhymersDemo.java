package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

class RhymersDemo {

	public static final int SECOND_ELEMENT = 1;
	public static final int FIRST_ELEMENT = 0;
	public static final int BOUND = 20;
	public static final int SIXTINTH_ELEMENT = 15;
	public static final int FOURTH_ELEMENT = 3;

	public static void main(String[] args) {
		RhymersFactory factory = new DefaultRhymersFactory();
		
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFifoRhymer(), factory.getHanoiRhymer()};
		
		for (int i = SECOND_ELEMENT; i < SIXTINTH_ELEMENT; i++)
			for (int j = FIRST_ELEMENT; j < FOURTH_ELEMENT; j++)
				rhymers[j].countIn(i);
		
		java.util.Random rn = new java.util.Random();
		for (int i = SECOND_ELEMENT; i < SIXTINTH_ELEMENT; i++)
			rhymers[FOURTH_ELEMENT].countIn(rn.nextInt(BOUND));
		
		for (int i = FIRST_ELEMENT; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}
		
		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[FOURTH_ELEMENT]).reportRejected());
		
	}
	
}
package sef.module4.activity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

public class PlayingCardTest1 extends TestCase {
	
	Log logger = LogFactory.getLog(this.getClass());
	
	public void testPlayingCard() {	
		try{
		PlayingCard card1 = new PlayingCard(PlayingCard.ACE, PlayingCard.SPADES);
		assertEquals(PlayingCard.ACE, card1.getNumber());
		assertEquals(PlayingCard.SPADES, card1.getSuit());
		assertEquals("ACE OF SPADES", card1.toString().toUpperCase());
		
		PlayingCard card2 = new PlayingCard(PlayingCard.KING, PlayingCard.DIAMONDS);
		assertEquals(PlayingCard.KING, card2.getNumber());
		assertEquals(PlayingCard.DIAMONDS, card2.getSuit());
		assertEquals("KING OF DIAMONDS", card2.toString().toUpperCase());
		
		PlayingCard card3 = new PlayingCard(PlayingCard.THREE, PlayingCard.HEARTS);
		assertEquals(PlayingCard.THREE, card3.getNumber());
		assertEquals(PlayingCard.HEARTS, card3.getSuit());
		assertEquals("THREE OF HEARTS", card3.toString().toUpperCase());
	
		PlayingCard card4 = new PlayingCard(PlayingCard.THREE, -1);
		assertEquals(PlayingCard.JOKER, card4.getNumber());
		assertEquals(PlayingCard.JOKER, card4.getSuit());
		assertEquals("JOKER", card4.toString().toUpperCase());
		
		PlayingCard card5 = new PlayingCard(-1, PlayingCard.JACK);
		assertEquals(PlayingCard.JOKER, card5.getNumber());
		assertEquals(PlayingCard.JOKER, card5.getSuit());
		assertEquals("JOKER", card5.toString().toUpperCase());
	
		PlayingCard card6 = new PlayingCard();
		assertEquals(PlayingCard.JOKER, card6.getNumber());
		assertEquals(PlayingCard.JOKER, card6.getSuit());
		assertEquals("JOKER", card6.toString().toUpperCase());
		}
		catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			logger.error(sef.module.percentage.Percentage.setFailedCount(true,1));
		}
	}
}

package Mockito;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.InOrder;

public class TestSpeakingClock {

	@Test
	public void testGetTime() {

		Time time = new Time();
		String result = "sample";

		Clock clock = mock(Clock.class);
		SpeakingClockEngine spe = mock(SpeakingClockEngine.class);
		SpeechSynthesizer ss = mock(SpeechSynthesizer.class);

		when(clock.getTime()).thenReturn(time);
		when(spe.asSpeech(time)).thenReturn(result);

		SpeakingClock speakingClock = new SpeakingClock(spe, ss, clock);

		speakingClock.tellTheTime();

		verify(clock).getTime();
		verify(spe).asSpeech(time);
		verify(ss).speak(result);

		InOrder inOrder = inOrder(clock, spe, ss);
		inOrder.verify(clock).getTime();
		inOrder.verify(spe).asSpeech(time);
		inOrder.verify(ss).speak(result);

	}

}

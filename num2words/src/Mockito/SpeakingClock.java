package Mockito;


public class SpeakingClock {
	
	SpeakingClockEngine spe;
	SpeechSynthesizer ss;
	Clock clock;
	
	public SpeakingClock(SpeakingClockEngine spe, SpeechSynthesizer ss,
			Clock clock) {
		this.spe = spe;
		this.ss = ss;
		this.clock = clock;
	}

	public void tellTheTime(){
		Time time = clock.getTime();
		String result = spe.asSpeech(time);
		ss.speak(result);
		
	}

}

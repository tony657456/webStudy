package Chap09;

public class TourGuide {
	private Providable tour;
	
	public TourGuide(String location) {
		if(location.equals("korean")) {
			tour = new KoreanTour();
		}else {
			tour = new JapanTour();
		}
	}
	
	public void doLeisureSprots() {
		tour.leisureSporsts();
	}
	
	public void doSightseeing() {
		tour.sightseeing();
	}
	
	public void eatFood() {
		tour.food();
	}
}

 package cPU;

public class CPU {
		private int speed;
		String brand;
		private double oc;
		int getSpeed(){
			return speed;
		}
		double getOc() {
			return oc;
		}
		String getBrand() {
			return brand;
		}
		public void setSpeed(int speed){
			this.speed=speed;
		}
		public void setOc(double oc) {
			this.oc=oc;
		}
}

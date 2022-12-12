package Car_Manager;

public class Car {

	public int idCar;
	public String typeCar;
	public String modelCar;
	
	
	public Car() {
		// TODO Auto-generated constructor stub
	}


	public int getIdCar() {
		return idCar;
	}


	public void setIdCar(int idCar) {
		this.idCar = idCar;
	}


	public String getTypeCar() {
		return typeCar;
	}


	public void setTypeCar(String typeCar) {
		this.typeCar = typeCar;
	}


	public String getModelCar() {
		return modelCar;
	}


	public void setModelCar(String modelCar) {
		this.modelCar = modelCar;
	}
	public String messageText(String type, String model) {
		String msg="Type Car : "+type+" Model Car : "+model;
		return msg;
	}

}

package tickettools;

public class Ticket {
	private String company;

	private String departureCode;
	private String departureLocation;

	private String arrivalCode;
	private String arrivalLocation;

	private String departureDate;
	private String departureTime;

	private String arrivalDate;
	private String arrivalTime;

	private int transfersCount;
	private int price;

	//Constructor, could be refactored by Builder pattern
	public Ticket(String company,
				  String departureCode,
				  String departureLocation,
				  String arrivalCode,
				  String arrivalLocation,
				  String departureDate,
				  String departureTime,
				  String arrivalDate,
				  String arrivalTime,
				  int transfersCount,
				  int price
				  ) {
		this.company = company;
		this.departureCode = departureCode;
		this.departureLocation = departureLocation;
		this.arrivalCode = arrivalCode;
		this.arrivalLocation = arrivalLocation;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.arrivalDate = arrivalDate;
		this.arrivalTime = arrivalTime;
		this.transfersCount = transfersCount;
		this.price = price;
	}

	//Getters
	public String getCompany(){
		return this.company;
	}

	public String getDepartureCode(){
		return this.departureCode;
	}

	public String getDepartureLocation(){
		return this.departureLocation;
	}

	public String getArrivalCode() {
		return this.arrivalCode;
	}

	public String getArrivalLocation() {
		return this.arrivalLocation;
	}

	public String getDepartureDate() {
		return this.departureDate;
	}

	public String getDepartureTime() {
		return this.departureTime;
	}

	public String getArrivalDate() {
		return arrivalDate;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public int getTransfersCount() {
		return transfersCount;
	}

	public int getPrice() {
		return price;
	}

	public String getInto() {
		return
				"Имя компании: " + getCompany() + "\n" +
				getDepartureCode() + " " +
				getDepartureLocation() + "\n" +
				"Дата вылета: " + getDepartureDate() + "\n" +
				"Время вылета: " + getDepartureTime() + "\n" +
				getArrivalCode() + " " +
				getArrivalLocation() + "\n" +
				"Дата прибытия: " + getArrivalDate() + "\n" +
				"Время прибытия: " + getArrivalTime() + "\n" +
				"Пересадки: " + getTransfersCount() + "\n" +
				"Стоимость: " + getPrice() + "\n";
	}

	//Setters

}

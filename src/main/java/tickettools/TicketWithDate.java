package tickettools;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TicketWithDate<Calendar> {
	//В данный момент не используется
	//static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM HH:mm");

	private String company;

	private String departureCode;
	private String departureLocation;
	private Calendar departureDateTime;

	private String arrivalCode;
	private String arrivalLocation;
	private Calendar arrivalDateTime;

	private int transfersCount;
	private int price;

	//Стандартный конструктор
	public TicketWithDate(String company, String departureCode, String departureLocation, Calendar departureDateTime, String arrivalCode, String arrivalLocation, Calendar arrivalDateTime, int transfersCount, int price) {
		this.company = company;
		this.departureCode = departureCode;
		this.departureLocation = departureLocation;
		this.departureDateTime = departureDateTime;
		this.arrivalCode = arrivalCode;
		this.arrivalLocation = arrivalLocation;
		this.arrivalDateTime = arrivalDateTime;
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

	public Calendar getDepartureDateTime() {
		return this.departureDateTime;
	}

	public String getArrivalCode() {
		return this.arrivalCode;
	}

	public String getArrivalLocation() {
		return this.arrivalLocation;
	}

	public Calendar getArrivalDateTime() {
		return this.arrivalDateTime;
	}

	public int getTransfersCount() {
		return transfersCount;
	}

	public int getPrice() {
		return price;
	}

	//возвращает строку с текстовой информацией по билету
	public String getInto() {
		return
			"Имя компании: " + getCompany() + "\n" +
			getDepartureCode() + " " +
			getDepartureLocation() + "\n" +
			"Вылет: " + getDepartureDateTime().toString() + "\n" +
			getArrivalCode() + " " +
			getArrivalLocation() + "\n" +
			"Прибытие: " + getArrivalDateTime().toString() + "\n" +
			"Пересадки: " + getTransfersCount() + "\n" +
			"Стоимость: " + getPrice() + "\n";
	}
}

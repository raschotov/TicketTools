package tickettools;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.List;

public class JsonParser {
	//дефолтный путь для json, файл не имеет вложенных классов
	static File jsonFile = new File("./src/main/resources/tickets.json");
	static GsonBuilder gsonBuilder = new GsonBuilder();
	static Gson gson = gsonBuilder.create();
	static JsonReader jsonReader;

	public static List<Ticket> parseTickets() throws FileNotFoundException {
		jsonReader = new JsonReader(new FileReader(jsonFile));
		Type listOfTickets = new TypeToken<List<Ticket>>() {}.getType();
		return gson.fromJson(jsonReader, listOfTickets);
	}

	public static void changeJsonFile(String newFile) {
		//переопределение стандартного пути для парсинга json
		jsonFile = new File(newFile);
	}

	public static List<Calendar> parseCalendar() throws FileNotFoundException {
		jsonReader = new JsonReader(new FileReader(jsonFile));
		Type calendar = new TypeToken<List<Calendar>>() {}.getType();
		return gson.fromJson(jsonReader, calendar);
	}

	//Вариант парсера для json с вложенными классами Calendar
	public static List<TicketWithDate> parseTicketWithDate() throws FileNotFoundException {
		jsonReader = new JsonReader(new FileReader(jsonFile));
		Type ticketWithDate = new TypeToken<List<TicketWithDate>>() {}.getType();
		return gson.fromJson(jsonReader, ticketWithDate);
	}
}

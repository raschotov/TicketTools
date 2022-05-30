package tickettools;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        JsonParser jsonParser;

        List<Ticket> parsedTickets = JsonParser.parseTickets();
        parsedTickets.forEach(s -> System.out.println(s.getInto()));

        showDates();
        showTicketsWithDates();
    }

    public static void showDates() throws FileNotFoundException {
        //Парсит dates.json на предмет наличия данных для инстансов Calendar
        //текущий вывод:
        //Sun Jun 05 12:34:56 MSK 2022
        //Thu Dec 01 13:13:13 MSK 2022
        JsonParser.changeJsonFile("./src/main/resources/dates.json");
        List<Calendar> parsedCalendar = JsonParser.parseCalendar();
        parsedCalendar.forEach(s -> System.out.println(s.getTime()));
    }

    public static void showTicketsWithDates() throws FileNotFoundException {
        //Парсит json со вложенными объектами Calendar
        JsonParser.changeJsonFile("./src/main/resources/ticketswithdates.json");
        List<TicketWithDate> tickets = JsonParser.parseTicketWithDate();
        tickets.forEach(s -> System.out.println(s.getInto()));
    }
}

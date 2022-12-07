package es.examen.jms_unidad2;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import es.examen.jms_unidad2.event_objects.Event;
import es.examen.jms_unidad2.event_utils.Json;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class Launcher
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static void main(String[] args)
    {
        ObjectMapper mapper = Json.mapper();

        try
        {

            //Convert a JSON string to a Event
            List<Event> eventList = mapper.readValue(Paths.get("src/main/resources/3788741.json").toFile(), new TypeReference<List<Event>>() {});

            for(Event event : eventList)
            {
                System.out.println(event.toString());
            }
        }
        catch (IOException ioException)
        {
            ioException.printStackTrace();
            LOGGER.error("Error al parsear json");
        }
    }

}

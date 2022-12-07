package es.examen.jms_unidad2.event_utils;

public class EventException extends Exception
{
    public EventException()
    {
        super();
    }

    public EventException(String message)
    {
        super(message);
    }

    public EventException(String message, Throwable exception)
    {
        super(message,exception);
    }
}

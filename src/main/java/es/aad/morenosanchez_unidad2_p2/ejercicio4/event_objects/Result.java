package es.aad.morenosanchez_unidad2_p2.ejercicio4.event_objects;

public class Resultado
{
    private String event_uuid;
    private int temmate_number;
    private int no_teammate_number;

    public String getEvent_uuid()
    {
        return this.event_uuid;
    }

    public void setEvent_uuid(String event_uuid)
    {
        this.event_uuid = event_uuid;
    }

    public int getTemmate_number()
    {
        return this.temmate_number;
    }

    public void setTemmate_number(int temmate_number)
    {
        this.temmate_number = temmate_number;
    }

    public int getNo_teammate_number()
    {
        return this.no_teammate_number;
    }

    public void setNo_teammate_number(int no_teammate_number)
    {
        this.no_teammate_number = no_teammate_number;
    }

    @Override
    public String toString()
    {
        return "Resultado{" +
                "event_uuid='" + event_uuid + '\'' +
                ", temmate_number=" + temmate_number +
                ", no_teammate_number=" + no_teammate_number +
                '}';
    }
}

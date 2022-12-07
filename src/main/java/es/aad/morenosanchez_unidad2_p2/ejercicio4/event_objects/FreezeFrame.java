package es.examen.jms_unidad2.event_objects;

import java.util.List;

public class FreezeFrame
{
    private boolean teammate;
    private boolean actor;
    private boolean keeper;
    private List<Double> location;

    public boolean isTeammate()
    {
        return teammate;
    }

    public void setTeammate(boolean teammate)
    {
        this.teammate = teammate;
    }

    public boolean isActor()
    {
        return actor;
    }

    public void setActor(boolean actor)
    {
        this.actor = actor;
    }

    public boolean isKeeper()
    {
        return keeper;
    }

    public void setKeeper(boolean keeper)
    {
        this.keeper = keeper;
    }

    public List<Double> getLocation()
    {
        return location;
    }

    public void setLocation(List<Double> location)
    {
        this.location = location;
    }

    @Override
    public String toString()
    {
        return "FreezeFrame{" +
                "teammate=" + teammate +
                ", actor=" + actor +
                ", keeper=" + keeper +
                ", location=" + location +
                '}';
    }
}

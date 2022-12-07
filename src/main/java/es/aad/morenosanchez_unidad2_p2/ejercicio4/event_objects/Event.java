package es.examen.jms_unidad2.event_objects;

import java.util.List;
public class Event
{
    private String event_uuid;
    private List<Double> visible_area;
    private List<FreezeFrame>freeze_frame;

    public String getEvent_uuid()
    {
        return event_uuid;
    }

    public void setEvent_uuid(String event_uuid)
    {
        this.event_uuid = event_uuid;
    }

    public List<Double> getVisible_area()
    {
        return visible_area;
    }

    public void setVisible_area(List<Double> visible_area)
    {
        this.visible_area = visible_area;
    }

    public List<FreezeFrame> getFreeze_frame()
    {
        return freeze_frame;
    }

    public void setFreeze_frame(List<FreezeFrame> freeze_frame)
    {
        this.freeze_frame = freeze_frame;
    }

    @Override
    public String toString()
    {
        return "Event{" +
                "event_uuid='" + event_uuid + '\'' +
                ", visible_area=" + visible_area +
                ", freeze_frame=" + freeze_frame +
                '}';
    }
}

public class Event extends Task {

    protected String startTime;
    protected String endTime;

    public Event(String description, String startTime, String endTime) {
        super(description);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String getTypeOfTask() {
        return "E";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (from: " + this.startTime + " to: " + this.endTime + ")";
    }

    @Override
    public String getDetailsToSave() {
        return super.description + " /from " + this.startTime + " /to " + this.endTime;
    }
}

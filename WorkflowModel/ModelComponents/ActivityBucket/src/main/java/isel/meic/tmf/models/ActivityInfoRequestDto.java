package isel.meic.tmf.models;

public class ActivityInfoRequestDto {
    public String activityName;
    public IterationsDto iterations;
    public String containerImage;
    public TaskDto task;
    public PortDto[] ports;
    public String[] constants;
    public MappingDto[] mappingsTaskArguments;
    public MappingDto[] mappingsTaskResults;
}

public class Performance {
    
    private String performanceID;
    private String performanceName;
    private String performanceLeadName;
    private String performanceGroup;

    public Performance(String performanceID, String performanceName, String performanceLeadName, char performanceGroup2){
        this.performanceID = performanceID;
        this.performanceName = performanceName;
        this.performanceLeadName = performanceLeadName;
        this.performanceGroup = performanceGroup;
    }

    public void setPerformanceID(String performanceID){
        this.performanceID = performanceID;
    }

    public String getPerformanceID(){
        return performanceID;
    }

    public void setPerformanceName(String performanceName){
        this.performanceName = performanceName;
    }

    public String getPerformanceName(){
        return performanceName;
    }

    public void setPerformanceLeadName(String performanceLeadName){
        this.performanceLeadName = performanceLeadName;
    }

    public String getPerformanceLeadName(){
        return performanceLeadName;
    }

    public void setPerformanceGroup(String performanceGroup){
        this.performanceGroup = performanceGroup;
    }

    public String getPerformanceGroup(){
        return performanceGroup;
    }
}

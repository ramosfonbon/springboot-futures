package ramosfonbon.hilos.model;

/**
 * @author Victor Ramos ramosfonbon@gmail.com
 */
public class SimpleResponse {
    private String requestStatus;
    private int processId;

    public SimpleResponse(String requestStatus, int processId) {
        this.requestStatus = requestStatus;
        this.processId = processId;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public int getProcessId() {
        return processId;
    }

    public void setProcessId(int processId) {
        this.processId = processId;
    }

    @Override
    public String toString() {
        return "SimpleResponse{" +
                "requestStatus='" + requestStatus + '\'' +
                ", processId='" + processId + '\'' +
                '}';
    }
}

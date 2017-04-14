package pojos;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by gaurav.garg on 29-03-2017.
 */

public class TopicDetail implements Serializable {
    @SerializedName("topicName")
    @Expose
    private String topicName;
    @SerializedName("topicFileName")
    @Expose
    private String topicFileName;
    @SerializedName("topicId")
    @Expose
    private String topicId;
    @SerializedName("type")
    @Expose
    private String type;

    /**
     * No args constructor for use in serialization
     *
     */
    public TopicDetail() {
    }

    /**
     *
     * @param topicId
     * @param type
     * @param topicFileName
     * @param topicName
     */
    public TopicDetail(String topicName, String topicFileName, String topicId, String type) {
        super();
        this.topicName = topicName;
        this.topicFileName = topicFileName;
        this.topicId = topicId;
        this.type = type;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicFileName() {
        return topicFileName;
    }

    public void setTopicFileName(String topicFileName) {
        this.topicFileName = topicFileName;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

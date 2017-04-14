package pojos;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by gaurav.garg on 30-03-2017.
 */

public class VideosList implements Serializable {
    @SerializedName("lectureId")
    @Expose
    private String lectureId;
    @SerializedName("lectureName")
    @Expose
    private String lectureName;
    @SerializedName("lectureShortName")
    @Expose
    private String lectureShortName;
    @SerializedName("topicDetail")
    @Expose
    private List<TopicDetail> topicDetail = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public VideosList() {
    }

    /**
     *
     * @param lectureShortName
     * @param lectureId
     * @param topicDetail
     * @param lectureName
     */
    public VideosList(String lectureId, String lectureName, String lectureShortName, List<TopicDetail> topicDetail) {
        super();
        this.lectureId = lectureId;
        this.lectureName = lectureName;
        this.lectureShortName = lectureShortName;
        this.topicDetail = topicDetail;
    }

    public String getLectureId() {
        return lectureId;
    }

    public void setLectureId(String lectureId) {
        this.lectureId = lectureId;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public String getLectureShortName() {
        return lectureShortName;
    }

    public void setLectureShortName(String lectureShortName) {
        this.lectureShortName = lectureShortName;
    }

    public List<TopicDetail> getTopicDetail() {
        return topicDetail;
    }

    public void setTopicDetail(List<TopicDetail> topicDetail) {
        this.topicDetail = topicDetail;
    }
}

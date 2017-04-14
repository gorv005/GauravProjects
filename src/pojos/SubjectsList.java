package pojos;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by gaurav.garg on 29-03-2017.
 */

public class SubjectsList implements Serializable {

    @SerializedName("subjectId")
    @Expose
    private String subjectId;
    @SerializedName("subjectname")
    @Expose
    private String subjectname;
    @SerializedName("subjectPrice")
    @Expose
    private String subjectPrice;
    @SerializedName("videoCount")
    @Expose
    private Integer videoCount;
    @SerializedName("conceptCount")
    @Expose
    private Integer conceptCount;
    @SerializedName("numericalCount")
    @Expose
    private Integer numericalCount;

    /**
     * No args constructor for use in serialization
     *
     */
    public SubjectsList() {
    }

    /**
     *
     * @param videoCount
     * @param numericalCount
     * @param subjectId
     * @param subjectPrice
     * @param subjectname
     * @param conceptCount
     */
    public SubjectsList(String subjectId, String subjectname, String subjectPrice, Integer videoCount, Integer conceptCount, Integer numericalCount) {
        super();
        this.subjectId = subjectId;
        this.subjectname = subjectname;
        this.subjectPrice = subjectPrice;
        this.videoCount = videoCount;
        this.conceptCount = conceptCount;
        this.numericalCount = numericalCount;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public String getSubjectPrice() {
        return subjectPrice;
    }

    public void setSubjectPrice(String subjectPrice) {
        this.subjectPrice = subjectPrice;
    }

    public Integer getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(Integer videoCount) {
        this.videoCount = videoCount;
    }

    public Integer getConceptCount() {
        return conceptCount;
    }

    public void setConceptCount(Integer conceptCount) {
        this.conceptCount = conceptCount;
    }

    public Integer getNumericalCount() {
        return numericalCount;
    }

    public void setNumericalCount(Integer numericalCount) {
        this.numericalCount = numericalCount;
    }
}

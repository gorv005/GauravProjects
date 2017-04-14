package pojos;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by gaurav.garg on 29-03-2017.
 */

public class SubjectDetail implements Serializable {
    @SerializedName("subjectId")
    @Expose
    private String subjectId;
    @SerializedName("subjectName")
    @Expose
    private String subjectName;
    @SerializedName("subjectShortName")
    @Expose
    private String subjectShortName;
    @SerializedName("conceptsList")
    @Expose
    private List<ConceptsList> conceptsList = null;
    @SerializedName("numericalsList")
    @Expose
    private List<NumericalsList> numericalsList = null;
    @SerializedName("videosList")
    @Expose
    private List<VideosList> videosList = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public SubjectDetail() {
    }

    /**
     *
     * @param subjectName
     * @param subjectId
     * @param numericalsList
     * @param videosList
     * @param subjectShortName
     * @param conceptsList
     */
    public SubjectDetail(String subjectId, String subjectName, String subjectShortName, List<ConceptsList> conceptsList, List<NumericalsList> numericalsList, List<VideosList> videosList) {
        super();
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.subjectShortName = subjectShortName;
        this.conceptsList = conceptsList;
        this.numericalsList = numericalsList;
        this.videosList = videosList;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectShortName() {
        return subjectShortName;
    }

    public void setSubjectShortName(String subjectShortName) {
        this.subjectShortName = subjectShortName;
    }

    public List<ConceptsList> getConceptsList() {
        return conceptsList;
    }

    public void setConceptsList(List<ConceptsList> conceptsList) {
        this.conceptsList = conceptsList;
    }

    public List<NumericalsList> getNumericalsList() {
        return numericalsList;
    }

    public void setNumericalsList(List<NumericalsList> numericalsList) {
        this.numericalsList = numericalsList;
    }

    public List<VideosList> getVideosList() {
        return videosList;
    }

    public void setVideosList(List<VideosList> videosList) {
        this.videosList = videosList;
    }

}

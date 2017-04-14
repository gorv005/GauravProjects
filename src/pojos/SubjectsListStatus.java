package pojos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by gaurav.garg on 29-03-2017.
 */

public class SubjectsListStatus implements Serializable {
    @SerializedName("action")
    @Expose
    private String action;
    @SerializedName("flag")
    @Expose
    private Integer flag;
    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("data")
    @Expose
    private ArrayList<SubjectsList> data = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public SubjectsListStatus() {
    }

    /**
     *
     * @param flag
     * @param data
     * @param action
     * @param msg
     */
    public SubjectsListStatus(String action, Integer flag, String msg, ArrayList<SubjectsList> data) {
        super();
        this.action = action;
        this.flag = flag;
        this.msg = msg;
        this.data = data;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ArrayList<SubjectsList> getData() {
        return data;
    }

    public void setData(ArrayList<SubjectsList> data) {
        this.data = data;
    }


}

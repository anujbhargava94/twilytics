
package com.ir.twilytics.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FacetResponseHeader implements Serializable
{

    @SerializedName("status")
    @Expose
    private Long status;
    @SerializedName("QTime")
    @Expose
    private Long qTime;
    @SerializedName("params")
    @Expose
    private Params params;
    private final static long serialVersionUID = 1585777828093674111L;

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getQTime() {
        return qTime;
    }

    public void setQTime(Long qTime) {
        this.qTime = qTime;
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

}

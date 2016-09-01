package com.owner.util.event;

import com.owner.util.TimeUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created with PMS
 * User : Tim.Yao
 * Date : 2016/8/16.
 */
@Getter
@Setter
public class Body {
    @JsonProperty("t")
    private long timestamp = TimeUtils.currentMillis();
    @JsonProperty("p")
    private Payload payload;

    @JsonCreator
    public Body(@JsonProperty(value = "p", required = true) Payload payload) {
        this.payload = payload;
    }
}

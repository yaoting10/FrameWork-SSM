package com.owner.util.event;

/**
 * Created with PMS
 * User : Tim.Yao
 * Date : 2016/8/16.
 */
public final class BodyHelper {
    public static Body getEventBody(Payload payload) {
        Body body = new Body(payload);
        return body;
    }
}

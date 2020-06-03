package org.ms.webrtc.common;

import lombok.*;
import org.ms.utils.supper.SupperUtilsClient;


/**
 * 事件格式
 *
 * @param <T>
 */

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Event {

    // 设备
    private Device device;
    // 注册结果
    private boolean registered_result;
    // 事件类型
    private String event_type;
    // 事件ID
    private String event_id;

    // 通话类型
    // 视频
    // 语音
    private String call_type;
    // 发送者的id
    private String sender_user_id;
    // 接收者id
    private String receive_user_id;

    //agree 同意 true
    //refuse 拒绝 false
    private boolean call_result;

    // sdp
    private SessionDescription sessionDescription;
    // ice
    private IceCandidate iceCandidate;

    public String toJson() {
        return SupperUtilsClient.getUtils().getGsonUtils().toJson(this);
    }

    public static final String VIDEO = "_video";
    public static final String VOICE = "_voice";


    /**
     * 初始化注册信息
     */
    public static final String EVENT_INIT_REQUEST = "__event_init_request";


    /**
     * 初始化结果响应
     */
    public static final String EVENT_INIT_RESPONSE = "__event_init_response";


    /**
     * 发送邀请事件
     */
    public static final String EVENT_OFFER = "__event_offer";


    /**
     * 应答事件
     */
    public static final String EVENT_ANSWER = "__event_answer";

}
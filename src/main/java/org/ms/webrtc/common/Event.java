package org.ms.webrtc.common;


import lombok.*;


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
public class Event<T> {
    // 事件类型
    private String event_type;
    // 事件ID
    private String event_id;
    // 事件数据
    private T data;

    /**
     * 连接
     */
    public static final String EVENT_CONNECT = "__event_connect";

    /**
     * 初始化注册信息
     */
    public static final String EVENT_INIT = "__event_init";
    /**
     * 被邀请
     */
    public static final String EVENT_INVITE = "__event_invite";
    /**
     * 取消
     */
    public static final String EVENT_CANCEL = "__event_calcel";

    /**
     * 响铃
     */
    public static final String EVENT_RING = "__event_ring";
    /**
     * 进入房间
     */
    public static final String EVENT_PEERS = "__event_peers";

    /**
     * 新人入房间
     */
    public static final String EVENT_NEW_PEERS = "__event_new_peers";
    /**
     * 拒绝接听
     */

    public static final String EVENT_REJECT = "__event_reject";

    /**
     * offer 主动邀请
     */
    public static final String EVENT_OFFER = "__event_offer";
    /**
     * answer 被邀请
     */

    public static final String EVENT_ANSWER = "__event_answer";
    /**
     * ice-candidate
     */
    public static final String EVENT_ICE_CANDIDATE = "__event_ice_candidate";
    /**
     * 离开房间
     */
    public static final String EVENT_LEAVE = "__event_leave";
    /**
     * 切换到语音
     */
    public static final String EVENT_AUDIO = "__event_audio";
    /**
     * 意外断开
     */
    public static final String EVENT_DISCONNECT = "__event_disconnect";
}

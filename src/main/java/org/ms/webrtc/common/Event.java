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
}

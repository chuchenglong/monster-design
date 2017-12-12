package com.mc.Adapter;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 适配器模式(Adapter Pattern)
 * step1: 媒体播放器，仅支持声音播放
 * @create 2017/11/28 16:31
 * @since v0.1
 */
public interface MediaPlayer {
    public void play(String audioType, String fileName);
}

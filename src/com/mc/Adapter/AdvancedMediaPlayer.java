package com.mc.Adapter;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 适配器模式(Adapter Pattern)
 * step2: 高级媒体播放器，支持vlc和mp4格式播放
 * @create 2017/11/28 16:34
 * @since v0.1
 */
public interface AdvancedMediaPlayer {
    public void playVlc(String fileName);
    public void playMp4(String fileName);
}

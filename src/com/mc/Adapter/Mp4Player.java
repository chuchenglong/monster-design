package com.mc.Adapter;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 适配器模式(Adapter Pattern)
 * step3: mp4文件播放
 * @create 2017/11/28 16:36
 * @since v0.1
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("play mp4 : " + fileName);
    }
}

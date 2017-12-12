package com.mc.Adapter;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 适配器模式(Adapter Pattern)
 * step5: 适配器，适配高级播放器
 * @create 2017/11/28 16:40
 * @since v0.1
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapter(String audioType) {
        if (audioType.equals("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equals("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equals("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}

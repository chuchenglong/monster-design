package com.mc.Adapter;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 适配器模式(Adapter Pattern)
 * step6: 加入了适配器的媒体播放器
 * @create 2017/11/28 16:58
 * @since v0.1
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("mp3")) {
            System.out.println("play mp3 :" + fileName);
        } else if (audioType.equals("mp4") || audioType.equals("vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("no support !");
        }
    }
}
